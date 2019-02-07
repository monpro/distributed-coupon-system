package com.monpro.passbook.service.impl;

import com.alibaba.fastjson.JSON;
import com.monpro.passbook.ValueObject.CreateMerchantsRequest;
import com.monpro.passbook.ValueObject.CreateMerchantsResponse;
import com.monpro.passbook.ValueObject.PassTemplete;
import com.monpro.passbook.ValueObject.Response;
import com.monpro.passbook.constant.Constants;
import com.monpro.passbook.constant.ErrorCode;
import com.monpro.passbook.dao.MerchantsDao;
import com.monpro.passbook.entity.Merchants;
import com.monpro.passbook.service.IMerchantsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/***
 * <h1>implementation of Merchant Service</h1>
 * developed by MonPro
 */
@Slf4j
@Service
public class MerchantsServImpl implements IMerchantsService {
    /**
     * merchantsDao object to crud data
     */
    private final MerchantsDao merchantsDao;

    /**
     * kafka template
     */
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public MerchantsServImpl(MerchantsDao merchantsDao,
                             KafkaTemplate<String, String> kafkaTemplate) {
        this.merchantsDao = merchantsDao;
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    @Transactional
    public Response createMerchants(CreateMerchantsRequest request) {
        Response response = new Response();
        CreateMerchantsResponse merchantsResponse = new CreateMerchantsResponse();
        ErrorCode errorCode = request.validate(merchantsDao);

        if(errorCode != ErrorCode.SUCCESS){
            merchantsResponse.setId(-1);
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        }else{
            merchantsResponse.setId(merchantsDao.save(request.toMerchants()).getId());
        }

        response.setData(merchantsResponse);
        return response;

    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {
        Response response = new Response();

        Merchants merchants = merchantsDao.findById(id);
        if(merchants == null){
            response.setErrorCode(ErrorCode.MERCHANTS_NOT_EXIST.getCode());
            response.setErrorMsg(ErrorCode.MERCHANTS_NOT_EXIST.getDesc());
        }

        response.setData(merchants);
        return response;
    }

    @Override
    public Response dropPassTemplate(PassTemplete templete) {

        Response response = new Response();
        ErrorCode errorCode = templete.validate(merchantsDao);
        if(errorCode != ErrorCode.SUCCESS){
            response.setErrorMsg(errorCode.getDesc());
            response.setErrorCode(errorCode.getCode());
        }else {
            String passsTemplate = JSON.toJSONString(templete);
            kafkaTemplate.send(
                    Constants.TEMPLATE_TOPIC, //title
                    Constants.TEMPLATE_TOPIC, // key
                    passsTemplate               // value

            );
            log.info("DropPassTemplates: {}",passsTemplate);
        }

        return response;
    }
}


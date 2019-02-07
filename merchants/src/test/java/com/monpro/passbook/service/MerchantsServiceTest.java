package com.monpro.passbook.service;

import com.alibaba.fastjson.JSON;
import com.monpro.passbook.ValueObject.CreateMerchantsRequest;
import com.monpro.passbook.ValueObject.PassTemplete;
import com.monpro.passbook.service.impl.MerchantsServImpl;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * <h1>test class for MerchantsService</h1>
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServiceTest {

    @Autowired
    private IMerchantsService merchantsService;

    @Test
//    @Transactional
    public void testCreateMerchantServ(){
        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("shen");
        request.setLogoUrl("www.shen.com");
        request.setBusinessLicenseUrl("www.shen.com");
        request.setPhone("1234546576");
        request.setAddress("sydney");

        System.out.println(JSON.toJSONString(merchantsService.createMerchants(request)));
    }

    /**
     * {"data":{"address":"sydney","
     * businessLicenseUrl":"www.shen.com",
     * "id":19,"isAudit":false,"logoUrl":"www.shen.com",
     * "name":"shen","phone":"1234546576"},
     * "errorCode":0,"errorMsg":""}
     */
    @Test
    public void testBuildMerchantsInfoById(){
        System.out.println(JSON.toJSONString(merchantsService.buildMerchantsInfoById(19)));
    }

    @Test
    public void testDropPassTemplate(){
        PassTemplete passTemplete = new PassTemplete();
        passTemplete.setId(19);
        passTemplete.setTitle("title: merchants message");
        passTemplete.setSummary("summary: only summary");
        passTemplete.setDesc("desc: only desc");
        passTemplete.setLimit(10000L);
        passTemplete.setHasToken(false);
        passTemplete.setBackground(2);
        passTemplete.setStart(new Date());
        passTemplete.setEnd(DateUtils.addDays(new Date(),10));

        System.out.println(JSON.toJSONString(
                merchantsService.dropPassTemplate(passTemplete)
        ));


    }

}

package com.monpro.passbook.service;

import com.alibaba.fastjson.JSON;
import com.monpro.passbook.vo.CreateMerchantsRequest;
import com.monpro.passbook.vo.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by monpro.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {

    @Autowired
    private IMerchantsServ merchantsServ;

    /**
     * {"data":{"id":7},"errorCode":0,"errorMsg":""}
     * {"data":{"id":8},"errorCode":0,"errorMsg":""}
     * */
    @Test
//    @Transactional
    public void testCreateMerchantServ() {

        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("慕课");
        request.setLogoUrl("www.monpro.com");
        request.setBusinessLicenseUrl("www.monpro.com");
        request.setPhone("1234567890");
        request.setAddress("北京市");

        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }

    /**
     * {"data":{"address":"beijing",
     * "businessLicenseUrl":"www.monpro.com","id":9,"isAudit":false,
     * "logoUrl":"www.monpro.com",
     * "name":"test","phone":"1234567890"},"errorCode":0,"errorMsg":""}
     * */
    @Test
    public void testBuildMerchantsInfoById() {

        System.out.println(JSON.toJSONString(merchantsServ.buildMerchantsInfoById(9)));
    }

    /**
     * DropPassTemplates: {"background":2,"desc":"desc: test",
     * "end":1528202373202,"hasToken":false,"id":9,"limit":10000,
     * "start":1527338373202,"summary":"summary: testClass","title":"title: monpro"}
     * */
    @Test
    public void testDropPassTemplate() {

        PassTemplate passTemplate = new PassTemplate();
        passTemplate.setId(9);
        passTemplate.setTitle("monpro");
        passTemplate.setSummary("summary: testClass");
        passTemplate.setDesc("desc: test");
        passTemplate.setLimit(10000L);
        passTemplate.setHasToken(false);
        passTemplate.setBackground(2);
        passTemplate.setStart(DateUtils.addDays(new Date(), -10));
        passTemplate.setEnd(DateUtils.addDays(new Date(), 10));

        System.out.println(JSON.toJSONString(
                merchantsServ.dropPassTemplate(passTemplate)
        ));
    }
}

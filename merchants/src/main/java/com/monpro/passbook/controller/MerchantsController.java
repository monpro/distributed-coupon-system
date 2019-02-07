package com.monpro.passbook.controller;

import com.alibaba.fastjson.JSON;
import com.monpro.passbook.ValueObject.CreateMerchantsRequest;
import com.monpro.passbook.ValueObject.PassTemplete;
import com.monpro.passbook.ValueObject.Response;
import com.monpro.passbook.service.IMerchantsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <h1>Merchants Service Controller</h1>
 */

@Slf4j
@RestController
@RequestMapping("/merchans")
public class MerchantsController {
    @Autowired
    private IMerchantsService merchantsService;

    @ResponseBody
    @PostMapping("/create")
    public Response createMerchants(@RequestBody CreateMerchantsRequest request){
        log.info("createMerchants: {}", JSON.toJSONString(request));
        return merchantsService.createMerchants(request);
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Response buildMerchantsInfo(@PathVariable Integer id){
        log.info("BuildMerchantsInfo: {}", id);
        return merchantsService.buildMerchantsInfoById(id);

    }
    @ResponseBody
    @PostMapping("/drop")
    public Response dropPassTemplate(PassTemplete passTemplete){
        log.info("DropPassTemplate: {}", passTemplete);
        return merchantsService.dropPassTemplate(passTemplete);
    }

}

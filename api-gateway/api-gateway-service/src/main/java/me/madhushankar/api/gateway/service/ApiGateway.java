package me.madhushankar.api.gateway.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ApiGateway {

    @Resource
    private ImageClient imageClient;

    private PriceClient priceClient;

    @RequestMapping(value = "/mobileproduct", method = RequestMethod.GET)
    public MobileProduct getMobileProduct() {
        return new MobileProduct(priceClient.fetchPrice());
    }

    @RequestMapping(value = "/desktopproduct", method = RequestMethod.GET)
    public DesktopProduct getDesktopProduct() {
        return new DesktopProduct(priceClient.fetchPrice(), imageClient.fetchImageUrl());
    }
}

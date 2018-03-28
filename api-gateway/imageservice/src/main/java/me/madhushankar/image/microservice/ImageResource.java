package me.madhushankar.image.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageResource {

    @RequestMapping(value = "/image-path", method = RequestMethod.GET)
    public String getImagePath() {
        return "/dummy-img.png";
    }
}

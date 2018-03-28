package me.madhushankar.image.microservice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImageResourceTest {

    @Test
    public void testGetImgPathResource() {
        ImageResource imageResource = new ImageResource();
        Assertions.assertThat(imageResource.getImagePath()).isEqualTo("/dummy-img.png");
    }
}

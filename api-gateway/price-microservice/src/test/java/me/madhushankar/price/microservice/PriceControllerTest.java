package me.madhushankar.price.microservice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceControllerTest {

    @Test
    public void testGetPrice() {
        PriceController priceController = new PriceController();
        Assertions.assertThat(priceController.getPrice()).isEqualTo("30");
    }
}

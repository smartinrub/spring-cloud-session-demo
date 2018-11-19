package org.smartinrub.hotelservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HotelController {

    @GetMapping("/hotels")
    public List<Hotel> getOrders() {

        return Arrays.asList(
                new Hotel("Vincci2", 3),
                new Hotel("Malaga Plaza", 5),
                new Hotel("Hostal San Jose", 2));

    }
}

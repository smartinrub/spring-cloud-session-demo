package org.smartinrub.hotelservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hotel {

    public final String name;
    public final int rating;
}

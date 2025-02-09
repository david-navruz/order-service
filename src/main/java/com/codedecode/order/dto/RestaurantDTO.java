package com.codedecode.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestaurantDTO {

    private int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;

}

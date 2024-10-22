package com.codedecode.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTOFromFrontend {

    private List<FoodItemDTO> foodItemsList;
    private Integer userId;
    private RestaurantDTO restaurantDTO;

}

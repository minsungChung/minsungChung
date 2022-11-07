package wjm.wjmproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wjm.wjmproject.domain.Restaurant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantResponse {

    private Long restaurantId;

    private String name;

    private String area;

    private String address;

    private String keyword;

    public static RestaurantResponse from(Restaurant restaurant) {
        RestaurantResponse response = new RestaurantResponse();
        response.restaurantId = restaurant.getId();
        response.name = restaurant.getName();
        response.area = restaurant.getArea();
        response.address = response.getAddress();
        response.keyword = response.getKeyword();
        return response;
    }
}

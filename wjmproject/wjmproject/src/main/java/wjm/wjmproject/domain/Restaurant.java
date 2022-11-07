package wjm.wjmproject.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long id;

    private String name;

    private String area;

    private String address;

    private String keyword;

    public static Restaurant createRestaurant(String name, String area, String address, String keyword) {
        Restaurant restaurant = new Restaurant();
        restaurant.name = name;
        restaurant.area = area;
        restaurant.address = address;
        restaurant.keyword = keyword;
        return restaurant;
    }
}

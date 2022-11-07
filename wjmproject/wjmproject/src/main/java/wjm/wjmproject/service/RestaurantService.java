package wjm.wjmproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wjm.wjmproject.domain.Restaurant;
import wjm.wjmproject.dto.RestaurantCreateRequest;
import wjm.wjmproject.dto.RestaurantResponse;
import wjm.wjmproject.repository.RestaurantRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Transactional
    public void createRestaurant(RestaurantCreateRequest request) {

        Restaurant restaurant = Restaurant.createRestaurant(
                request.getName(),
                request.getArea(),
                request.getAddress(),
                request.getKeyword()
        );

        restaurantRepository.save(restaurant);
    }

    public List<RestaurantResponse> findByArea(String area) {

        List<Restaurant> findRestaurants = restaurantRepository.findByArea(area);

        return findRestaurants.stream()
                .map(RestaurantResponse::from)
                .collect(Collectors.toList());
    }
}

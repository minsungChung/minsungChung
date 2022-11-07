package wjm.wjmproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wjm.wjmproject.dto.RestaurantCreateRequest;
import wjm.wjmproject.dto.RestaurantResponse;
import wjm.wjmproject.dto.RestaurantSearchRequest;
import wjm.wjmproject.service.RestaurantService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping("/restaurants")
    public ResponseEntity<Void> createRestaurant(@RequestBody @Valid RestaurantCreateRequest request) {
        restaurantService.createRestaurant(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/restaurants")
    public ResponseEntity<List<RestaurantResponse>> searchRestaurant(@Valid RestaurantSearchRequest request) {
        List<RestaurantResponse> response = restaurantService.findByArea(request.getArea());
        return ResponseEntity.ok(response);
    }
}

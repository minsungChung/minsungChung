package wjm.wjmproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantSearchRequest {

    @NotBlank(message = "지역은 필수입니다.")
    private String area;
}

package wjm.wjmproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantCreateRequest {

    @NotBlank(message = "이름은 필수입니다.")
    private String name;

    @NotBlank(message = "지역은 필수입니다.")
    private String area;

    @NotBlank(message = "주소는 필수입니다.")
    private String address;

    @NotBlank(message = "키워드는 필수입니다.")
    private String keyword;

}

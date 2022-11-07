package wjm.wjmproject.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {

    private String message;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, String> attributes;

    public static ExceptionResponse from(String message) {
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.message = message;
        return exceptionResponse;
    }

    public static ExceptionResponse from(String message, Map<String, String> errors) {
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.message = message;
        exceptionResponse.attributes = errors;
        return exceptionResponse;
    }
}
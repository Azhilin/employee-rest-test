package alex.enterprise.employeeresttest.core.emuns;

import alex.enterprise.employeeresttest.core.exception.CustomRuntimeException;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@Getter
public enum HttpMethod {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");

    private String value;

    HttpMethod(String value) {
        this.value = value;
    }

    public static HttpMethod getByStringValue(String val) {
        return Arrays.stream(values())
                .filter(item -> Objects.equals(val, item.value))
                .findFirst()
                .orElseThrow(() -> new CustomRuntimeException(String.format("HttpMethod not found with such value: %s", val)));
    }
}

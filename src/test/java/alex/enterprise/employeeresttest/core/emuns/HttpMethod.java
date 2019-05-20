package alex.enterprise.employeeresttest.core.emuns;

import lombok.Getter;

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
}

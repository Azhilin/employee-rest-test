package alex.enterprise.employeeresttest.core.api;

import lombok.Getter;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Getter
public class HttpClient {

    private final RestTemplate restTemplate;

    public HttpClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
}

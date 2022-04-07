package uz.pdp.swaggeruiexample;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class SwaggerUiExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerUiExampleApplication.class, args);
    }

}

package mu.elca.tax.processing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class TaxProcessingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxProcessingApplication.class);
    }

}
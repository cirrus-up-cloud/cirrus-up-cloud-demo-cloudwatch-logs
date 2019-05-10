package cloud.cirrusup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@ImportResource(locations = "classpath:spring-config/applicationContext.xml")
@PropertySource("classpath:properties/config-${spring.profiles.active}.properties")
public class CirrusCloudDemoController {

    private static final Logger LOG = LoggerFactory.getLogger(CirrusCloudDemoController.class);

    @GetMapping("/health")
    public ResponseEntity health() {

        LOG.info("GET /health request.");
        LOG.warn("GET /health request.");

        return ResponseEntity.ok("Status:OK");
    }
}

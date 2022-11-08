package ar.com.repo.APIrest.config;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "documentation.openapi.info")
public class SwaggerConfigurationProperties {

    private String prefix;
    private String title;
    private String description;
    private ContactProperties contact = new ContactProperties();

    @Data
    @NoArgsConstructor
    public class ContactProperties {
        private String email;
        private String name;
    }
}

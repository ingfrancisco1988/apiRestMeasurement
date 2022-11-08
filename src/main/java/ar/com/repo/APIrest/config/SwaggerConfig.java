package ar.com.repo.APIrest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SwaggerConfig {
  @Autowired
  SwaggerConfigurationProperties swaggerConfigurationProperties;

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
            .info(
                    new Info()
                            .title(swaggerConfigurationProperties.getTitle())
                            .description(swaggerConfigurationProperties.getDescription())
                            .termsOfService("http://swagger.io/terms/")
                            .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                            .contact(infoContact()));
  }

  private Contact infoContact() {
    return new Contact()
            .email(swaggerConfigurationProperties.getContact().getEmail())
            .name(swaggerConfigurationProperties.getContact().getName());
  }
}

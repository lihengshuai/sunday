package holiday.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author  by Loki on 17/6/22.
 */
@Configuration
public class TestConfig {

  @Bean
  public Fruit getFruit(){
    return new Fruit();
  }

}

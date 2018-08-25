package holiday.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Loki
 *
 */
public class MainService {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);

    Fruit fruit = (Fruit)context.getBean("getFruit");
    System.out.println(fruit.a);
  }

}

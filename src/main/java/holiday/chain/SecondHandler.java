package holiday.chain;

import org.springframework.stereotype.Component;

/**
 * @author  by Loki on 17/7/12.
 */
@Component
public class SecondHandler implements Handler {

  public void say() {
    System.out.println("this is second !");
  }
}

package holiday.obersver;

import java.util.Observable;
import org.springframework.stereotype.Component;

/**
 * @author  by Loki on 17/7/17.
 */
@Component
public class SecondObs extends ObserverHandler{

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("this is second !");
  }

}

package holiday.obersver;

import java.util.Observable;
import java.util.Observer;
import org.springframework.stereotype.Component;

/**
 * @author by Loki on 17/7/17.
 */
@Component
public abstract class ObserverHandler implements Observer {

  @Override
  public void update(Observable o, Object arg) {
  }
}

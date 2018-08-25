package holiday.obersver;

import java.util.Observable;

/**
 * @author  by Loki on 17/7/17.
 */
public class Subject extends Observable{

  @Override
  public void notifyObservers() {
    setChanged();
    super.notifyObservers();
  }
}

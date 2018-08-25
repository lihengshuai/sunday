package holiday.controller;

import holiday.obersver.ObserverHandler;
import holiday.obersver.Subject;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  by Loki on 17/7/17.
 */
@RestController
public class ObserverController {

  @Autowired
  private List<ObserverHandler> observers;

  @GetMapping("/obs")
  public void execute() {
    Subject subject = new Subject();
    observers.forEach(subject::addObserver);
    subject.notifyObservers();
  }

}

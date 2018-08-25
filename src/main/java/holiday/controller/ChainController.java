package holiday.controller;

import holiday.chain.Handler;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  by Loki on 17/7/12.
 */
@RestController
public class ChainController {

  @Autowired
  private List<Handler> handlers;

  @GetMapping("/chain")
  public void test(){
    handlers.forEach(Handler::say);
  }

}

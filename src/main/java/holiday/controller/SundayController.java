package holiday.controller;

import holiday.annotation.FirstAnnotation;
import holiday.service.WhoKnowService;
import java.time.LocalDateTime;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by Loki on 17/6/5.
 */
@RestController
@RequestMapping("sunday")
public class SundayController {


  private static final Logger logger = LoggerFactory.getLogger(SundayController.class);

  @Autowired
  private WhoKnowService whoKnowService;

  @GetMapping(value = "/first")
  public String getSunday() {

    logger.debug("get some thing to ...");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    StringBuilder builder = new StringBuilder();
    builder.append("hello ").append("world !");
    return builder.toString();
  }

  @GetMapping("/second")
  public void doF() {
    System.out.println(whoKnowService.getClass().getAnnotation(FirstAnnotation.class).name());
    whoKnowService.wfk();
  }


}

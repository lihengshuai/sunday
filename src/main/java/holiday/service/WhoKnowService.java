package holiday.service;

import holiday.annotation.FirstAnnotation;
import holiday.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@FirstAnnotation
@Slf4j
public class WhoKnowService {

  @Autowired
  private HandlePerson handlePerson;

  public void wfk(){
//    log.error("this is a error log !");
    System.out.println("say something !");
    Person person = new Person();
    person.setName("hhas");
    System.out.println(person);
  }



}

package holiday.service;

import holiday.bean.Person;
import holiday.utils.JsonUtils;
import java.util.Optional;
import java.util.stream.Stream;

public class TestOptional {



  public static void main(String[] args) {

    System.out.println(Optional.ofNullable(null));
    Person person = Optional.ofNullable(new Person()).orElseGet(null);

    System.out.println(JsonUtils.toJson(person));

    Stream.of(new Person());

  }

}

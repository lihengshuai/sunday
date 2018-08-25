package holiday.service;

/**
 * Created by Loki on 17/6/12.
 */
public class Apple extends Fruit {

  public int a = 1;

  @Override
  public void get(Fruit fruit){

    System.out.println(fruit.a);
    System.out.println(this.a);
  }


  public static void main(String[] args) {


    Fruit f = new Apple();

    Apple p = new Apple();

    f.get(f);

    p.get(p);
    //p.get(p.a);




  }

}

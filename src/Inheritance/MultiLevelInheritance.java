package Inheritance;

class Car{
  public void carName(){
      System.out.println("Maruthi");
  }
}
class Company extends Car{
public void modelName(){
    System.out.println("Swift");
}
}
class Model extends Company{
    public void topSpeed(){
        System.out.println("90km");
    }

}





public class MultiLevelInheritance {
    public static void main(String[] args){
 Model s = new Model();
 s.carName();
 s.modelName();
 s.topSpeed();
    }
}



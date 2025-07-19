package absrectLearning;
abstract class Car{
    abstract void speed();
    public void drive(){
        System.out.println("it drive cars");
    }
}
class Bmw extends Car{

    @Override
    void speed() {
        System.out.println("speed is of bmw");
    }



}
public class Demo {
    public static void main(String[] args){

        // you cannot create object of abstract class
        Car obj = new Bmw();
        obj.drive();
        obj.speed();
    }
}

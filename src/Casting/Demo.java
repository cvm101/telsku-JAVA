package Casting;

class A{
    public void show1(){
        System.out.println("A class call");
    }
}
class B extends A{
    public void show2(){
        System.out.println("B class call");
    }
}
public class Demo {
    public static void main(String[] args){
        // up casting
        A obj = (A) new B();
        obj.show1();

        //down casting
        B obj1 = (B) obj;
        obj1.show2();

    }
}

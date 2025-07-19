package InnerClass;

class A{

    int age;

    public void show(){
        System.out.println("show of class A");
    }

    class B{
        public void config(){
            System.out.println("This is config");
        }
    }
}

class C{
    public void  show(){
        System.out.println("Shows content of C");
    }


}
public class Demo {
    public static void main(String[] args){
        A obj = new A();
        obj.show();

        // to access B
        A.B obj1 = obj.new B();
        obj1.config();

        C obj2 = new C(){
            public void show(){
                System.out.println("A new show CC");
            }
        };
        obj2.show();


    }
}

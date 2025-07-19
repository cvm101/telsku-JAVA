package learningThreads;

class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            try {
                System.out.println("show the hi");
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            try {
                System.out.println("show the hello");
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Demo {
    public static void main(String[] args){
        A obj1 = new A();
        obj1.start();
        B obj2 = new B();
        obj2.start();
    }
}

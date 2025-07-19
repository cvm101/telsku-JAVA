package funcInterface;

@FunctionalInterface
interface  A{
    void show(int i);
}
@FunctionalInterface
interface B{
    int add(int i , int j);
}
public class Demo {
    public static void main(String[] args){
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("this is lamda example");
//            }
//        };
//        obj.show();

//        A obj1 = () -> {
//                System.out.println("show the lamda function");
//        };
//        obj1.show();


//        --------------------------------

//        A obj = (i) -> {
//            System.out.println("this was the input :" + i);
//        };
//        obj.show(5);


        //     --------------------------------


// function interface which return something

B obj = (i,j) -> {
    return i + j;
        };
        System.out.println((obj.add(6,4)));

    }
}

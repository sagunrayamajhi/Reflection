package lesson1;

/**
 * Created by srayamajhi on 6/25/18.
 */
public class Get_Class_example {
}

class Test{
    public void printClass(Object o){
        Class c = o.getClass();
        System.out.println(c.getName());
    }
}
class Main{
    public static void main(String[] args) {
        Get_Class_example ex = new Get_Class_example();
        Test t = new Test();
        t.printClass(ex);
    }
}


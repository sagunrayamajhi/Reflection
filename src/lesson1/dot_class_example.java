package lesson1;
/**
 * Created by srayamajhi on 6/28/18.
 */

public class dot_class_example{

        public static void display(){
                System.out.println("TEST");
        }
}

class test3 {

        public static void main(String[] args) {
                Class c = dot_class_example.class;
                //dot_class_example ex = c.getClass();
                System.out.println(c.getName());

        }
}

package lesson1;

/**
 * Created by srayamajhi on 6/20/18.
 */
class For_Name_example {
    static {
        System.out.println("Gets Here");
    }
}

class test{
    public static void main(String[] args) {
        try {
            Class c = Class.forName("For_Name_example");
            System.out.println(c.getName());
        }catch (ClassNotFoundException e){System.out.println(e);}
    }
}


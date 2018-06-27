import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by srayamajhi on 10/9/17.
 */
public class test {
    public static void main(String[] args) {
        String str = "a";
//        str =str.trim();
//        str =str.substring(0,str.length()-3);
        System.out.println(str.toUpperCase());
    }
    public static String[] getUdfFields(){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 52 ; i <= 70 ; i++){
            list.add("udf"+i);
        }
        for (int i = 101 ; i <= 112 ; i++){
            list.add("udf"+i);
        }
        return list.toArray(new String[list.size()]);

    }
}

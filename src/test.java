import org.apache.commons.codec.digest.DigestUtils;

import java.io.*;

/**
 * Created by srayamajhi on 10/9/17.
 */
public class test {
    public static void main(String[] args) throws IOException {
        File in = new File("/home/srayamajhi/hash/input.txt");
        File out = new File("/home/srayamajhi/hash/output.txt");
        String salt ="";
        String line;
        BufferedReader input = null;
        BufferedWriter output = null;
        try{
            input = new BufferedReader(new FileReader(in));
            output = new BufferedWriter(new FileWriter(out));
            while ((line = input.readLine()) != null ){
                String key = "";
                if(line.contains("|")){
                    for (String str : line.split("|")){
                        key = key+str.replace("-","");
                    }
                    output.write(key+"|"+DigestUtils.md5Hex(salt+key )+"\n");

                    System.out.println(line);
                }
            }
        }finally {
            input.close();
            output.close();
        }
    }

    public String[] splitLines(String str, String delimeter){
        return str.split(delimeter);
    }
}

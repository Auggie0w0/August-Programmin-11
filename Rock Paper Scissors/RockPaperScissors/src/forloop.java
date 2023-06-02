import java.util.*;
public class forloop {
    public static void main(String[] args) {
        String name = "John Jones";
        for(int i=0; i<name.length(); i++) {
            if(name.substring(i,i+1).equals("J")) {
                System.out.println("index position: " + i + "\t" + name.substring(i, i+1));
            }
        }
    }
}

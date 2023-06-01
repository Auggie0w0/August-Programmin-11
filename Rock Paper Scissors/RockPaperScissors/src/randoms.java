import java.util.Scanner;
public class randoms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int)Math.random()*100; //0 and 1.45345345345345, 45.34
        int choice = Integer.parseInt(scan.next());
        System.out.println(choice);
    }
}


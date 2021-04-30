import java.io.*;
import java.util.*;

public class end_of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(scanner.hasNextLine()){
            System.out.println(++i + " " + scanner.nextLine());
        }
    }
}

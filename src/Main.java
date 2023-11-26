import employee.Manager;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Manager b = new Manager(42,23456, "John J",12);
         System.out.print("\n" + b);
         b.dissmissEnployee();
         b.setName("C J");
        System.out.print(b);
        }
    }

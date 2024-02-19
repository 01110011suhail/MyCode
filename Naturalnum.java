import java.util.Scanner;

public class Naturalnum {
    public static void printNum(int n) {
        if (n > 0) {
            printNum(n - 1);
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for n natural number");
        int n = sc.nextInt();
        printNum(n);
    }

}

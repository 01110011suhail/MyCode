import java.util.Scanner;

/**
 * Even
 */
public class Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
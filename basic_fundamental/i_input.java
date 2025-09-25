import java.util.Scanner;

public class i_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Halo! " + name);

        scanner.close();
    }
}

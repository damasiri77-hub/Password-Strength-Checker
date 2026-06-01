import java.util.Scanner;

public class project {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        int score = 0;

        if (password.length() >= 8)
            score++;

        if (password.matches(".*[A-Z].*"))
            score++;

        if (password.matches(".*[a-z].*"))
            score++;

        if (password.matches(".*\\d.*"))
            score++;

        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*"))
            score++;

        System.out.println("\nPassword Analysis:");

        if (score <= 2) {
            System.out.println("Strength: WEAK");
        } else if (score <= 4) {
            System.out.println("Strength: MEDIUM");
        } else {
            System.out.println("Strength: STRONG");
        }

        sc.close();
        
    }
}
import java.util.Scanner;
public class PasswordLogin {
    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your password?");
        String password = sc.nextLine();

        while (!(password == "")) {

            if (password.equals("Yolo")) {
                System.out.println("You are logged in");
                return;
            } else {
                System.out.println("Wrong input try again");
                counter++;
            }
            if (counter == 3) {
                System.out.println("You surpassed 3 attempts you are locked out");
                break;}

                System.out.println("This is attempt number #" + counter);
                System.out.println("What is your password?");
                password = sc.nextLine();
        }
    }
}

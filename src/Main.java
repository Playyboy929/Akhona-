import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a username");
        String Username = scanner.next();
        boolean isUsernameValid = CheckUsername(Username);

        System.out.println("Please enter a password");
        String password = scanner.next();
        boolean isPasswordValid = CheckPasswordComplexity(password);

        System.out.println("Please enter your cellphone number");
        String CellphoneNumber = scanner.next();
        boolean isCellphoneNumberValid = CheckCellphoneNumberComplexity(CellphoneNumber);
    }

    public static boolean CheckCellphoneNumberComplexity(String CellphoneNumber) {
        if (CellphoneNumber.contains("+27") && CellphoneNumber.length() == 12) {
            System.out.println("Your number is correct.");
        } else {
            System.out.println("Your number is incorrect.");
        }
        return true;
    }

    public static boolean
    CheckUsername(String Username) {
        if (Username.contains("_") && Username.length() > 5){
            System.out.println("Username has been successfully captured. ");
        } else {
            System.out.println("Username does not contain an underscore or is not 5 characters.");
        }
        return true;
    }

    public static boolean
    CheckPasswordComplexity(String Password){
        if (Password.length() > 8){
            System.out.println("Password captured successfully. ");
        }else{
            System.out.println("Password is incorrectly formatted.");
        }

        boolean ContainsUppercase = false;
        boolean Containslowercase = false;
        boolean ContainsNumber = false;
        boolean ContainsSpecialCharacter = false;
        int i = 0;
        if (i< Password.length()){
            char ch = Password.charAt(i);
            if (Character.isUpperCase(ch)){
                ContainsUppercase = true;
            }
            if (Character.isLowerCase(ch)){
                Containslowercase = true;
            }
            if (Character.isDigit(ch)){
                ContainsNumber = true;
            }
            if (!Character.isLetter(ch)&&!Character.isDigit(ch)&&!Character.isWhitespace(ch)){
                ContainsSpecialCharacter = true;
            }
            return true;
        }else{
            return true;
        }


    }
}
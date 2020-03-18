import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(PasswordChecker.class.getName());
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "\n password should exist"


                        + "\n password should be longer than 8 characters"
                        + "\n password should contain lowercase"
                        + "\n password should contain uppercase"
                        + "\n password should contain  one digit"
                        + "\n password should contain special character"

        );
        System.out.println("\n please enter password: ");
        String pass = input.nextLine();
        PasswordChecker word = new PasswordChecker();
        try {

            if(word.password_is_valid(pass)){

            System.out.println("password is correct");
            }
            if(PasswordChecker.passwordIsOk(pass)){
                logger.debug("Password is ok");
            }
            else{logger.debug("Password is not ok");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Scanner;


public class PasswordCheckerLogging {
    private final static Logger LOGGER = LogManager.getLogger(PasswordCheckerLogging.class.getName());

    static boolean passwordExist = true;
    static boolean passwordCharLength = true;
    static boolean passwordLowerCase = true;
    static boolean passwordUpperCase = true;
    static boolean passwordOneDigit = true;
    static boolean passwordOneSpecialChar = true;


    public static String passwordIsValid(String password) {
        String msg = "";
        if (password.isEmpty()) {
            passwordExist = false;
               LOGGER.error("password should exist");
        }
        else if (password.length() < 8 ){
            passwordCharLength = false;
            LOGGER.error( "password should be longer than 8 characters");
        }
        else if (!password.matches((".*[A-Z].*"))){
            passwordUpperCase = true;
            LOGGER.error("password should have at least one uppercase letter");
        }
        else if (!password.matches((".*[a-z].*"))){
            passwordLowerCase = false;
            LOGGER.error("password should have at least one lowercase letter");
        }
        else if (!password.matches((".*[\\d].*"))){
            passwordOneDigit = false;
            LOGGER.error("password should have at least one digit");
        }
        else if (!password.matches((".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*"))){
            passwordOneSpecialChar = false;
            LOGGER.error("password should have at least one special character");
        }
        else{
            LOGGER.error("Password is valid!");
        }
        return msg ;
    }


    public static  boolean passwordIsOk(String password){


        boolean passwordIsOkChecker;


        if (password.length() == 0 && !password.matches((".*[A-Z].*"))) {
            passwordIsOkChecker = false;
            LOGGER.debug("Password not ok!");
        }
        else if (!password.matches((".*[a-z].*")) || !password.matches((".*[\\d].*"))
                   || !password.matches((".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*"))) {
            passwordIsOkChecker = false;
            LOGGER.debug("Password is not ok!");
        }
        else {
            passwordIsOkChecker = true;
            LOGGER.debug("password is ok!");
        }
        return passwordIsOkChecker;
    }
    public static boolean passwordIsNeverOk(String password) {


        if (!(password.length() >= 8)) {
            if (password.isEmpty()) {
                LOGGER.error("Empty passwords are invalid!");
            }
            LOGGER.error("Password must be 8 characters long!");
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(Please Note: Your password shouldn't be empty," +
                "\n must be longer than 8 characters," +
                "\n contains at least one Uppercase,lowercase letter," +
                "\none digit and a special character)");
        System.out.println();
        System.out.println("Please enter your password");
        String userPassword = input.nextLine();
        try {
            LOGGER.debug(passwordIsOk(userPassword));
            LOGGER.error(passwordIsValid(userPassword));
            LOGGER.error(passwordIsNeverOk(userPassword));
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }

    }
}



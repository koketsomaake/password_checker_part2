import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PasswordChecker {
    private static final Logger logger = LogManager.getLogger(PasswordChecker.class.getName());


     static boolean existingPassword = true;
     static boolean passwordLength = true;
     static boolean lowerCase = true;
     static boolean upperCase = true;
     static boolean oneDigit = true;
     static boolean specialChar = true;

    public static boolean password_is_valid(String password) {

        if (password.isEmpty()) {
            existingPassword = false;
            logger.error("password should exist");
        }

        if (password.length() < 8) {
            passwordLength = false;
            logger.error("password should be longer than 8 characters");
        }

        if (!password.matches(".*[a-z].*")) {
            lowerCase = false;
            logger.error("password should contain lowercase");
        }

        if (!password.matches( ".*[A-Z].*")) {
            upperCase = false;
            logger.error("password should contain uppercase");
        }

        if (!password.matches(".*[0-9].*")) {
            oneDigit = false;
            logger.error("password should contain  one digit");
        }
        if (!password.matches(".*[\" !\"#$%&'()*+,-./:;<=>?@\\^_`{|}~\"].*")) {

            specialChar = false;
            logger.error("password should contain special character");
        }
        return lowerCase && specialChar && upperCase && passwordLength && oneDigit && existingPassword;
    }




    public static boolean passwordIsOk(String password){
        int pass = 0;
        if(!password.isEmpty() && password.length() > 8 && password.matches(".*[a-z].*" )) {
        pass = pass + 1;

        logger.error("passwordIsOk");
        }
        else {
        logger.error("password is never ok");
        }
        return true;
        }
}

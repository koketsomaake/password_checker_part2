import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PasswordCheckerTestLog {
    @Test
    public void existingPassword() {

        assertEquals("",PasswordCheckerLogging.passwordIsValid(""));
    }
    @Test
    public  void passwordLength() {
        assertEquals("",
                PasswordCheckerLogging.passwordIsValid("cskviro"));

    }
    @Test
    public  void upperCasePassword() {
        assertEquals("",
                PasswordCheckerLogging.passwordIsValid("bajsuieom"));
    }
    @Test
    public  void lowerCasePassword() {
        assertEquals("",
                PasswordCheckerLogging.passwordIsValid("BAJSUIEOM"));
    }
    @Test
    public  void digitPassword() {
        assertEquals("",
                PasswordCheckerLogging.passwordIsValid("oritjvnvG"));
    }@Test
    public  void passwordSpecialChar() {
        assertEquals("",
                PasswordCheckerLogging.passwordIsValid("Citjvmlsi8"));
    }
    @Test
    public  void passwordIsValid() {
        assertEquals("",
                PasswordCheckerLogging.passwordIsValid("ajroicndX4!"));
    }
    @Test
    public  void passwordIsOk() {
        assertTrue( PasswordCheckerLogging.passwordIsOk("ajroicndX4!"));
    }


    @Test
    public  void passwordIsNeverOk() {
        assertTrue( PasswordCheckerLogging.passwordIsNeverOk("v24679SX"));
    }
}

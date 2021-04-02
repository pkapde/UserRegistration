import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = UserRegistration.validInputName("Prashant");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean firstName = UserRegistration.validInputName("pk");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName = UserRegistration.validInputName("kapade");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean lastName = UserRegistration.validInputName("ka");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean emailId = UserRegistration.validateEmailId("abc@gail.com");
        Assert.assertTrue(emailId);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean emailId = UserRegistration.validateEmailId("abcgail.com");
        Assert.assertFalse(emailId);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("91 9637434565");
        Assert.assertTrue(mobileNumber);
    }
    @Test
    public void givenMobileNumber_WhenImproper_ShouldReturnFalse() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("18605863744");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void givenEightCharacterLongPassword_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastEightCharacterLong = UserRegistration.validatePassword("pkapde3080",UserRegistration.PASSWORD_AT_LEAST_EIGHT_CHARACTER_LONG);
        Assert.assertTrue(passwordAtLeastEightCharacterLong);
    }
    @Test
    public void givenEightCharacterLongPassword_WhenImProper_ShouldReturnFalse() {
        boolean passwordAtLeastEightCharacterLong = UserRegistration.validatePassword("pkapde",UserRegistration.PASSWORD_AT_LEAST_EIGHT_CHARACTER_LONG);
        Assert.assertFalse(passwordAtLeastEightCharacterLong);
    }

    @Test
    public void givenPasswordHasAtLeastOneUpperCaseLetter_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastOneUpperCaseCharacter = UserRegistration.validatePassword("Pkapde308", UserRegistration.PASSWORD_AT_LEAST_ONE_UPPERCASE_CHARACTER);
        Assert.assertTrue(passwordAtLeastOneUpperCaseCharacter);
    }

    @Test
    public void givenPasswordHasAtLeastOneUpperCaseLetter_WhenImproper_ShouldReturnFalse() {
        boolean passwordAtLeastOneUpperCaseCharacter = UserRegistration.validatePassword("pkapde308", UserRegistration.PASSWORD_AT_LEAST_ONE_UPPERCASE_CHARACTER);
        Assert.assertFalse(passwordAtLeastOneUpperCaseCharacter);
    }

    @Test
    public void givenPasswordHasAtLeastOneNumber_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastOneNumber = UserRegistration.validatePassword("Pkapde308", UserRegistration.PASSWORD_AT_LEAST_ONE_Number);
        Assert.assertTrue(passwordAtLeastOneNumber);
    }

    @Test
    public void givenPasswordHasAtLeastOneNumber_WhenProper_ShouldReturnFalse() {
        boolean passwordAtLeastOneNumber = UserRegistration.validatePassword("pkapdevivek", UserRegistration.PASSWORD_AT_LEAST_ONE_Number);
        Assert.assertFalse(passwordAtLeastOneNumber);
    }

    @Test
    public void givenPasswordHasExactlyOneSymbol_WhenProper_ShouldReturnTrue() {
        boolean passwordHasExactlyOneSymbol = UserRegistration.validatePassword("Pkapde308@", UserRegistration.PASSWORD_HAS_EXACTLY_ONE_SYMBOL);
        Assert.assertTrue(passwordHasExactlyOneSymbol);
    }

    @Test
    public void givenPasswordHasExactlyOneSymbol_WhenProper_ShouldReturnFalse() {
        boolean passwordHasExactlyOneSymbol = UserRegistration.validatePassword("pkapde@123", UserRegistration.PASSWORD_HAS_EXACTLY_ONE_SYMBOL);
        Assert.assertFalse(passwordHasExactlyOneSymbol);
    }

}
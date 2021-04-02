
public class UserRegistration {

    static String NAME_PATTERN ="^[A-Z][a-z]{2,}$";
    static String EMAIL_PATTERN = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
    static String MOBILE_NUMBER_PATTERN= "^[0-9]{1,3}[' '][0-9]{10}$";
    static String PASSWORD_AT_LEAST_EIGHT_CHARACTER_LONG="[a-z]{8,}";
    static String PASSWORD_AT_LEAST_ONE_UPPERCASE_CHARACTER="(?=.*[A-Z])[A-Za-z]{8,40}";
    static String PASSWORD_AT_LEAST_ONE_Number="((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z]).{8,40})";
    static String PASSWORD_HAS_EXACTLY_ONE_SYMBOL="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    public static boolean validInputName(String inputName) {
        return inputName.matches(NAME_PATTERN);
    }

    public static boolean validateEmailId(String emailId) {
        return emailId.matches(EMAIL_PATTERN);
    }

    public static boolean validateMobileNumber(String mobileNumber) {
        return mobileNumber.matches(MOBILE_NUMBER_PATTERN);
    }

    public static boolean validatePassword(String passWord , String pattern) {
        return passWord.matches(pattern);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration test cases");
    }

}

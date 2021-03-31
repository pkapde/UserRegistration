import java.util.regex.Pattern;

class UserDetails{

    private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,14}$";
    private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,13}$";
    private static final String EMAIL = "^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]{2,}){1,2}$";
    private static final String MOBILE_NUMBER = "^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    UserRegistration checkString = (((pattern, userInput) -> Pattern.compile(pattern).matcher(userInput).matches()));

    public boolean userFirstName(String firstName) throws UserRegistrationException {
        if (checkString.validate(FIRST_NAME, firstName)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid First Name");
        }
    }

    public boolean userLastName(String lastName) throws UserRegistrationException {
        if (checkString.validate(LAST_NAME, lastName)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Last Name");
        }
    }

    public boolean userEmail(String email) throws UserRegistrationException {
        if (checkString.validate(EMAIL, email)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Email");
        }
    }

    public boolean userMobileNumber(String mobileNumber) throws UserRegistrationException {
        if (checkString.validate(MOBILE_NUMBER, mobileNumber)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Mobile Number");
        }
    }

    public boolean userPassword(String password) throws UserRegistrationException {
        if (checkString.validate(PASSWORD, password)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Password");
        }
    }

}
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class UserRegistraionTest {
    UserDetails user;
    @Before
    public void setup() {
        user = new UserDetails();
    }

    @Test
    public void firstName_WhenTrue() throws UserRegistrationException {
        boolean result = user.userFirstName("Nikhil");
        Assert.assertTrue(result);
    }

    @Test
    public void firstName_WhenFalse() {
        try {
            boolean result = user.userFirstName("Ni");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid First Name", e.getMessage());
        }
    }

    @Test
    public void lastName_WhenTrue() throws UserRegistrationException {
        boolean result = user.userLastName("Kumbhare");
        Assert.assertTrue(result);
    }

    @Test
    public void lastName_WhenFalse() {
        try {
            boolean result = user.userLastName("kumbhare");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Last Name", e.getMessage());
        }
    }

    @Test
    public void email_WhenTrue() throws UserRegistrationException {
        boolean result = user.userEmail("nikhil@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void email_WhenFalse() {
        try {
            boolean result = user.userEmail("nikhil@abc@gmail.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Email", e.getMessage());
        }
    }

    @Test
    public void mobileNumber_WhenTrue() throws UserRegistrationException {
        boolean result = user.userMobileNumber("91 9503800272");
        Assert.assertTrue(result);
    }

    @Test
    public void mobileNumber_WhenFalse() {
        try {
            boolean result = user.userMobileNumber("919823702856");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Mobile Number", e.getMessage());
        }
    }

    @Test
    public void password_WhenTrue() throws UserRegistrationException {
        boolean result = user.userPassword("Nikhil97@");
        Assert.assertTrue(result);
    }

    @Test
    public void password_WhenFalse() {
        try {
            boolean result = user.userPassword("nNikhil@97@");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid Password", e.getMessage());
        }
    }
}

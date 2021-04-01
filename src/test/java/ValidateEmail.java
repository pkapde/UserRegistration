import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidateEmail {
    private UserRegistration userRegistration;
    private String emailId;
    private boolean expectedResult;

    public ValidateEmail(String email, boolean expectedResult) {
        this.emailId = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com,", true}
                , {"abc-100@yahoo.com,", true}
                , {"abc.100@yahoo.com", true}
                , {"abc111@abc.com,", true}
                , {"abc-100@abc.net,", true}
                , {"abc.100@abc.com.au", true}
                , {"abc@1.com,", true}
                , {"abc@gmail.com.com", true}
                , {"abc+100@gmail.com", true}
                , {"abc", false}
                , {"abc@.com.my", false}
                , {"abc123@gmail.a", false}
                , {"abc123@.com", false}
                , {"abc@.com.com", false}
                , {".abc@abc.com", false}
                , {"abc()*@gmail.com", false}
                , {"abc@%*.com", false}
                , {"abc..2002@gmail.com", false}
                , {"abc@abc@gmail.com", true}
                , {"abc@gmail.com.1a", false}});
    }
    @Test
    public void testUserEmailId() {
        Assert.assertEquals(expectedResult,userRegistration.validateEmailId(emailId));
    }
}
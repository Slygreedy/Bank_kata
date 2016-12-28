import org.junit.Test;

//not sure why I need to import hamcrest as included it in the pom???
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class InitialTest {

    @Test
    public void ConvertStringToTime () {
        UserInput userInput = new UserInput("10:01:00");

        String expectedtime = "10:01:00";

        assertThat(userInput.returnTime(), is(equalTo(expectedtime)));
        }
}

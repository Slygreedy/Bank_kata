import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MinuteTest {

    private int minute = 23;
    private Minute minutex = new Minute(minute);

    @Test
    public void convertFiveMinute() {
        String[] ExpectedOutcome = new String[]{"Y", "Y", "R", "Y", "O", "O", "O", "O", "O", "O", "O"};

        assertThat(minutex.getFiveMinuteRow(), is(ExpectedOutcome));
    }

    @Test
    public void convertOneMinute() {
        String[] ExpectedOutcome = new String[]{"Y", "Y", "Y", "O"};

        assertThat(minutex.getOneMinuteRow(), is(ExpectedOutcome));
    }
}



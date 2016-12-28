import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HourTest {

    private int hour = 17;
    //it is better practice to split this so that you know what 17 is i.e. hours
    private Hour hourx = new Hour(hour);

    @Test
    public void convertFiveHour() {
        String[] ExpectedOutcome = new String[] {"R", "R", "R", "O"};

        assertThat(hourx.getFiveHourRow(), is(ExpectedOutcome));
    }

    @Test
    public void convertOneHour() {
        String[] ExpectedOutcome = new String[] {"R", "R", "O", "O"};

        assertThat(hourx.getOneHourRow(), is(ExpectedOutcome));
    }

}

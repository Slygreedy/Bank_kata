import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SecondTest {

    @Test
    public void convertSecond() {
        Second second = new Second(5);

        assertThat(second.getSecond(), is("0"));
    }
}

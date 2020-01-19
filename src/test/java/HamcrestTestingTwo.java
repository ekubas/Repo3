import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HamcrestTestingTwo {

    @Test
    public void given2Strings2_whenEquals_thenCorrect() {
        String firstWord = "Foo";
        String secondWord = "foo";
        System.out.println("Test should be failed");
        assertThat(firstWord, equalTo(secondWord));

    }
}

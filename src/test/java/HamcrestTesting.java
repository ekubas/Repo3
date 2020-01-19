import org.testng.annotations.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.testng.Assert.assertEquals;

public class HamcrestTesting {

    @Test
    public void given2Strings_whenEqual_thenCorrect() {

        String firstString = "foo";
        String secondDtring = "FOO";
        assertThat(firstString, equalToIgnoringCase(secondDtring));
        System.out.print("Test should be passed");
    }

    @Test
    public void givenTwoInt_whenEqual_tehnCorrect() {
        Integer firstNumber = 1;
        Integer secondNumber = 1;
        assertEquals(firstNumber, secondNumber);
        System.out.print("true");
    }

    @BeforeMethod
    public void beforeEachMethod() {
        System.out.print("This should execute before each method ");
    }

    @AfterMethod
    public void afterEachMEthod() {
        System.out.print("This should execute after each method");

    }

    @BeforeClass
    public void beforeClass() {
        System.out.print("This should execute only once before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.print("This should execute only once after class");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This should execute only once before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This should execute only once after suite");
        System.out.println("bla");
        //check for new branch
        //
    }

}

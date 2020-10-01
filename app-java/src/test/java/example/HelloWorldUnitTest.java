package example;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HelloWorldUnitTest {

    @Test
    public void test() {
        new HelloWorld().coveredByUnitTest();
    }

    @Test
    public void test2() {
        new HelloWorld().shouldDefineConstant();
    }

    @Test
    public void test3() {
        String result = new HelloWorld().getWords(5);
        assertThat(result, equalTo("four"));
    }

}

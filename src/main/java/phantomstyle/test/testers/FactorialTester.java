package phantomstyle.test.testers;

import phantomstyle.framework.Assert;
import phantomstyle.framework.annotations.After;
import phantomstyle.framework.annotations.Before;
import phantomstyle.framework.annotations.Test;
import phantomstyle.framework.messengeres.ConsoleMessenger;
import phantomstyle.test.classes.Factorial;

public class FactorialTester {

    private Factorial factorial = new Factorial();
    private Assert anAssert = new Assert(new ConsoleMessenger());

    @Before
    public void init(){
        System.out.println("Initialization FactorialTester...");
    }

    @After
    public void close(){
        System.out.println("Closing FactorialTester...");
        factorial = null;
        anAssert = null;
    }

    @Test
    public void when5Return120(){
        anAssert.assertNotNull(factorial.factorial(5));
    }
}

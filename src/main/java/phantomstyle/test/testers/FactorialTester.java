package phantomstyle.test.testers;

import phantomstyle.framework.Assert;
import phantomstyle.framework.annotations.After;
import phantomstyle.framework.annotations.Before;
import phantomstyle.framework.annotations.Test;
import phantomstyle.framework.messengeres.ConsoleMessenger;
import phantomstyle.test.classes.Factorial;

public class FactorialTester {

    private Factorial factorial;
    private Assert anAssert;

    @Before
    public void init(){
        System.out.println("Initialization FactorialTester...");
        factorial = new Factorial();
        anAssert = new Assert(new ConsoleMessenger());
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

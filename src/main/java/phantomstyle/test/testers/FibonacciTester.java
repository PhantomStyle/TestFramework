package phantomstyle.test.testers;

import phantomstyle.framework.Assert;
import phantomstyle.framework.annotations.After;
import phantomstyle.framework.annotations.Before;
import phantomstyle.framework.annotations.Test;
import phantomstyle.framework.messengeres.ConsoleMessenger;
import phantomstyle.test.classes.Adder;
import phantomstyle.test.classes.Fibonacci;

public class FibonacciTester {

    private Fibonacci fibonacci;
    private Assert anAssert;

    @Before
    public void init(){
        System.out.println("Initialization FibonacciTester...");
        fibonacci = new Fibonacci();
        anAssert = new Assert(new ConsoleMessenger());
    }

    @After
    public void close(){
        System.out.println("Closing FibonacciTester...");
        fibonacci = null;
        anAssert = null;
    }

    @Test
    public void when13Return233(){
        anAssert.assetTrue(fibonacci.fibonacci(13) == 233);
    }
}

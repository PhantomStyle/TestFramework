package phantomstyle.test.testers;

import phantomstyle.framework.Assert;
import phantomstyle.framework.annotations.After;
import phantomstyle.framework.annotations.Before;
import phantomstyle.framework.annotations.Test;
import phantomstyle.framework.messengeres.ConsoleMessenger;
import phantomstyle.test.classes.Adder;

public class AdderTester {

    private Adder adder;
    private Assert anAssert;

    @Before
    public void init(){
        System.out.println("Initialization AdderTester...");
        adder = new Adder();
        anAssert = new Assert(new ConsoleMessenger());
    }

    @After
    public void close(){
        System.out.println("Closing AdderTester...");
        adder = null;
        anAssert = null;
    }

    @Test
    public void when3And6Return9(){
        anAssert.assertEquals(12, adder.add(3, 9));
    }

}

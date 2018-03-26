package phantomstyle.test.testers;

import phantomstyle.framework.Assert;
import phantomstyle.framework.annotations.After;
import phantomstyle.framework.annotations.Before;
import phantomstyle.framework.annotations.Test;
import phantomstyle.framework.messengeres.ConsoleMessenger;
import phantomstyle.test.classes.Adder;

public class AdderTester {

    private Adder adder = new Adder();
    private Assert anAssert = new Assert(new ConsoleMessenger());

    @Before
    public void init(){
        anAssert.showMessage("Initialization AdderTester...");
    }

    @After
    public void close(){
        anAssert.showMessage("Closing AdderTester...");
        adder = null;
        anAssert = null;
    }

    @Test
    public void when3And6Return9(){
        anAssert.assertEquals(9, adder.add(3, 6));
    }

    @Test
    public void when3And7Return10(){
        anAssert.assertEquals(10, adder.add(3, 7));
    }

}

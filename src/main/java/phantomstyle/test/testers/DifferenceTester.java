package phantomstyle.test.testers;

import phantomstyle.framework.Assert;
import phantomstyle.framework.annotations.After;
import phantomstyle.framework.annotations.Before;
import phantomstyle.framework.annotations.Test;
import phantomstyle.framework.messengeres.ConsoleMessenger;
import phantomstyle.test.classes.Difference;

public class DifferenceTester {

    private Difference difference = new Difference();
    private Assert anAssert = new Assert(new ConsoleMessenger());

    @Before
    public void init(){
        System.out.println("Initialization DifferenceTester...");
    }

    @After
    public void close(){
        System.out.println("Closing DifferenceTester...");
        difference = null;
        anAssert = null;
    }

    @Test
    public void when15and8Return7(){
        anAssert.assetTrue(difference.difference(15, 8) == 7);
    }
}

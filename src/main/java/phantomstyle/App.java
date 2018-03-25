package phantomstyle;


import phantomstyle.test.TestPerformer;

import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TestPerformer testPerformer = new TestPerformer();
        testPerformer.runTests(args);
    }
}

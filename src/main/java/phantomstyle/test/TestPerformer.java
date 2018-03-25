package phantomstyle.test;

import com.sun.org.apache.regexp.internal.RE;
import phantomstyle.ReflectionHelper;
import phantomstyle.framework.annotations.After;
import phantomstyle.framework.annotations.Before;
import phantomstyle.framework.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class TestPerformer {

    public void runTests(String... args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        List<Class> classes = new ArrayList<>();
        for (String arg : args) {
            classes.add(Class.forName(arg));
        }
        for (Class c : classes) {
            ReflectionHelper.findAnnotatedMethod(c, Before.class).invoke(c.newInstance());
            ReflectionHelper.findAnnotatedMethod(c, Test.class).invoke(c.newInstance());
            ReflectionHelper.findAnnotatedMethod(c, After.class).invoke(c.newInstance());
        }
    }

}


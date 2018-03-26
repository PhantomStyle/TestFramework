package phantomstyle.test;

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
            Object obj = c.newInstance();
            try {
                ReflectionHelper.findAnnotatedMethod(c, Before.class).stream()
                        .forEach(method -> {
                            try {
                                method.invoke(obj);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        });

            } catch (NullPointerException e) {
                System.out.println("There are no annotations @Before");
            }
            ReflectionHelper.findAnnotatedMethod(c, Test.class).stream()
                    .forEach(method -> {
                        try {
                            method.invoke(obj);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    });
            try {
                ReflectionHelper.findAnnotatedMethod(c, After.class).stream()
                        .forEach(method -> {
                            try {
                                method.invoke(obj);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        });
            } catch (NullPointerException e) {
                System.out.println("There are no annotations @After");
            }
        }
    }

}


package edu.escuelaing.arep.ASE.app;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class JUnit {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c = Class.forName(args[0]);

        Method[] methods = c.getDeclaredMethods();

        int passed = 0, failed = 0;

        for (Method method:methods){
            if (method.isAnnotationPresent(Test.class)){
                try{
                    method.invoke(null);
                    passed++;
                }catch (Throwable ex){
                    System.out.printf("Test %s failed: %s %n", method, ex.getCause());
                    failed++;
                }
            }
        }
        System.out.printf("Passed: %d, Failed %d%n", passed, failed);
    }
}

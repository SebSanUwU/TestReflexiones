package edu.escuelaing.arep.ASE.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainExecutor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> c = Class.forName(args[0]);

        Class<?>[] mainParamTypes = {String[].class};

        Method main = c.getDeclaredMethod("main",mainParamTypes);

        main.invoke(null, (Object) new String[]{args[1], args[2]});

    }
}

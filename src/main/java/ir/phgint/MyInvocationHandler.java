package ir.phgint;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;

    public void setTarget(Object target) {
        this.target = target;
    }

    public MyInvocationHandler() {

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method : " + method.getName());
        System.out.println("Object type : " + target.getClass().getName());
        Object retObject = method.invoke(target, args);
        return retObject;
    }
}

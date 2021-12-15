//package main.java.com.my.util.pool;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//
//interface IHello {
//    void sayHello();
//}
//
//class HelloImpl implements IHello {
//
//    @Override
//    public void sayHello() {
//        System.out.println("Hello JAVA!");
//    }
//}
//
//class HelloProxy implements InvocationHandler {
////目标接口 目的拿到目标接口的所有信息
//    private IHello hello;
//
//    public HelloProxy(IHello hello) {
//        this.hello = hello;
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
////利用反射执行该方法  参数1 目标类，参数2  目标类的参数
//        return method.invoke(hello, args);
//    }
//
//
//
//    public static void main(String[] args) {
//        //目标类的类加载器  目标类实现的接口  代理类
//        IHello hello = new HelloImpl();
//        //调用jdk代理方法 实现对classLoader的操作，完成代理，最后使用代理对该方法进行代理操作
//        IHello tho = (IHello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(),
//                (proxy, method, args1) -> {
//                    return method.invoke(hello, args1);
//                });
//        tho.sayHello();
//    }
//
//}
//

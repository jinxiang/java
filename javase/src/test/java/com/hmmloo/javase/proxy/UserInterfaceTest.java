package com.hmmloo.javase.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class UserInterfaceTest {
  @Test
  public void testStaticProxy() {
    User user = new User();
    user.setName("Tom");
    new StaticProxy(new UserInterfaceImpl()).saveUser(user);
  }

  @Test
  public void testJDKProxy() {
      User user = new User();
      user.setName("Jack");
      UserProxy.getUserProxy().saveUser(user);
  }

  static class StaticProxy implements UserInterface {
    private UserInterface userInterface;

    public StaticProxy(UserInterface userInterface) {
      this.userInterface = userInterface;
    }

    @Override
    public boolean saveUser(User user) {
      System.out.println("Static Proxy Starting save user");
      boolean result = userInterface.saveUser(user);
      System.out.println("Static Proxy Ending save user: " + result);
      System.out.println();
      return result;
    }
  }

  static class UserProxy {
      private static final InvocationHandler USER_HANDLER = new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
              System.out.println("JDK Proxy Starting save user");
              Object result = method.invoke(new UserInterfaceImpl(), args);
              System.out.println("JDK Proxy ending save user: " + result);
              return result;
          }
      };

      public static UserInterface getUserProxy() {
          UserInterface userInterface =  (UserInterface) Proxy.newProxyInstance(UserProxy.class.getClassLoader(),
                  new Class[]{UserInterface.class}, USER_HANDLER);
          return userInterface;
      }
  }
}

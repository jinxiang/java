package com.hmmloo.javase.proxy;

public class UserInterfaceImpl implements UserInterface {
  @Override
  public boolean saveUser(User user) {
    System.out.println("Save User:" + user.getName());
    return true;
  }
}

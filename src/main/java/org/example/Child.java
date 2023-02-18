package org.example;

public class Child extends Parent{
  String msg = "子";
   static int count = 1;
  public void hello(){
    System.out.println(msg+"のメソッドだよ");
  }

}

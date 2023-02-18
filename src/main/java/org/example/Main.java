package org.example;


import java.lang.reflect.AnnotatedArrayType;

public class Main {

  public static void main(String[] args) {

    Family<Parent> fp = new Family<>(new Parent());
    fp.displayField();

   Family<Child> fc = new Family<>(new Child());
   fc.displayField();

//    Parent d = new Child();
//    System.out.println(d.msg);
//
//    Child dd = new Child();
//    System.out.println(dd.msg);
  }
}

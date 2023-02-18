package org.example;

public class Box <E> {
  private  E data;
  public void put (E d){
    this.data = d;
  }
  public E get (){
    return this.data;
  }
}

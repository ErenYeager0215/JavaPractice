package org.example;

public class Family <E extends Parent>{
  private E e;

  public void displayField (){
    System.out.println(e.msg);
  }
  public Family(E e){
    this.e = e;
  }
}

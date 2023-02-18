package org.example;

public class Account implements Comparable<Account>{
 int number;
 int zandaka;

 Account(int num,int zan){
   this.number = num;
   this.zandaka = zan;
 }

 public int compareTo(Account obj){
   if(this.number< obj.number){
     return -1;
   }
   if(this.number< obj.number){
     return 1;
   }
   return 0;
 }

}

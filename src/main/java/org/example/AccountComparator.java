package org.example;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {
  public int compare(Account a1,Account a2){
    if(a1.zandaka < a2.zandaka){
      return -1;
    }
    if(a1.zandaka > a2.zandaka){
      return 1;
    }
    return 0;
  }
}

package org.javaCourse.OOPS.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        Account account=new Account();
        account.setAccountNumber(1234567890);
        account.setAccountPassword("saranya@S11");
        System.out.println(account.getAccountNumber()+" "+account.getAccountPassword());
    }
}

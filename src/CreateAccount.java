/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robin
 */
public class CreateAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;
        System.out.println(firstAccount.balance);

        firstAccount.balance += 100;
        System.out.println(firstAccount.balance);

        Account secondAccount = firstAccount;
        secondAccount.balance = 50;

        System.out.println("The first account has " + firstAccount.balance);
        System.out.println("The second account has " + secondAccount.balance);
    }
}

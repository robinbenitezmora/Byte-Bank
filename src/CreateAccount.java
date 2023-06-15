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
        firstAccount.setBalance = 200;
        System.out.println(firstAccount.setBalance);

        firstAccount.setBalance += 100;
        System.out.println(firstAccount.setBalance);

        Account secondAccount = firstAccount;
        secondAccount.deposit(400);

        System.out.println("The first account has " + firstAccount.setBalance);
        System.out.println("The second account has " + secondAccount.setBalance);
    }
}
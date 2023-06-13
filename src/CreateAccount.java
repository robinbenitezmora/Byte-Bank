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
        firstAccount.balance = 1000;
        System.out.println(firstAccount.balance);
        
        Account seconAccount = new Account();
        seconAccount.balance = 500;
        System.out.println(seconAccount.balance);
    }
    
}

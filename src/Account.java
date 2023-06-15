/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robin
 */
public class Account {
    private double getBalance;
    private int agency;
    private int number;
    private Client owner;

    public void deposit(double value) {
        this.getBalance += value;
    }

    public boolean withdraw(double value) {
        if (this.getBalance >= value) {
            this.getBalance -= value;
            return true;
        }
        return false;
    }

    public boolean transfer(double value, Account account) {
        if (this.getBalance >= value) {
            this.getBalance -= value;
            account.deposit(value);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return this.getBalance;
    }

    public void setAgency(int agency) {
        if (agency > 0) {
            this.agency = agency;
        } else {
            System.out.println("It is not allowed negative values!");
        }
    }

    public int getAgency() {
        return agency;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Client getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

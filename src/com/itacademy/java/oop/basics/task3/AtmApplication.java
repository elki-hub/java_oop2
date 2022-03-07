package com.itacademy.java.oop.basics.task3;

import java.util.Scanner;

public class AtmApplication {
    static Scanner sc = new Scanner(System.in);
    static Card[] cards = {
            new CreditCard(1, 100, 48923, "Anna", "credit1"),
            new DebitCard(2, "Anna", "debit1"),
            new CreditCard(1.5, 90, 400, "Tom", "credit2"),
            new DebitCard(600, "Tom", "debit2"),
            new CreditCard(2, 95, 23, "Frank", "credit3"),
            new DebitCard(34877, "Frank", "debit3"),
            new CreditCard(3, 1000, 284929, "Pinocchio", "credit4"),
            new DebitCard(72, "Pinocchio", "debit4")};

    static Atm myBankAtm = new MyBankAtm(300, cards);

    public static void main(String[] args) {
        System.out.println("Card numbers: ");
        for(Card card: cards){
            System.out.println(card.getCardNumber());
        }

        System.out.println("_____ ATM MACHINE _____");
        Card card = getCardInfo();

        while (true) {
            try {
                System.out.printf("Hello, %s! \n", card.getCardHolderName());
                System.out.println("1 - Withdraw money");
                System.out.println("2 - Deposit money");
                System.out.println("3 - Check Balance");
                System.out.println("4 - Exit");

                System.out.print("Choose operation you want to perform: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount money to be Withdrawn: ");
                        double withdraw = sc.nextDouble();
                        myBankAtm.withdraw(card, withdraw);
                        break;
                    case 2:
                        System.out.print("Enter amount money to be Collected: ");
                        double collect = sc.nextDouble();
                        myBankAtm.deposit(card, collect);
                        break;
                    case 3:
                        System.out.println("Your current balance: " + card.getBalance());
                        break;
                    case 4:
                        return;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Card getCardInfo() {
        while (true) {
            try {
                System.out.print("Enter your card number: ");
                String cardNumber = sc.nextLine();

                return myBankAtm.findCard(cardNumber);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


}



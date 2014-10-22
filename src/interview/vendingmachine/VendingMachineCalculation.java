package interview.vendingmachine;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Utility Class for Vending Machine Calculations
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 20/10/2014
 * @project JavaExamProject
 */
public class VendingMachineCalculation {

    private static final BigDecimal ZERO_VALUE = new BigDecimal("0.0");

    private static final BigDecimal MIN_BALANCE = new BigDecimal("1.2");
    // initial number of coins available
    static final int[] coin_totals = {5, 5, 5, 5};
    // initial number of products available
    static final int[] product_totals = {5, 5, 5, 5};

    static void addCoinToCategoryTotal(int[] coin_totals, int index) {
        coin_totals[index]++;
    }

    static void subtractFromProductTotals(int[] product_totals, int index) {
        product_totals[index]--;
    }

    static BigDecimal addInsertedCoinToBalance(BigDecimal coin_value, BigDecimal balance) {
        return balance.add(coin_value);
    }

    static void displayVendingMachineProducts(VendingMachine vendingMachine) {
        System.out.println("Product Options...");

        int option_num = 1;
        for(Product product : vendingMachine.getStocked_products()) {

            System.out.println("Product #" + option_num +
                    " " + product.getProductName() +
                    " price: " + product.getProductValue());

            option_num ++;
        }

    }

    static BigDecimal processUserSelection(VendingMachine vendingMachine, Scanner scanner, BigDecimal balance) {
        // user inputs coins to the vending machine - require a balance to store the current value of the balance
        // validate user inputs, i.e. have they entered a valid coin value?
        while(balance.compareTo(MIN_BALANCE) == -1) {

            System.out.println("Please enter a coin...");

            Coin inserted_coin = new Coin(scanner.nextBigDecimal());
            System.out.println("Current balance: " + balance);

            // method to determine users product choice (value) against the current balance of the vending machine.
            // if balance is equal to or exceeds product value, dispense product and return change (if any).
            if(vendingMachine.getValidCoins().contains(inserted_coin)) {

                // increase vending machine coin values
                balance = processCoinEntry(coin_totals, balance, inserted_coin);

            } else {
                System.out.println("Invalid selection, please enter a valid coin value.");
            }
        }

        return balance;
    }

    private static BigDecimal processCoinEntry(int[] coin_totals, BigDecimal balance, Coin inserted_coin) {

        // convert value to String
        String insert_Coin_str = inserted_coin.getValue().toString();

        switch (insert_Coin_str) {
            case "1":
                addCoinToCategoryTotal(coin_totals, 0);
                balance = addInsertedCoinToBalance(inserted_coin.getValue(), balance);

                break;
            case "0.5":
                addCoinToCategoryTotal(coin_totals, 1);
                balance = addInsertedCoinToBalance(inserted_coin.getValue(), balance);

                break;
            case "0.2":
                addCoinToCategoryTotal(coin_totals, 2);
                balance = addInsertedCoinToBalance(inserted_coin.getValue(), balance);

                break;
            case "0.1":
                addCoinToCategoryTotal(coin_totals, 3);
                balance = addInsertedCoinToBalance(inserted_coin.getValue(), balance);

                break;
        }

        return balance;
    }

    static int[] calculateVendingMachineChange(int[] coin_totals, BigDecimal balance) {

        String[] change_denomination = {"1.0", "0.5", "0.2", "0.1"};

        for(int i = 0; i < coin_totals.length; i++) {
            balance = change(coin_totals, balance, change_denomination[i], i);
        }

        return coin_totals;
    }

    private static BigDecimal change(int[] coin_totals, BigDecimal balance, String remainderOf,
                                     int arrayIndex) {

        BigDecimal remainder = new BigDecimal(remainderOf);

        if(!balance.equals(ZERO_VALUE)) {

            BigDecimal monetary_remainder = balance.remainder(remainder);

            if (monetary_remainder.equals(ZERO_VALUE)) {
                balance = balance.subtract(remainder);
                coin_totals[arrayIndex]--;
            }

        }

        return balance;
    }

}
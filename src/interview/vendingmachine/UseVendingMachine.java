package interview.vendingmachine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static interview.vendingmachine.VendingMachineCalculation.*;

/**
 * Run Vending Machine Program
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 20/10/2014
 * @project JavaExamProject
 */
public class UseVendingMachine {

    private static final BigDecimal MIN_BALANCE = new BigDecimal("1.2");

    static List<Product> productList = new ArrayList();
    static List<Coin> available_coins = new ArrayList();

    public static void main(String[] args) {

        // setup the vending machine
        setupVendingMachine();

        // create a vending machine object and assign default values
        VendingMachine vendingMachine = new VendingMachine(productList, available_coins);

        Scanner scanner = new Scanner(System.in);

        // set the initial balance value of zero
        BigDecimal balance = vendingMachine.getBalance();
        balance = processUserSelection(vendingMachine, scanner, balance);

        // set the vending machine balance
        vendingMachine.setBalance(balance);

        // vending machine options (products) to be presented to the user, with costs per product
        displayVendingMachineProducts(vendingMachine);

        // request drink select from the user
        System.out.println("Please select your drink option...");
        int product_selection = scanner.nextInt();

        Product selected_product = productList.get((product_selection - 1));
        System.out.println("You have selected: " + selected_product.getProductName());

        // calculate product totals
        subtractFromProductTotals(product_totals, (product_selection - 1));

        // calculate and set the outstanding balance
        BigDecimal outstanding_balance = vendingMachine.getBalance().subtract(selected_product.getProductValue());
        vendingMachine.setBalance(outstanding_balance);

        // print the balance of the vending machine
        System.out.println("Vending machine balance: " + vendingMachine.getBalance());

        // calculate change and update coin_totals array
        calculateVendingMachineChange(coin_totals, vendingMachine.getBalance());

        // Output List Totals
        outputCoinList(coin_totals);
        outputProductList(product_totals);

    }

    private static void setupVendingMachine() {
        // setup available coins
        setupAvailableCoins(new Coin(new BigDecimal("1")));
        setupAvailableCoins(new Coin(new BigDecimal("0.5")));
        setupAvailableCoins(new Coin(new BigDecimal("0.2")));
        setupAvailableCoins(new Coin(new BigDecimal("0.1")));

        // setup initial vending machine stock
        addProductToVendingMachine("Coca Cola", new BigDecimal("1.2"));
        addProductToVendingMachine("Orange Fanta", new BigDecimal("1.2"));
        addProductToVendingMachine("Dr Pepper", new BigDecimal("1.5"));

    }

    private static void setupAvailableCoins(Coin coin) {
        available_coins.add(coin);
    }

    private static void addProductToVendingMachine(String productName, BigDecimal productPrice) {
        productList.add(new Product(productName, productPrice));
    }

    private static void outputProductList(int[] product_totals) {
        System.out.println("Coca Cola " + product_totals[0] +
                " Orange Fanta " + product_totals[1] +
                " Dr Pepper " + product_totals[2]);
    }

    private static void outputCoinList(int[] coin_totals) {
        System.out.println("£1 " + coin_totals[0] +
                " £0.50p " + coin_totals[1] +
                " £0.20p " + coin_totals[2] +
                " £0.10p " + coin_totals[3]);
    }

}
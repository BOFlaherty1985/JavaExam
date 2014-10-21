package interview.vendingmachine;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * Vending Machine Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 20/10/2014
 * @project JavaExamProject
 */
public class VendingMachine {

    private BigDecimal balance;
    private List<Product> stocked_products;
    // valid coin inputs are £1, £0.50p, £0.20p and £0.10p (only)
    private List<Coin> validCoins;

    public VendingMachine(List<Product> stocked_products, List<Coin> validCoins) {
        this.balance = new BigDecimal(BigInteger.ZERO);
        this.stocked_products = stocked_products;
        this.validCoins = validCoins;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<Product> getStocked_products() {
        return stocked_products;
    }

    public void setStocked_products(List<Product> stocked_products) {
        this.stocked_products = stocked_products;
    }

    public List<Coin> getValidCoins() {
        return validCoins;
    }

    public void setValidCoins(List<Coin> validCoins) {
        this.validCoins = validCoins;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "balance=" + balance +
                ", stocked_products=" + stocked_products +
                ", validCoins=" + validCoins +
                '}';
    }

}

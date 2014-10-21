package interview.vendingmachine;

import java.math.BigDecimal;

/**
 * Coin Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 20/10/2014
 * @project JavaExamProject
 */
public class Coin {

    private BigDecimal value;

    public Coin(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Coin insertedCoin = (Coin) obj;

        return this.value.equals(insertedCoin.getValue());
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                '}';
    }

}

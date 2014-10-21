package interview.vendingmachine;

import java.math.BigDecimal;

/**
 * Product Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 20/10/2014
 * @project JavaExamProject
 */
public class Product {

    private String productName;
    private BigDecimal productValue;

    public Product(String productName, BigDecimal productValue) {
        this.productName = productName;
        this.productValue = productValue;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductValue() {
        return productValue;
    }

    public void setProductValue(BigDecimal productValue) {
        this.productValue = productValue;
    }

}

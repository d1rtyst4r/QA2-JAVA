package lv.javaguru.JavaGuruQA2.Lesson4.ClassWork.task3;

import java.math.BigDecimal;

public class Product {
    private String productName;
    private BigDecimal productPrice;

    public Product(String productName, String price){
        this.productName = productName;
        this.productPrice = new BigDecimal(price);
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }
}

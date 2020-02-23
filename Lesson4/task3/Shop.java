package lv.javaguru.JavaGuruQA2.Lesson4.task3;

import java.math.BigDecimal;
import java.util.ArrayList;


public class Shop {
    private ArrayList<Product> productList;

    public Shop() {

    }

    public Shop(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void deleteProduct(String productName) {
        productList.removeIf(product -> product.getProductName().equals(productName));
    }

    public Product findProductByName(String productName) {
        Product result = null;
        for (Product product : this.productList) {
            if (product.getProductName().equals(productName)) {
                result = product;
                break;
            }
        }
        return result;
    }


    public ArrayList<Product> findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        ArrayList<Product> result = null;
        for (Product product : productList) {
            if (product.getProductPrice().compareTo(minPriceRange) == 1 &&
                    product.getProductPrice().compareTo(maxPriceRange) == -1) {
                result.add(product);
            }
        }
        return result;
    }
}



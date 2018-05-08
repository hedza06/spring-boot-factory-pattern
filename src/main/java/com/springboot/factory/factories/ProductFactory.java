package com.springboot.factory.factories;

import com.springboot.factory.services.impls.ConcreteProductOne;
import com.springboot.factory.services.impls.ConcreteProductTwo;
import com.springboot.factory.services.interfaces.Product;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

@Description(value = "Product Factory.")
@Component
public class ProductFactory {

    /**
     * Private constructor - can not be instantiated
     */
    private ProductFactory() { }

    /**
     * Method for getting product by code
     *
     * @param uniqueCode - unique product identifier
     * @return Product interface
     */
    public static Product getProduct(String uniqueCode)
    {
        switch (uniqueCode)
        {
            case "PRODUCT_ONE":
                return new ConcreteProductOne();

            case "PRODUCT_TWO":
                return new ConcreteProductTwo();

            default:
                throw new IllegalArgumentException("Provided code not found.");
        }
    }

}

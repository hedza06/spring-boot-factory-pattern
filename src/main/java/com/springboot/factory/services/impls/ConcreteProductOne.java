package com.springboot.factory.services.impls;

import com.springboot.factory.services.interfaces.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Description(value = "Concrete implementation of product.")
@Service
public class ConcreteProductOne implements Product {

    private final Logger logger = LoggerFactory.getLogger(ConcreteProductOne.class);

    @Override
    public void calculateSomething() {
        logger.info("Calculating something for product one...");
    }

}

package Factories;

import Products.Product;

/**
 * Factory interface
 * @author Ruben Bramasco
 * @version 1.0.0
 * @since 11-30-2019
 */
public interface Factory{

    /**
     * Creates a product
     * @return Product Object
     */
    public abstract Product createProduct(Object details ,Object Decorators);

}
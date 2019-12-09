package Factories;

import java.util.ArrayList;

import Decorators.*;
import enums.*;
import Products.*;

/**
 * Pastry Factory class, implements Factory
 * @author Vanessa Montiel
 * @version 1.0.0
 * @since 11-30-2019
 */
public class PastryFactory implements Factory{

    /**
     * Creates Pastry product given details of type and decoratorators
     * @param pastryType PastryTypes Object
     * @param quantity int 
     * @return Product Object 
     */
    public Product createProduct(Object type, Object det) {
        Pastry pastry;

        TypeSizeStruct details = (TypeSizeStruct)det;

        switch(details.pType){
            case croissant: return new Croissant(details.pType,details.special,details.heated);
            case cookie: return new Cookie(details.pType,details.special,details.qty);
            case macaroon: return new Macaroon(details.pType, details.special,details.qty);
        }
        return null;
    }

}
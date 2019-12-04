package Factories;

import Products.Product;

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
     * Creates Pastry product given details of size/type and decoratorators
     * @param pastryType PastryTypes Object
     * @param quantity int 
     * @return Product Object 
     */
    public Product createProduct(Object pastryType, Object spec) {
        Product pastry = null;
        pastry = getPastry(pastryType, spec);
        
        return pastry;
    }

    /**
     * overloaded method that creates a Croissant
     * @param pastryType
     * @param spec
     * @param heated
     * @return 
     */
    public Product createProduct(Object pastryType, Object spec, boolean heated) {
        PastryTypes specific;
        switch(spec) {
            case PastryTypes.chocolateNut:
                specific = chocolateNut;
                break;
            case PastryTypes.plain:
                specific = plain;   
                break;         
        }

        if (heated) {
            return new Pastry(PastryTypes.croissant, specific, true);
        }
        return new Pastry(PastryTypes.croissant, specific, false);
    }

    /**
     * creates a pastry object given type and specific type
     * @param pastryType
     * @param spec
     * @return
     */
    public Product getPastry(Object pastryType, Object spec) {
        switch ((PastryTypes)pastryType) {
        case cookie:
            if (spec == PastryTypes.oatmeal)
                return new Pastry(PastryTypes.cookie, PastryTypes.oatmeal);
            return new Pastry(PastryTypes.cookie, PastryTypes.plain);
        case macaroon:
            return new Pastry(PastryTypes.macaroon, PastryTypes.variety);
        }
		return null;
    }
}
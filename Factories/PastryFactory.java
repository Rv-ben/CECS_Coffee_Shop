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
     * Creates Pastry product given details of size/type and decoratorators
     * @param pastryType PastryTypes Object
     * @param quantity int 
     * @return Product Object 
     */
    public Product createProduct(Object pastryType, Object spec) {
        Pastry pastry = null;
        pastry = (Pastry) getPastry(pastryType, spec);
        
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
        Pastry pastry = null;
    	//PastryTypes specific;
        switch((PastryTypes)spec) {
            case chocolateNut:
                //specific = PastryTypes.chocolateNut;
                if (heated) {
                	pastry = new Croissant(PastryTypes.croissant, PastryTypes.chocolateNut, true);
                }
                pastry = new Croissant(PastryTypes.croissant, PastryTypes.chocolateNut, false);
            case plain:
                //specific = PastryTypes.plain;       
                if (heated) {
                	pastry = new Croissant(PastryTypes.croissant, PastryTypes.plain, true);
                }
                pastry =  new Croissant(PastryTypes.croissant, PastryTypes.plain, false);
        }
//
//        if (heated) {
//            return new Croissant(PastryTypes.croissant, specific, true);
//        }
//        return new Croissant(PastryTypes.croissant, specific, false);
		return pastry;
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
                return new Cookie(PastryTypes.cookie, PastryTypes.oatmeal);
            return new Cookie(PastryTypes.cookie, PastryTypes.plain);
        case macaroon:
            return new Macaroon(PastryTypes.macaroon, PastryTypes.variety);
        }
		return null;
    }
}
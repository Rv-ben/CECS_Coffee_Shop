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

        //TypeSizeStruct details = (TypeSizeStruct)type;
        pastry = (Pastry) getPastry((TypeSizeStruct)type);

        return pastry;
    }

    /**
     * creates a pastry object given details
     * @param details
     * @return
     */
    public Product getPastry(Object type) {
        TypeSizeStruct details = (TypeSizeStruct)type;
        if (details.pType == PastryTypes.croissant){
            if (details.heated) {
                switch (details.special) {
                    case plain: return new Croissant(details.pType, details.special, true);
                    case chocolateNut: return new Croissant(details.pType, details.special, true);
                }
            }
            else if (!details.heated) {
                switch (details.special) {
                    case plain: return new Croissant(details.pType, details.special, false);
                    case chocolateNut: return new Croissant(details.pType, details.special, false);
                }
            }
        }
        
        else if (details.pType == PastryTypes.macaroon)
            return new Macaroon(details.pType, details.special);
        else if (details.pType == PastryTypes.cookie) {
            switch (details.special) {
                case oatmeal: return new Cookie(details.pType, details.special);
                case plain: return new Cookie(details.pType, details.special);
            }
        }

		return null;
    }
}
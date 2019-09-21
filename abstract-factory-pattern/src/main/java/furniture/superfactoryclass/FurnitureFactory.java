package furniture.superfactoryclass;

import furniture.abstractfactory.FurnitureAbstractFactory;
import furniture.concretefactory.MetalFactory;
import furniture.concretefactory.PlasticFactory;
import furniture.concretefactory.WoodFactory;
import furniture.type.MaterialType;

public class FurnitureFactory {

    public static FurnitureAbstractFactory getFactory(MaterialType type) {
        switch (type) {
        case PLASTIC:
            return new PlasticFactory();
        case WOOD:
            return new WoodFactory();
        case METAL:
            return new MetalFactory();
        }
        return null;
    }
}

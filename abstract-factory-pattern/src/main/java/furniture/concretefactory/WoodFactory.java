package furniture.concretefactory;

import furniture.abstractfactory.FurnitureAbstractFactory;
import furniture.abstractproduct.Chair;
import furniture.abstractproduct.Table;
import furniture.product.WoodChair;
import furniture.product.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }

}

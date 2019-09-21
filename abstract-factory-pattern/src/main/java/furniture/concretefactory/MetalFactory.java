package furniture.concretefactory;

import furniture.abstractfactory.FurnitureAbstractFactory;
import furniture.abstractproduct.Chair;
import furniture.abstractproduct.Table;
import furniture.product.MetalChair;
import furniture.product.MetalTable;

public class MetalFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new MetalChair();
    }

    @Override
    public Table createTable() {
        return new MetalTable();
    }

}

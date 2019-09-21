package furniture.concretefactory;

import furniture.abstractfactory.FurnitureAbstractFactory;
import furniture.abstractproduct.Chair;
import furniture.abstractproduct.Table;
import furniture.product.PlasticChair;
import furniture.product.PlasticTable;

public class PlasticFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

}

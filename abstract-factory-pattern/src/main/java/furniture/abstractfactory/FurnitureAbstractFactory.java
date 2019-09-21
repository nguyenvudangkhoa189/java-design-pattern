package furniture.abstractfactory;

import furniture.abstractproduct.Chair;
import furniture.abstractproduct.Table;

public abstract class FurnitureAbstractFactory {

    public abstract Chair createChair();

    public abstract Table createTable();
}

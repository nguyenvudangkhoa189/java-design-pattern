package furniture.client;

import furniture.abstractfactory.FurnitureAbstractFactory;
import furniture.abstractproduct.Chair;
import furniture.abstractproduct.Table;
import furniture.superfactoryclass.FurnitureFactory;
import furniture.type.MaterialType;

public class ClientTest {

    public static void main(String[] args) {

        // https://gpcoder.com/4365-huong-dan-java-design-pattern-abstract-factory/

        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

        Chair chair = factory.createChair();
        chair.create();

        Table table = factory.createTable();
        table.create();
        
        factory = FurnitureFactory.getFactory(MaterialType.METAL);
        
        chair = factory.createChair();
        chair.create();
        
        table = factory.createTable();
        table.create();
    }
}

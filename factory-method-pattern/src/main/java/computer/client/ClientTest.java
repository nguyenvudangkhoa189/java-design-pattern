package computer.client;

import computer.factoryclass.ComputerFactory;
import computer.supperclass.Computer;
import computer.type.ComputerType;

public class ClientTest {

    public static void main(String[] args) {

        // https://www.journaldev.com/1392/factory-design-pattern-in-java

        Computer desktop = ComputerFactory.getComputer(ComputerType.PC, "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "16 GB", "1 TB", "2.9 GHz");

        System.out.println("Factory PC Config::" + desktop);
        System.out.println("Factory Server Config::" + server);
    }

}

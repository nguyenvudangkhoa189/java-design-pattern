package computer.factoryclass;

import computer.subclasses.PC;
import computer.subclasses.Server;
import computer.supperclass.Computer;
import computer.type.ComputerType;

public class ComputerFactory {

    public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu) {

        switch (type) {
        case PC:
            return new PC(ram, hdd, cpu);
        case SERVER:
            return new Server(ram, hdd, cpu);
        }

        return null;
    }
}

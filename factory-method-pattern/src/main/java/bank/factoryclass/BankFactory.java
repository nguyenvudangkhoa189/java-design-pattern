package bank.factoryclass;

import bank.subclasses.TPBank;
import bank.subclasses.VietcomBank;
import bank.supperclass.Bank;
import bank.type.BankType;

public class BankFactory {

    private BankFactory() {
    }

    public static final Bank getBank(BankType bankType) {
        switch (bankType) {

        case TPBANK:
            return new TPBank();

        case VIETCOMBANK:
            return new VietcomBank();

        default:
            throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}

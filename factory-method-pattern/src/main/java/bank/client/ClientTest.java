package bank.client;

import bank.factoryclass.BankFactory;
import bank.supperclass.Bank;
import bank.type.BankType;

public class ClientTest {

    public static void main(String[] args) {

        // https://gpcoder.com/4352-huong-dan-java-design-pattern-factory-method/

        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName()); // TPBank
    }
}

package be.hogent.opdracht1.excercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class MoneyConverterTest {

    @Test
    void exchangeMoneyFromTheFirstCurrencyToTheSecondCurrency() {
        MoneyConverter moneyConverter = new MoneyConverter(40.3399);

        Assertions.assertEquals(40.3399,moneyConverter.exchangeMoneyFromTheFirstCurrencyToTheSecondCurrency(1));
    }

    @Test
    void exchangeMoneyFromTheSecondCurrencyToTheFirstCurrency() {
        MoneyConverter moneyConverter = new MoneyConverter(40.3399);

        Assertions.assertEquals(1,moneyConverter.exchangeMoneyFromTheSecondCurrencyToTheFirstCurrency(40.3399));
    }
}
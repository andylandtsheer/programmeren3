package be.hogent.opdracht1.excercise1;

public class MoneyConverter {
    private final double exchangeRate;

    public MoneyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double exchangeMoneyFromTheFirstCurrencyToTheSecondCurrency(double amount) {
        return amount * exchangeRate;
    }

    public double exchangeMoneyFromTheSecondCurrencyToTheFirstCurrency(double amount) {
        return amount / exchangeRate;
    }

}

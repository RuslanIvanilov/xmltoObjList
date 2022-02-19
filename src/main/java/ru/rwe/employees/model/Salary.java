package ru.rwe.employees.model;

public class Salary {
    public final Double value;
    public final String currency;

    public Salary(Double value, String currency){
        this.value = value;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "value=" + value +
                ", currency='" + currency + '\'' +
                '}';
    }
}

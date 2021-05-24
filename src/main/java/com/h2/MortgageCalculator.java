package com.h2;

import java.text.DecimalFormat;
import java.text.DecimalFormat;

public class MortgageCalculator {
    private long loanAmount;
    private int termInYears;
    private float annualRate;
    private double monthlyPayment;

    public MortgageCalculator(long loanAmount, int termInYears, float annualRate) {
        this.loanAmount = loanAmount;
        this.termInYears = termInYears;
        this.annualRate = annualRate;
    }

    private int getNumberOfPayments() {
        return termInYears * 12;
    }

    private float getMonthlyInterestRate() {
        float interestRate = annualRate / 100;
        return interestRate / 12;
    }

    public void calculateMonthlyPayment() {
        long p = loanAmount;
        float r = getMonthlyInterestRate();
        int n = getNumberOfPayments();
        double m = p * (((r * Math.pow(1 + r, n))) / ((Math.pow((1 + r), n)) - 1));
        this.monthlyPayment = m;
    }

    public String toString() {
        DecimalFormat df = null;
        return "monthlyPayment: " + df.format(monthlyPayment);
    }

    public static void main(String[] args) {
        long loanAmount = args[0].Long.parseLong();
        int termInYears = args[1].Integer.parseInt();
        float annualRate = args[2].Float.parseFloat();
        MortgageCalculator mortgageCalculator = new MortgageCalculator(600000, 20, 1.75f);
        calculator.calculateMonthlyPayment();
        System.out.println(calculator.toString());
    }
}

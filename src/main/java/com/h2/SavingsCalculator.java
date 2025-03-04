package com.h2;
import java.time.LocalDate;
import java.time.YearMonth;
import com.h2.Utilities;

public class SavingsCalculator {
    private float[] credits;
    private float[] debits;

    public SavingsCalculator(float[] credits, float[] debits) {
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits() {
        float sum = 0.0f;
        for(float credit: credits) {
            sum += credit;
        }
        return sum;
    }

    private float sumOfDebits() {
        float sum = 0.0f;
        for(float debit: debits) {
            sum += debit;
        }
        return sum;
    }

    private static int remainingDaysInMonth(LocalDate date) {
        YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainingDays = totalDaysInMonth - date.getDayOfMonth();
        return remainingDays;
    }

    public float calculate() {
        return sumOfDebits() - sumOfCredits();
    }

    public static void main(String[] args) {
        final String[] creditsAsString = args[0].split(",");
        final String[] debitAsAsString = args[1].split(",");
        float[] credits = new float[creditsAsString.length];
        float[] debits = new float[debitAsAsString.length];

        for(int i = 0; i < creditsAsString.length; i++) {
            credits[i] = Float.parseFloat(creditsAsString[i]);
        };
        for(int i = 0; i < debitAsAsString.length; i++) {
            debits[i] = Float.parseFloat(debitAsAsString[i]);
        };
        final SavingsCalculator calculator = new SavingsCalculator(credits, debits);
        float netSavings = calculator.calculate();
        System.out.println("Net Savings = " + netSavings + ", remaining days in month = " + remainingDaysInMonth(LocalDate.now()));
    }
}

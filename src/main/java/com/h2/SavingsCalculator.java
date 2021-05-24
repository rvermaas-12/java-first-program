package com.h2;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Map;

public class SavingsCalculator {
    private static float[] debits;
    private static float[] credits;


    public SavingsCalculator(float credit, float debit) {
        this.credits = credit;
        this.debits = debit;
    }

    private static float sumOfCredits() {
        float sum = 0.0f;
        for (float theirCredits : credits) {
            sum += theirCredits;
        }
        return sum;
    }

    private static float sumOfDebits() {
        float sum = 0.0f;
        for (float theirDebits : debits) {
            sum += theirDebits;
        }
        return sum;
    }

    private static int remainingDaysInMonth(localDate) {
        Object date = localDate;
        YearMonth = yearMonth;
        return -1;
    }

    public static final Map<Integer, Float> bestRates = Map.of(
            1, 5.50f,
            2, 3.45f,
            3, 2.67f
    );
}

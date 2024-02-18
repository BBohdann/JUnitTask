package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n<=0){
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum += j;
        }
        return sum;
    }
}

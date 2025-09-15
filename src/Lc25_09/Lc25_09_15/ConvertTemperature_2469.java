package Lc25_09.Lc25_09_15;

import java.util.Arrays;

public class ConvertTemperature_2469 {
    public static void main(String[] args) {
        Solution2469 solution2469 = new Solution2469();

        // [309.65000,97.70000]
        System.out.println(Arrays.toString(solution2469.convertTemperature(36.50)));
        // [395.26000,251.79800]
        System.out.println(Arrays.toString(solution2469.convertTemperature(122.11)));
    }
}


// 0ms
class Solution2469 {
    public double[] convertTemperature(double celsius) {
        double[] d = new double[2];
        d[0] = celsius + 273.15;
        d[1] = celsius * 1.80 + 32.00;
        return d;
    }
}

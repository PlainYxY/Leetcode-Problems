package Lc25_08.Lc25_08_5;

//哈沙德数
public class HarshadNum_3099 {
    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(18));
        System.out.println(sumOfTheDigitsOfHarshadNumber(23));
    }

    //0ms   100%
    //1.先通过取模拿到数字的每位之和，然后判断
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        //定义一每位数之和值
        int sum = 0;
        int num = x;
        //按 取模 然后去除最后一位，取到 该数的 每位之和
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }
}

package Lc25_10.Lc25_10_20;

// [25.10.17] 移除字符串中的尾随零
/**
 * <li>给你一个用字符串表示的正整数 num ，请你以字符串形式返回不含尾随零的整数 num 。
 */
public class RemoveTrailingZeros_2710 {
    public static void main(String[] args) {
        Solution2710 solution2710 = new Solution2710();

        // "512301"
        System.out.println(solution2710.removeTrailingZeros("51230100"));
        // "123"
        System.out.println(solution2710.removeTrailingZeros("123"));
    }
}


// 官方题解     todo var类型是java10的新特性，可以动态声明变量类型。
class Solution2710 {
    public String removeTrailingZeros(String num) {
        var index = num.length() - 1;
        while (num.charAt(index) == '0') {
            index--;
        }
        return  num.substring(0, index+1);
    }
}


// 2ms  43%
/*
class Solution2710 {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = num.toCharArray();
        int index = 0;
        for (int i = charArray.length-1; i >= 0; i--) {
            if (charArray[i] != '0') {
                index = i;
                break;
            }
        }
        for (int i = 0;i <= index; i++){
            sb.append(charArray[i]);
        }
        return sb.toString();
    }
}*/

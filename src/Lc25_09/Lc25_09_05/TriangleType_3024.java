package Lc25_09.Lc25_09_05;

// [25.9.1](数组) 三角形类型
/**
 * <li>给你一个下标从 0 开始长度为 3 的整数数组 nums ，需要用它们来构造三角形。
 * <li>如果一个三角形的所有边长度相等，那么这个三角形称为 equilateral 。
 * <li>如果一个三角形恰好有两条边长度相等，那么这个三角形称为 isosceles 。
 * <li>如果一个三角形三条边的长度互不相同，那么这个三角形称为 scalene 。
 * <li>如果这个数组无法构成一个三角形，请你返回字符串 "none" ，否则返回一个字符串表示这个三角形的类型。
 */
public class TriangleType_3024 {
    public static void main(String[] args) {
        Solution3024 solution3024 = new Solution3024();

        // "equilateral"
        System.out.println(solution3024.triangleType(new int[]{3,3,3}));
        // "scalene"
        System.out.println(solution3024.triangleType(new int[]{3,4,5}));
    }
}


// 1ms  57%
class Solution3024 {
    public String triangleType(int[] nums) {
        int one = nums[0], two = nums[1], three = nums[2];
        if (one == 0)
            return "none";
        else if (one == two && two == three) {
            return "equilateral";
        } else if (one + two > three && one + three > two && two + three > one) {
              if (one == two && two != three) {
                return "isosceles";
            } else if (one == three && two != three) {
                return "isosceles";
            } else if (three == two && one != three) {
                return "isosceles";
            }else
                return "scalene";
        } else if (one + two < three || one + three < two || two + three < one) {
            return "none";
        }
        return "none";
    }
}

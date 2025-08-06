package Lc25_08.Lc25_08_5;

// [25.8.5] 检查单词是否为句中或者其他单词的前缀
/*
* 给你一个字符串 sentence 作为句子并指定检索词为 searchWord ，其中句子由若干用 单个空格 分隔的单词组成。
* 请你检查检索词 searchWord 是否为句子 sentence 中任意单词的前缀。
* 如果 searchWord 是某一个单词的前缀，则返回句子 sentence 中该单词所对应的下标（下标从 1 开始）。
* 如果 searchWord 是多个单词的前缀，则返回匹配的第一个单词的下标（最小下标）。
* 如果 searchWord 不是任何单词的前缀，则返回 -1 。
* 字符串 s 的 前缀 是 s 的任何前导连续子字符串。
* */
public class IsPrefixOfWord_1455 {
    public static void main(String[] args) {
        Solution1455 solution1455 = new Solution1455();

        System.out.println(solution1455.isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(solution1455.isPrefixOfWord("this problem is an easy problem", "pro"));
        System.out.println(solution1455.isPrefixOfWord("i am tired", "you"));
        System.out.println(solution1455.isPrefixOfWord("i love eating bur", "burg"));
        System.out.println(solution1455.isPrefixOfWord("bigbag", "bag"));
        System.out.println(solution1455.isPrefixOfWord("dumb they google jonathan corona errichto winstontang love love", "lov"));
        System.out.println(solution1455.isPrefixOfWord("i love eating bunburger burger", "burg"));
    }
}

/*（提示）
* 首先提取句子中的单词。
* 如果searchWord出现在索引0处，则检查每个单词，如果出现，则返回该单词的索引（1-索引）
* 如果searchWord不作为任何单词的前缀存在，则返回默认值（-1）。
* */


// 题友的解法，用了一个新的 API方法
class Solution1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // 移除非字母和空格
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");
        String[] words = sentence.trim().split(" ");
        //todo startsWith()方法 {str.startsWith(i)检查字符串 str 元素是否以指定的元素 i 开头}
        //     trim()方法       {用于去除 字符串首尾 的空白字符}
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}


// 3ms  3%
// 1.用正则表达式 清洗和风格语句到String[]中
// todo 这里用到 split()方法{根据匹配给定的正则表达式来拆分字符串}
/*
class Solution1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // 移除非字母和空格
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");
        String[] words = sentence.trim().split("\\s+");
        //判断searchWord是否出现在索引0处
        int ans = -1;
        for (int i = 0; i < words.length; i++) {
             if (words[i].charAt(0) == searchWord.charAt(0) && searchWord.length() == 1){
                ans =  i + 1;
                break;
            }else if (words[i].charAt(0) == searchWord.charAt(0) && searchWord.length() <= words[i].length()){
                for (int j = 1; j < searchWord.length(); j++) {
                    //出现则继续检测剩余单词
                    //确保检测的单词相同
                    if (words[i].charAt(j) == searchWord.charAt(j)){
                        //确保检测到 searchWord 的最后一个单词
                        if (j == searchWord.length() - 1) {
                            ans = i + 1;
                        }
                    }else break;
                }
                if (ans != -1)
                    break;
            }
        }
        return ans;
    }
}*/

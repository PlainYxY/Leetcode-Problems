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
    }
}

/*（提示）
* 首先提取句子中的单词。
* 如果searchWord出现在索引0处，则检查每个单词，如果出现，则返回该单词的索引（1-索引）
* 如果searchWord不作为任何单词的前缀存在，则返回默认值（-1）。
* */

class Solution1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        return 0;
    }
}

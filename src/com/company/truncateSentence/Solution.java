package com.company.truncateSentence;

/**
 * 截断句子
 * 句子 是一个单词列表，列表中的单词之间用单个空格隔开，且不存在前导或尾随空格。每个单词仅由大小写英文字母组成（不含标点符号）。
 *
 * 例如，"Hello World"、"HELLO" 和 "hello world hello world" 都是句子。
 * 给你一个句子 s​​​​​​ 和一个整数 k​​​​​​ ，请你将 s​​ 截断 ​，​​​使截断后的句子仅含 前 k​​​​​​ 个单词。返回 截断 s​​​​​​ 后得到的句子。
 *

 */
public class Solution {
    public static String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(s1[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String hello_how_are_you_contestant = truncateSentence("What is the solution to this problem", 4);
        System.out.println(hello_how_are_you_contestant);
    }
}

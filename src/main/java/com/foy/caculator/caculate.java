package com.foy.caculator;

public class caculate {
    /**
     * 实现混合运算
     *
     * @param content
     * @return
     */
    public static double parse(String content) {

        // 找到字符串中最后一个左括号
        int startIndex = content.lastIndexOf("(");
        // 如果不是-1,标识这个等式中有括号,继续找与之对应的右括号
        if (startIndex != -1) {
            // 从左括号的位置开始找,找到第一个右括号,这对括号里面一定没有括号,所以就可以交给写好的parse(Stringcontent)方法算出结果！
            int endIndex = content.indexOf(")", startIndex);
            double d = parse(content.substring(startIndex + 1, endIndex));
            return parse(content.substring(0, startIndex) //
                    + d + content.substring(endIndex + 1));
        }

        int index = content.indexOf("+");
        if (index != -1) {
            return parse(content.substring(0, index)) + parse(content.substring(index + 1));
        }
        // 这里<---
        index = content.lastIndexOf("-");
        if (index != -1&&index !=0&&content.charAt(index-1)!='X'&&content.charAt(index-1)!='÷'&&content.charAt(index-1)!='√'&&content.charAt(index-1)!='-') {
            return parse(content.substring(0, index)) - parse(content.substring(index + 1));
        }
        // 这里<---
        index = content.indexOf("X");
        if (index != -1) {
            return parse(content.substring(0, index)) * parse(content.substring(index + 1));
        }
        // 这里<---
        index = content.lastIndexOf("÷");
        if (index != -1) {
            return parse(content.substring(0, index)) / parse(content.substring(index + 1));
        }
        // 这里<---
        index = content.indexOf("√");
        if (index!=0 &&index!=-1&&((int)content.charAt(index-1)>=48&&(int)content.charAt(index-1)<=57)){
            return parse(content.substring(0, index) + "X" + content.substring(index));
        }
        if (index != -1) {
            return Math.sqrt(parse(content.substring(index + 1)));
        }

        return Double.parseDouble(content);
    }
}

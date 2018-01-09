package Leetcode.ExpressionAddOperators;

import java.util.ArrayList;
import java.util.List;

public class attempt2 {
    public static void main(String[] args) {
        attempt2 a = new attempt2();
        System.out.println(a.addOperators("999999999",
                81));
    }
    public List<String> addOperators(String num, int target) {
        char[] chars = num.toCharArray();
        List<List<Double>> list = new ArrayList<>();
        list = possibilities(list, new ArrayList<>(), chars, 0);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<String> tempRes = helper(list.get(i), new ArrayList<>(), "", 0,0,target,0);
            int count = 0;
            /*
            for (int j = 0; j < tempRes.size(); j++) {
                if (!result.contains(tempRes.get(j))) {
                    result.add(tempRes.get(j));
                }else {
                    count++;
                }
            }
            */
            for (int j = 0; j < tempRes.size(); j++){
                result.add(tempRes.get(j));
            }
        }
        return result;
    }
// 这个方法有问题。
    private List<List<Double>> possibilities(List<List<Double>> list,
                                             List<String> possible,
                                             char[] chars,
                                             int index) {
        int size = 0;
        for (int i = 0; i < possible.size(); i++) {
            size += possible.get(i).length();
        }
        if (size == chars.length) {
            List<Double> temp = new ArrayList<>();
            for (int i = 0; i < possible.size(); i++) {
                temp.add(Double.parseDouble(possible.get(i)));
            }
            list.add(temp);
            return list;
        }

        for (int i = index; i < chars.length; i++) {
            String s = "";
            for (int j = index; j <= i; j++) {
                s += chars[j];
            }
            //这里验证s是否合法
            if (s.length() > 1 && s.startsWith("0")) {
                continue;
            }
            possible.add(s);
            possibilities(list, possible, chars, i + 1);
            possible.remove(s);
        }
        return list;
    }

    private List<String> helper(List<Double> list,
                                List<String> res,
                                String string,
                                double prev,
                                double result,
                                double target,
                                int index) {
        if (index >= list.size()) {
            if (result == target) {
                res.add(string);
                return res;
            } else {
                return null;
            }
        }
        if (index == 0) {
            helper(list, res, list.get(index).intValue()+"", list.get(index), list.get(index),target,index + 1);
        } else {
            helper(list, res, string + "*" + list.get(index).intValue(),prev * list.get(index), (result - prev)+prev*list.get(index),
                    target,index + 1);

            helper(list, res, string + "+" + list.get(index).intValue(), list.get(index), result+list.get(index), target,index + 1);
            helper(list, res, string + "-" + list.get(index).intValue(),  -list.get(index),result-list.get(index),target,index + 1);
        }
        return res;
    }



}

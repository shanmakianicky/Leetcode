package Leetcode.ExpressionAddOperators;

import java.util.ArrayList;
import java.util.List;

public class attempt1 {
    public static void main(String[] args) {
        attempt1 a = new attempt1();
        System.out.println(a.addOperators("3456237490",
                9191));
    }
    public List<String> addOperators(String num, int target) {
        char[] chars = num.toCharArray();
        List<List<Double>> list = new ArrayList<>();
        list = possibilities(list, new ArrayList<>(), chars, 0);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<String> tempRes = helper(list.get(i), new ArrayList<>(), "",  target,0);
            for (int j = 0; j < tempRes.size(); j++) {
                if (!result.contains(tempRes.get(j))) {
                    result.add(tempRes.get(j));
                }
            }
        }
        return result;
    }

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
                                double target,
                                int index) {
        if (index >= list.size()) {
            if (parse(string) == target) {
                res.add(string);
                return res;
            } else {
                return null;
            }
        }
        if (index == 0) {
            helper(list, res, list.get(index).intValue()+"", target, index + 1);
        } else {
            String[] signs = string.split("/[^0-9]+/");
            String sign = signs[signs.length - 1];
                helper(list, res, string + "*" + list.get(index).intValue(),
                        target, index + 1);

            helper(list, res, string + "+" + list.get(index).intValue(), target,index + 1);
            helper(list, res, string + "-" + list.get(index).intValue(),  target, index + 1);
        }
        return res;
    }
    private double parse(String s){
        String[] nums = s.split("[^0-9]+");
        String[] signs = s.split("[0-9]+");
        for (int i = 0; i < signs.length-1; i++){
            if (signs[i+1].equals("*")){
                String string = nums[i] + "*" + nums[i+1];
                String res = new Double(Double.parseDouble(nums[i])*Double.parseDouble(nums[i+1])).intValue()+"";
                s = s.replace(string,res);
            }
        }
        nums = s.split("[^0-9]+");
        signs = s.split("[0-9]+");


        double result = Double.parseDouble(nums[0]);
        for (int i = 0; i < signs.length; i++){
            if (signs[i].equals("+")){
                result += Double.parseDouble(nums[i]);
            }else if (signs[i].equals("-")){
                result -= Double.parseDouble(nums[i]);
            }
        }
        return result;
    }


}

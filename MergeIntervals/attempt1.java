package Leetcode.MergeIntervals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class attempt1 {
    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
    public List<Interval> merge(List<Interval> list){
        if (list == null || list.size() == 0 || list.size() == 1){
            return list;
        }
        list.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start,o2.start)!=0?Integer.compare(o1.start,o2.start):
                        Integer.compare(o1.end,o2.end);
            }
        });
        List<Interval> result = new ArrayList<>();
        result.add(list.get(0));
        for (int i =1 ; i < list.size(); i++){
            if (list.get(i).start <= result.get(result.size()-1).end){
                Interval newInter;
                if(list.get(i).end <= result.get(result.size()-1).end){
                    newInter = result.get(result.size()-1);
                }else{
                    newInter = new Interval(result.get(result.size() - 1).start, list.get(i).end);
                }
                result.remove(result.size()-1);
                result.add(newInter);
            }else{
                result.add(list.get(i));
            }
        }
        return result;
    }
}

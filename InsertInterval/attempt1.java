package Leetcode.InsertInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class attempt1 {
    public static void main(String[] args) {
        List<Interval> list = Arrays.asList(new Interval[]{new Interval(1,3),new Interval(6,9)});
        Interval interval = new Interval(2,5);
        System.out.println(insert(list,interval).toString());

    }
    public static class Interval {
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

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        if (intervals == null || intervals.size() < 1){
            result.add(newInterval);
            return result;
        }
        int i = 0;

        while (i < intervals.size() && intervals.get(i).end < newInterval.start){
            result.add(intervals.get(i++));
        }
        while (i < intervals.size() && intervals.get(i).start < newInterval.end){
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        result.add(newInterval);

        while(i < intervals.size()){
            result.add(intervals.get(i));
            i++;
        }

        return result;
    }
}

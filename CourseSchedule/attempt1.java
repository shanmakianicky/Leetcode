package Leetcode.CourseSchedule;

import java.util.*;

public class attempt1 {
    public boolean canFinish(int numCourses, int[][] prerequisites){
        int[][] matrix = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++){
            int cur = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if (matrix[cur][pre] == 0){
                indegree[i]++;
            }
            matrix[cur][pre] = 1;
        }
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < numCourses; i++){
            if (indegree[i] == 0){
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()){
            count++;
            int num = queue.poll();
            for (int i = 0; i < numCourses; i++){
                if (matrix[num][i] != 0){
                    if ((--indegree[i]) == 0){
                        queue.offer(i);
                    }
                }
            }
        }
        return count == numCourses;

    }
}

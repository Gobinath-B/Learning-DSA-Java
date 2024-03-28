package ArrayChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interval {

    public static void main(String[] args) {
        // Example input
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        // Create an instance of IntervalInsert
        Interval intervalInsert = new Interval();

        // Call the insert method and print the result
        int[][] result = intervalInsert.insert(intervals, newInterval);
        System.out.println("Result: " + Arrays.deepToString(result));
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();

        while (i < intervals.length) {
            if (intervals[i][1] < newInterval[0])
                result.add(intervals[i]);
            else if (intervals[i][0] > newInterval[1]){
                break;
            } else {
                //Overlap : merge them
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
            i++;
        }

        result.add(newInterval);
        while (i < n){
            result.add(intervals[i++]);
        }

        return result.toArray(new int[result.size()][2]);
    }
}
}
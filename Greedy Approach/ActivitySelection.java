import java.util.*;
/*
 *  Que. You are given 'n activities' with their start and end times,
 *  select the maximum number of activities that can be performed by a 
 *  single person.
 *  A person can easily work on a Single Activity at a time.
 */
public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        maxNumberOfActivities(start, end);
    }
    public static void maxNumberOfActivities(int[] start, int[] end){
        int n = start.length;

        int[][] activities = new int[n][3];
        for(int i = 0; i < n; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //Sorting a 2D Array {Very IMP}

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); /*o[2] means I'm sorting only 2nd column */
        
        int maxAct = 0;
        ArrayList<Integer> list = new ArrayList<>();

        maxAct = 1;
        list.add(activities[0][0]); // 1st banda(index) hamesha add hogi
        int lastEnd = activities[0][2]; // [0][2] matlb 2nd column in 1st row

        for(int i = 1; i < n; i++) {
            if(activities[i][1] >= lastEnd) {
                maxAct++;
                list.add(activities[i][0]);  //Index Added of that Element
                lastEnd = activities[i][2];  //Updated lastEnd to compare in next iteration
            }
        }

        // return maxAct;

        System.out.println("Maximum Activities That Can be Done is : " + maxAct);
        System.out.print(list + " ");
    }
}

import java.util.*;
 
public class JobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int[][] jobInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> ans = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++) {
            Job currentJob = jobs.get(i);
            if(currentJob.deadline > time) {
                ans.add(currentJob.id);
                time++;
            }
        }

        System.out.println(ans);
    }
}

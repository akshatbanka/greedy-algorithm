import java.util.*;
public class JobSequencing {
    public static void main(String[] args) {
        int jobs[][] = {{4,20}, {1,10}, {1,30}, {1,40}};
        
        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[1]));
         
        int time=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = jobs.length-1; i>= 0; i--) {
            if(jobs[i][0] > time){
                time++;
                 ans.add(jobs[i][1]);
            }
        }
        System.out.println("max count "+time);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}

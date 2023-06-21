import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,2,3,4,5,6};
        int end[] = {8,7,6,1,2,3};
        
        int activities[][] = new int[start.length][3];
        for (int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;
       
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<start.length; i++){
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("maximum activities "+maxAct);
        for(int j=0; j<ans.size();j++){
            System.out.print("A"+ans.get(j)+" ");
        }
        System.out.println();
    }
}

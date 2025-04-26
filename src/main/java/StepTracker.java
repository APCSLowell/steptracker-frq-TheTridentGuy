import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
    private final int activeReq;
    private int totalSteps = 0;
    private int totalActiveDays = 0;
    private int totalDays = 0;
    public StepTracker(int num)
    {
        activeReq = num;
    }
    public void addDailySteps(int num){
        totalSteps += num;
        totalDays++;
        if(num >= activeReq){
            totalActiveDays++;
        }
    }
    public int activeDays(){
        return totalActiveDays;
    }
    public double averageSteps(){
        if(totalDays == 0){
            return 0;
        }
        return totalSteps / (double) totalDays;
    }
} 

import java.util.ArrayList;
public class StepTracker
{
 int a;
 int active;
 /* to be implemented here */
 public StepTracker(int steps){
  a = steps;
  active = 0;
 }

 public void addDailySteps(int steps){
  a+=steps;
  if(steps >= 10000) active+=1;
 }

 public int activeDays(){
  return active;
 }

 public double averageSteps(){
  return a/activeDays();
 }
} 

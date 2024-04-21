import java.util.ArrayList;
 public class StepTracker
{
 private int a;
 private int steps;
 private int active;
 private int day;
 /* to be implemented here */
 public StepTracker(int activeSteps){ 
  a = activeSteps;
  steps = 0;
  active = 0;
  day = 0;
 }

 public void addDailySteps(int plussteps){
  if(plussteps >= a) active+=1;
  steps+=plussteps;
  day++;
 }

 public int activeDays(){
  return active;
 }

 public double averageSteps(){
  if(day > 0)
  return steps/day;
  return 0;
 }
} 

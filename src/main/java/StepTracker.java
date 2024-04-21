import java.util.ArrayList;
public class StepTracker
{
 int a;
 int steps;
 int active;
 /* to be implemented here */
 public StepTracker(int activeSteps){
  a = activeSteps;
  steps = 0;
  active = 0;
 }

 public void addDailySteps(int steps){
  if(steps >= a) active+=1;
  this.steps+=steps;
 }

 public int activeDays(){
  return active;
 }

 public double averageSteps(){
  if(activeDays() > 0)
  return this.steps/activeDays();
  return 0;
 }
} 

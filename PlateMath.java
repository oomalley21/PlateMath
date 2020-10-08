import javax.swing.JOptionPane;

public class PlateMath{
 public static void main(String[] args){
 String inputWeightStr;
 double inputWeight;
 inputWeightStr = JOptionPane.showInputDialog("Lifting plate calculator. Enter total weight in pounds as an integer:");
 inputWeight = Double.parseDouble(inputWeightStr);
 int totalWeight = 5*(int)(inputWeight/5.0 + 0.5);
 
 double sideWeight = (totalWeight-45)/ 2.0;
 int num45 = (int) (sideWeight/45);
 sideWeight -= num45*45;
 int num25 = (int) (sideWeight/25);
 sideWeight -= num25*25;
 int num10 = (int) (sideWeight/10);
 sideWeight -= num10*10;
 int num5 = (int) (sideWeight/5);
 sideWeight -= num5*5;
 int num2pt5 = (int) (sideWeight/2.5);
 sideWeight -= num2pt5*2.5;
 
 
 //display messages
 String message45; 
 if(num45>0){message45 = num45+"x45's ";}else{message45 = "";}
 String message25; 
 if(num25>0){message25 = num25+"x25's ";}else{message25 = "";}
 String message10; 
  if(num10>0){message10 = num10+"x10's ";}else{message10 = "";}

 String message5; 
  if(num5>0){message5 = num5+"x5's ";}else{message5 = "";}

 String message2pt5; 
  if(num2pt5>0){message2pt5 = num2pt5+"x2.5's ";}else{message2pt5 = "";}

 

 JOptionPane.showMessageDialog(null, "You need " + message45 + message25 + message10 + message5 + message2pt5 + "per side of a 45lb bar to make "+ totalWeight + "lbs");
 System.exit(0);
 
 
 
 
 
    }
}
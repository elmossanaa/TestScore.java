import javax.swing.JOptionPane;
public class testscore{

    public static void main(String[] args) {
       int testScore; 
       String input;
       
       input = JOptionPane.showInputDialog("enter your test score: ");
       testScore = Integer.parseInt(input);
       
       if(testScore<60){
           JOptionPane.showConfirmDialog(null, "you failed.\ngrade: F");
       }
       else if(testScore <70){
           JOptionPane.showConfirmDialog(null, "grade: D");
       }
       else if(testScore<80){
           JOptionPane.showConfirmDialog(null, "grade: c");
       }
       else if(testScore<90){
           JOptionPane.showConfirmDialog(null, "grade: B");
       }
       else {
           JOptionPane.showConfirmDialog(null, "grade: A");
       }
      System.exit(0);

       }
    
       
    }

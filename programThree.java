import javax.swing.JOptionPane;

public class programThree {
    public static void main(String[] args){
        int startingNumber = 23;
        String results;
        String inputRequest;

        results = JOptionPane.showInputDialog(null, "Guess a number"); //This is to ask for an input or value to be typed in
        //JOptionPane.showMessageDialog(parentComponent:null, "hello " + results);      //shows message and input onto the screen

        int resultsInt = Integer.parseInt(results);

        if(startingNumber == resultsInt){
            JOptionPane.showMessageDialog(null, "Your Guess " + results + " is correct");
        };

        if(startingNumber < resultsInt){
            inputRequest = "too High";
            System.out.println(inputRequest);
        }
        
        if(startingNumber > resultsInt){
            inputRequest = "Too Low";
            System.out.println(inputRequest);
        }
    
        //JOptionPane.showMessageDialog(null, results);

    }
}
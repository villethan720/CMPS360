import java.util.Random; //importing this method

import javax.swing.JOptionPane;

public class random {
    public static void main(String[] args){
    
        Random rand = new Random(); //random class

        int rand_int = rand.nextInt(100); //this gives rand_int a number between 0-99

        JOptionPane.showMessageDialog(null, "Your random number is " + rand_int);
    }
}
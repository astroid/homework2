package homework2;

// it should be completed
import javax.swing.JOptionPane;

public class JoptionInput1 {



public static void main(String[] args) {
int sum = 0;


int option = JOptionPane.YES_OPTION;
while (option == JOptionPane.YES_OPTION) {

String dataString = JOptionPane.showInputDialog("Enter an int value: ");
int data = Integer.parseInt(dataString);



option = JOptionPane.showConfirmDialog(null, "Continue?");
}

JOptionPane.showMessageDialog(null, "" + sum);
}
}
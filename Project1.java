import javax.swing.JOptionPane;

public class Project1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Whats your name?");
        JOptionPane.showMessageDialog(null,"hello"+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog ("How old are you"));
        JOptionPane.showMessageDialog(null, "Your age is  " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + " cm tall.");

    }
}

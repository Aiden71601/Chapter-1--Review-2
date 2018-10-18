import javax.swing.JOptionPane;
public class HalBot
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("What is your name?");
      System.out.println("Hello " + name + "!");
      String trash = JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
      System.out.println("I'm sorry, " + name + ". I'm afraid I can't do that.");
   }
}
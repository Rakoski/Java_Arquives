import javax.swing.JOptionPane;

public class FirstGUI {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Coloque seu nome");
        JOptionPane.showMessageDialog(null, "Hello, "+name);

        // esse parseInt converte uma string pra um int
        int age = Integer.parseInt(JOptionPane.showInputDialog("Agora coloque sua idade"));

        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Coloque sua altura"));

        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");

    }
}

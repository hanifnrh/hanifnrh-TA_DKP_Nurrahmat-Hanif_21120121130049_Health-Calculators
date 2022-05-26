import javax.swing.*;
import java.awt.*;

public class Intro extends JFrame {
    JPanel rootPanel= new JPanel(null);

    public Intro(){
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setUp();
        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Health.png"));
        add(rootPanel);
    }
    public void setUp(){
        rootPanel.setBackground(Color.white);
        JLabel heading= new JLabel("Health Calculators");
        heading.setOpaque(true);
        heading.setFont(new Font("SF UI Display", Font.BOLD, 24));
        heading.setForeground(new Color(19, 120, 189));
        heading.setBackground(rootPanel.getBackground());
        rootPanel.add(heading);
        JLabel icon = new JLabel(new ImageIcon("D:\\Health.png"));
        icon.setOpaque(true);
        icon.setBackground(Color.white);
        heading.setBounds(145, 20, 300, 50);
        icon.setBounds(0, 20, 500, 400);
        rootPanel.add(icon);

    }
}
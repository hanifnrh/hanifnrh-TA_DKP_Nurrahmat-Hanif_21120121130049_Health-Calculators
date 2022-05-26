import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame {
    JPanel rootPanel = new JPanel(null);

    public BMI() {
        setResizable(false);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Health.png"));
        setLocationRelativeTo(null);
        add(rootPanel);

        JLabel weight = new JLabel("Weight (kg):");
        weight.setOpaque(true);
        weight.setFont(new Font("Poppins", Font.BOLD, 14));
        weight.setForeground(new Color(19, 120, 189));
        weight.setBounds(246, 20, 200, 40);
        rootPanel.add(weight);

        JTextField t2 = new JTextField();
        t2.setOpaque(true);
        t2.setFont(new Font("Poppins", Font.PLAIN, 14));
        t2.setBackground(Color.white);
        t2.setForeground(new Color(19, 120, 189));
        t2.setBounds(262, 60, 50, 30);
        rootPanel.add(t2);

        JLabel height = new JLabel("Height (cm):");
        height.setOpaque(true);
        height.setFont(new Font("Poppins", Font.BOLD, 14));
        height.setForeground(new Color(19, 120, 189));
        height.setBounds(246, 100, 200, 40);
        rootPanel.add(height);

        JTextField t3 = new JTextField();
        t3.setOpaque(true);
        t3.setFont(new Font("Poppins", Font.PLAIN, 14));
        t3.setBackground(Color.white);
        t3.setForeground(new Color(19, 120, 189));
        t3.setBounds(262, 140, 50, 30);
        rootPanel.add(t3);

        JButton cal= new JButton("Calculate");
        cal.setFocusable(false);
        cal.setOpaque(false);
        cal.setBackground(new Color(19, 120, 189));
        cal.setForeground(new Color(19, 120, 189));
        cal.setFont(new Font("Poppins", Font.PLAIN, 14));
        cal.setBounds(227, 200, 130, 30);
        cal.setBorder(new RoundedBorder(30));
        rootPanel.add(cal);
        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double height = Double.parseDouble(t3.getText());
                double weight = Double.parseDouble(t2.getText());
                double BMI = weight / Math.pow(height/100, 2);
                JOptionPane.showMessageDialog(null, "Your BMI is " + BMI);
            }
        });


        JButton back = new JButton("Back");
        back.setFocusable(false);
        back.setOpaque(false);
        back.setBackground(new Color(19, 120, 189));
        back.setForeground(new Color(19, 120, 189));
        back.setFont(new Font("Poppins", Font.PLAIN, 14));
        back.setBounds(50, 500, 120, 30);
        back.setBorder(new RoundedBorder(30));
        rootPanel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Home home= new Home();
                home.setVisible(true);
                dispose();
            }
        });

        JButton info1 = new JButton("What is BMI?");
        info1.setFocusable(false);
        info1.setOpaque(false);
        info1.setBackground(new Color(19, 120, 189));
        info1.setForeground(new Color(19, 120, 189));
        info1.setFont(new Font("Poppins", Font.PLAIN, 14));
        info1.setBounds(405, 500, 150, 30);
        info1.setBorder(new RoundedBorder(30));
        rootPanel.add(info1);
        info1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage("https://my.clevelandclinic.org/health/articles/9464-body-mass-index-bmi");
            }
        });
    }
    public void openWebPage(String url){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

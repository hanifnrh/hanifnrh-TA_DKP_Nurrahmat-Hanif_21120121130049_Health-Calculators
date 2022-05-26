import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMR extends JFrame {
    JPanel rootPanel = new JPanel(null);

    public BMR() {
        setResizable(false);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Health.png"));
        setLocationRelativeTo(null);
        add(rootPanel);

        JLabel sex = new JLabel("Sex:");
        sex.setOpaque(true);
        sex.setFont(new Font("Poppins", Font.BOLD, 14));
        sex.setForeground(new Color(19, 120, 189));
        sex.setBounds(270, 20, 200, 40);
        rootPanel.add(sex);

        String[] sex2 = {"Female", "Male"};
        JComboBox c1 = new JComboBox(sex2);
        c1.setOpaque(true);
        c1.setFont(new Font("Poppins", Font.PLAIN, 14));
        c1.setForeground(new Color(19, 120, 189));
        c1.setBounds(193, 60, 200, 40);
        rootPanel.add(c1);

        JLabel age = new JLabel("Age:");
        age.setOpaque(true);
        age.setFont(new Font("Poppins", Font.BOLD, 14));
        age.setForeground(new Color(19, 120, 189));
        age.setBounds(270, 100, 200, 40);
        rootPanel.add(age);

        JTextField t1 = new JTextField();
        t1.setOpaque(true);
        t1.setFont(new Font("Poppins", Font.PLAIN, 14));
        t1.setBackground(Color.white);
        t1.setForeground(new Color(19, 120, 189));
        t1.setBounds(262, 140, 50, 30);
        rootPanel.add(t1);

        JLabel weight = new JLabel("Weight (kg):");
        weight.setOpaque(true);
        weight.setFont(new Font("Poppins", Font.BOLD, 14));
        weight.setForeground(new Color(19, 120, 189));
        weight.setBounds(246, 180, 200, 40);
        rootPanel.add(weight);

        JTextField t2 = new JTextField();
        t2.setOpaque(true);
        t2.setFont(new Font("Poppins", Font.PLAIN, 14));
        t2.setBackground(Color.white);
        t2.setForeground(new Color(19, 120, 189));
        t2.setBounds(262, 220, 50, 30);
        rootPanel.add(t2);

        JLabel height = new JLabel("Height (cm):");
        height.setOpaque(true);
        height.setFont(new Font("Poppins", Font.BOLD, 14));
        height.setForeground(new Color(19, 120, 189));
        height.setBounds(246, 260, 200, 40);
        rootPanel.add(height);

        JTextField t3 = new JTextField();
        t3.setOpaque(true);
        t3.setFont(new Font("Poppins", Font.PLAIN, 14));
        t3.setBackground(Color.white);
        t3.setForeground(new Color(19, 120, 189));
        t3.setBounds(262, 300, 50, 30);
        rootPanel.add(t3);

        JButton cal= new JButton("Calculate");
        cal.setFocusable(false);
        cal.setOpaque(false);
        cal.setBackground(new Color(19, 120, 189));
        cal.setForeground(new Color(19, 120, 189));
        cal.setFont(new Font("Poppins", Font.PLAIN, 14));
        cal.setBounds(227, 360, 130, 30);
        cal.setBorder(new RoundedBorder(30));
        rootPanel.add(cal);
        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double BMR;
                double height = Double.parseDouble(t3.getText());
                double weight = Double.parseDouble(t2.getText());
                double age = Double.parseDouble(t1.getText());

                if (c1.getSelectedItem().equals("Male")) {
                    BMR = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
                    JOptionPane.showMessageDialog(null, "Your BMR is " + BMR);
                } else if (c1.getSelectedItem().equals("Female")) {
                    BMR = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
                    JOptionPane.showMessageDialog(null, "Your BMR is " + BMR);
                }
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

        JButton info1 = new JButton("What is BMR?");
        info1.setFocusable(false);
        info1.setOpaque(false);
        info1.setBackground(new Color(19, 120, 189));
        info1.setForeground(new Color(19, 120, 189));
        info1.setFont(new Font("Poppins", Font.PLAIN, 14));
        info1.setBounds(405, 500, 155, 30);
        info1.setBorder(new RoundedBorder(30));
        rootPanel.add(info1);
        info1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage("https://www.healthline.com/health/what-is-basal-metabolic-rate");
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

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class Home extends JFrame {
    JPanel rootPanel = new JPanel(null);
    public Home(){
        setResizable(false);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Health.png"));
        setLocationRelativeTo(null);
        add(rootPanel);

        JLabel heading = new JLabel("Menu");
        heading.setOpaque(true);
        heading.setFont(new Font("SF UI Display", Font.BOLD, 26));
        heading.setForeground(new Color(19, 120, 189));
        heading.setBounds(265, 20, 200, 40);
        rootPanel.add(heading);

        JButton TDEE = new JButton("TDEE");
        TDEE.setBounds(200, 110, 200, 40);
        TDEE.setFocusable(false);
        TDEE.setOpaque(false);
        TDEE.setBackground(new Color(19, 120, 189));
        TDEE.setForeground(new Color(19, 120, 189));
        TDEE.setFont(new Font("Poppins", Font.PLAIN, 20));
        TDEE.setBorder(new RoundedBorder(30));
        rootPanel.add(TDEE);
        TDEE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TDEE call1 = new TDEE();
                call1.setVisible(true);
                dispose();
            }
        });

        JButton BMR= new JButton("BMR");
        BMR.setFocusable(false);
        BMR.setOpaque(false);
        BMR.setBackground(new Color(19, 120, 189));
        BMR.setForeground(new Color(19, 120, 189));
        BMR.setFont(new Font("Poppins", Font.PLAIN, 20));
        BMR.setBounds(200, 180, 200, 40);
        BMR.setBorder(new RoundedBorder(30));
        rootPanel.add(BMR);
        BMR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BMR call2 = new BMR();
                call2.setVisible(true);
                dispose();
            }
        });

        JButton BMI= new JButton("BMI");
        BMI.setFocusable(false);
        BMI.setOpaque(false);
        BMI.setBackground(new Color(19, 120, 189));
        BMI.setForeground(new Color(19, 120, 189));
        BMI.setFont(new Font("Poppins", Font.PLAIN, 20));
        BMI.setBounds(200, 250, 200, 40);
        BMI.setBorder(new RoundedBorder(30));
        rootPanel.add(BMI);
        BMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BMI call3 = new BMI();
                call3.setVisible(true);
                dispose();
            }
        });

        JButton BFAT= new JButton("Body Fat %");
        BFAT.setFocusable(false);
        BFAT.setOpaque(false);
        BFAT.setBackground(new Color(19, 120, 189));
        BFAT.setForeground(new Color(19, 120, 189));
        BFAT.setFont(new Font("Poppins", Font.PLAIN, 20));
        BFAT.setBounds(200, 320, 200, 40);
        BFAT.setBorder(new RoundedBorder(30));
        rootPanel.add(BFAT);
        BFAT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BodyFat call4 = new BodyFat();
                call4.setVisible(true);
                dispose();
            }
        });

        JButton EXIT= new JButton("Exit");
        EXIT.setFocusable(false);
        EXIT.setOpaque(false);
        EXIT.setBackground(new Color(19, 120, 189));
        EXIT.setForeground(new Color(19, 120, 189));
        EXIT.setFont(new Font("Poppins", Font.PLAIN, 20));
        EXIT.setBounds(200, 450, 200, 40);
        EXIT.setBorder(new RoundedBorder(30));
        rootPanel.add(EXIT);
        EXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
class RoundedBorder implements Border {

    public int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}
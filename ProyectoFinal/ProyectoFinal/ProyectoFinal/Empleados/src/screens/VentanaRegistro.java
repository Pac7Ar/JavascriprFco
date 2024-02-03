package screens;

import javax.swing.*;
import java.awt.*;

public class VentanaRegistro {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registrarse");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Nombre:");
        nameLabel.setBounds(10, 40, 80, 25);
        panel.add(nameLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 40, 165, 25);
        panel.add(nameText);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10,70 ,80 ,25 );
        panel.add(emailLabel);

        JTextField emailText = new JTextField (20 );
        emailText.setBounds (100 ,70 ,165 ,25 );
        panel.add(emailText);

        JLabel userLabel= new JLabel ("Usuario:");
        userLabel.setBounds (10 ,100 ,80 ,25 );
        panel.add(userLabel);

    }
}
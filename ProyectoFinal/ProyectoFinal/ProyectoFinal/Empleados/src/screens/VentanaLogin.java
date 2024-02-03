package screens;

import javax.swing.*;
import java.awt.*;

public class VentanaLogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Inicia sesión");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20); 
        passwordText.setBounds(100, 50, 165, 25); 
        panel.add(passwordText); 

        JButton loginButton = new JButton("Iniciar"); 
        loginButton.setBounds(10, 80, 150, 25); 
        panel.add(loginButton); 

        JButton registerButton = new JButton("Registrarse"); 
        registerButton.setBounds(10, 110, 150, 25); 
        panel.add(registerButton); 
    }
}

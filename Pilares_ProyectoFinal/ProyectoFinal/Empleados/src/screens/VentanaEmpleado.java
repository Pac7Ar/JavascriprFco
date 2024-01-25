import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeWindow extends JFrame {

    private JTextField employeeNumberField, searchField, nameField, addressField, telephoneField, emailField, dobField, genderField;

    public EmployeeWindow() {
        super("Employee Information");

        // Create components
        employeeNumberField = new JTextField();
        searchField = new JTextField();
        nameField = new JTextField();
        addressField = new JTextField();
        telephoneField = new JTextField();
        emailField = new JTextField();
        dobField = new JTextField();
        genderField = new JTextField();

        JButton saveButton = new JButton("Save");
        JButton modifyButton = new JButton("Modify");
        JButton deleteButton = new JButton("Delete");
        JButton clearButton = new JButton("Clear");

        // Set layout to BorderLayout
        setLayout(new BorderLayout());

        // Create panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(9, 2));
        inputPanel.add(new JLabel("Employee Number:"));
        inputPanel.add(employeeNumberField);
        inputPanel.add(new JLabel("Search:"));
        inputPanel.add(searchField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Address:"));
        inputPanel.add(addressField);
        inputPanel.add(new JLabel("Telephone:"));
        inputPanel.add(telephoneField);
        inputPanel.add(new JLabel("Email:"));
        inputPanel.add(emailField);
        inputPanel.add(new JLabel("Date of Birth:"));
        inputPanel.add(dobField);
        inputPanel.add(new JLabel("Gender:"));
        inputPanel.add(genderField);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(saveButton);
        buttonPanel.add(modifyButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);

        // Add action listeners to buttons
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement save functionality
                // You can retrieve data from fields using getText() method
            }
        });

        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement modify functionality
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement delete functionality
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement clear functionality
                clearFields();
            }
        });

        // Add panels to the frame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Set frame properties
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    private void clearFields() {
        employeeNumberField.setText("");
        searchField.setText("");
        nameField.setText("");
        addressField.setText("");
        telephoneField.setText("");
        emailField.setText("");
        dobField.setText("");
        genderField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeWindow();
            }
        });
    }
}

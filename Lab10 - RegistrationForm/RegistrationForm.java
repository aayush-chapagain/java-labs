import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {

    JTextField name, dob, contact, entrance;
    JTextArea address;
    JRadioButton male, female;
    JCheckBox nepali, foreigner, nrn;
    JComboBox<String> province;
    JTextField s10year, s10percent, s10school;
    JTextField s12year, s12percent, s12school;
    JButton submit, clear;

    RegistrationForm() {
        setTitle("B.Sc. CSIT Registration Form");
        setSize(600, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 2, 10, 10));

        // Name
        panel.add(new JLabel("Name:"));
        name = new JTextField();
        panel.add(name);

        // DOB
        panel.add(new JLabel("DOB:"));
        dob = new JTextField();
        panel.add(dob);

        // Address
        panel.add(new JLabel("Address:"));
        address = new JTextArea(2, 20);
        panel.add(address);

        // Contact
        panel.add(new JLabel("Contact:"));
        contact = new JTextField();
        panel.add(contact);

        // Gender
        panel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        panel.add(genderPanel);

        // Nationality
        panel.add(new JLabel("Nationality:"));
        JPanel natPanel = new JPanel();
        nepali = new JCheckBox("Nepali");
        foreigner = new JCheckBox("Foreign");
        nrn = new JCheckBox("NRN");
        natPanel.add(nepali);
        natPanel.add(foreigner);
        natPanel.add(nrn);
        panel.add(natPanel);

        // Province
        panel.add(new JLabel("Province:"));
        String p[] = {"Province 1", "Province 2", "Bagmati", "Gandaki",
        "Lumbini", "Karnali", "Sudurpashchim"};
        province = new JComboBox<>(p);
        panel.add(province);

        // 10th
        panel.add(new JLabel("10th (Year, %, School):"));
        JPanel p10 = new JPanel();
        s10year = new JTextField(4);
        s10percent = new JTextField(4);
        s10school = new JTextField(8);
        p10.add(s10year);
        p10.add(s10percent);
        p10.add(s10school);
        panel.add(p10);

        // 12th
        panel.add(new JLabel("12th (Year, %, School):"));
        JPanel p12 = new JPanel();
        s12year = new JTextField(4);
        s12percent = new JTextField(4);
        s12school = new JTextField(8);
        p12.add(s12year);
        p12.add(s12percent);
        p12.add(s12school);
        panel.add(p12);

        // Entrance
        panel.add(new JLabel("Entrance Marks:"));
        entrance = new JTextField();
        panel.add(entrance);

        // Buttons
        submit = new JButton("Submit");
        clear = new JButton("Clear");
        panel.add(submit);
        panel.add(clear);

        submit.addActionListener(this);
        clear.addActionListener(this);

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            JOptionPane.showMessageDialog(this, "Form Submitted Successfully!");
        }

        if (e.getSource() == clear) {
            name.setText("");
            dob.setText("");
            address.setText("");
            contact.setText("");
            entrance.setText("");
            s10year.setText("");
            s10percent.setText("");
            s10school.setText("");
            s12year.setText("");
            s12percent.setText("");
            s12school.setText("");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
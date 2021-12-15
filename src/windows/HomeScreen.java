package windows;

import javax.swing.*;
import java.awt.*;

/**
 This frame his the home screen where you login with
 username and password. Option to create new account.
 */

public class HomeScreen extends JFrame
{

    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 500;
    private JButton button;
    private JLabel uNLabel;
    private JTextField uNField;
    private JLabel pWLabel;
    private JTextField pWField;


    public HomeScreen()
    {
        createButton();
        createUNField();
        createPWField();
        createPanel();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }


    public void createUNField()
    {
        uNLabel = new JLabel("Username");
        uNField = new JTextField(20);
        uNField.setSize(20,5);
    }

    public void createPWField()
    {
        pWLabel = new JLabel("Password");
        pWField = new JTextField(20);
    }

    public void createButton()
    {
        button = new JButton("Login");
    }

    public void createPanel()
    {
        JPanel panel = new JPanel();
        //panel.setLayout(new BorderLayout());
        panel.add(button);
        panel.add(uNLabel);
        panel.add(uNField);
        panel.add(pWLabel);
        panel.add(pWField);
        add(panel);
    }


}

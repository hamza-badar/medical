package com.medical;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener
{
    private JButton b1,b2,b3,b4,b5;
    private JLabel l1;
    Home()
    {
        l1=new JLabel("Notifications");
        b1=new JButton("Add Medicine");
        b2=new JButton("Delete Medicine");
        b3=new JButton("Search Medicine");
        b4=new JButton("Create Bill");
        b5=new JButton("Logout");

        appendListener();

        setComponentStyle();

        setLayoutManager();

        addComponent();

        setOnCloseEvent();

    }
    private void setComponentStyle()
    {
        l1.setBounds(590,300,250,40);
        b1.setBounds(300,100, 350,55);
        b2.setBounds(700,100, 350,55);
        b3.setBounds(300,200, 350,55);
        b4.setBounds(700,200, 350,55);
        b5.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width-150,20,100,30);

        b1.setBackground(new Color(41, 61, 61));
        b1.setForeground(Color.white);
        b2.setBackground(new Color(41, 61, 61));
        b2.setForeground(Color.white);
        b3.setBackground(new Color(41, 61, 61));
        b3.setForeground(Color.white);
        b4.setBackground(new Color(41, 61, 61));
        b4.setForeground(Color.white);
        b5.setBackground(Color.RED);
        b5.setForeground(Color.white);

        l1.setFont(new Font("Times New Roman", Font.BOLD,  30));
        b1.setFont(new Font("Times New Roman", Font.PLAIN,  30));
        b2.setFont(new Font("Times New Roman", Font.PLAIN,  30));
        b3.setFont(new Font("Times New Roman", Font.PLAIN,  30));
        b4.setFont(new Font("Times New Roman", Font.PLAIN,  30));
        b5.setFont(new Font("Times New Roman", Font.BOLD,  17));
    }
    private void setLayoutManager()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,screenSize.width, screenSize.height);
        setLayout(null);
    }

    private void addComponent()
    {
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
    private void appendListener()
    {
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        switch(e.getActionCommand())
        {
            case "Add Medicine":
                break;
            case "Delete Medicine" :
                break;
            case "Search Medicine" :
                break;
            case "Create Bill" :
                break;
            case "Logout" :
                this.setVisible(false);
                break;
        }
    }
    private void setOnCloseEvent()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
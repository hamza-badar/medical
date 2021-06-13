package com.medical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.SQLException;

public class AddMedicine extends JFrame implements ActionListener
{
    private JLabel title,name,shelf,quantity,status;
    private JTextField nameInput,shelfInput,quantityInput;
    private JButton addBtn;

    AddMedicine()
    {
        title=new JLabel("Enter Medicine Detail");
        name=new JLabel("Name  ");
        shelf=new JLabel("Shelf");
        quantity=new JLabel("Quantity");
        status=new JLabel("");

        nameInput=new JTextField();
        shelfInput=new JTextField();
        quantityInput=new JTextField();

        addBtn=new JButton("ADD");

        appendListener();

        setComponentStyle();

        setLayoutManager();

        addComponent();

        setOnCloseEvent();
    }
    private void appendListener()
    {
        addBtn.addActionListener( this);

        quantityInput.addKeyListener( new KeyAdapter()
        {
            public void keyPressed(KeyEvent ke)
            {
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    quantityInput.setEditable(true);
                } else {
                    quantityInput.setEditable(false);
                    quantityInput.setText("");
                }
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        CreateConn con=CreateConn.estConnection();

        try {
            String sql = "insert into Medicines values(,'Leather');";
            PreparedStatement stmt=con.conn.prepareStatement("insert into Medicines values(?,?,?)");
            stmt.setString(1,nameInput.getText());
            stmt.setString(2,shelfInput.getText());
            stmt.setInt(3,Integer.valueOf(quantityInput.getText()));
            status.setText("added sucessfully");
            Thread.sleep(100);
            status.setText("");
            nameInput.setText("");
            shelfInput.setText("");
            quantityInput.setText("");
        }
        catch (SQLException throwables)
        {
            status.setForeground(Color.RED);
            status.setText("Unable to add try again!!!");
        }
        catch(InterruptedException excep)
        {

        }


    }
    private void setComponentStyle()
    {
        title.setBounds(500, 100, 700, 50);
        name.setBounds(550,160,150,30);
        shelf.setBounds(550,220,150,30);
        quantity.setBounds(550,280,150,30);
        status.setBounds(630,320,200,20);

        nameInput.setBounds(695,160,150,30);
        shelfInput.setBounds(695,220,150,30);
        quantityInput.setBounds(695,280,150,30);
        addBtn.setBounds(650,340,100,30);
        status.setForeground(new Color(0, 128, 0));

        addBtn.setBackground(new Color(0, 128, 0));
        addBtn.setForeground(Color.white);

        title.setFont(new Font("Times New Roman", Font.BOLD,  40));
        name.setFont(new Font("Times New Roman", Font.BOLD,  20));
        shelf.setFont(new Font("Times New Roman", Font.BOLD,  20));
        quantity.setFont(new Font("Times New Roman", Font.BOLD,  20));
        addBtn.setFont(new Font("Times New Roman", Font.BOLD,  20));
        status.setFont(new Font("Times New Roman", Font.PLAIN,  15));
    }
    private void setLayoutManager()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,screenSize.width, screenSize.height);
        setLayout(null);
    }
    private void addComponent()
    {
        add(title);
        add(name);
        add(shelf);
        add(nameInput);
        add(shelfInput);
        add(quantity);
        add(quantityInput);
        add(addBtn);
        add(status);
    }
    private void setOnCloseEvent()
    {
        this.setVisible(false);
    }
}

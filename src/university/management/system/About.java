package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame{
    
    public About(){
        
        setSize(700, 500);
        setLocation(500, 150); 
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System :</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By : Kanishk, Shruti & Sameer.");
        name.setBounds(50, 220, 585, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        JLabel rollno = new JLabel("Roll number : 220938106084, 220938106196, 220938106096");
        rollno.setBounds(50, 280, 580, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno);
        
        JLabel contact = new JLabel("Contact : kanishk.yadav0202@gmail.com");
        contact.setBounds(50, 320, 580, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(contact);
                
        setLayout(null);
        
        
        
        setVisible(true);
    }
    
    public static void main(String args[]){
        new About();
    }
}

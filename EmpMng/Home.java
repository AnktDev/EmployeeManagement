import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    JButton view, add, update, remove;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1020, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1020, 600);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(530, 30, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(550, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employees");
        view.setBounds(730, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(550, 150, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(730, 150, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1020, 600);
        setLocation(240, 80);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }   
    }

    public static void main(String[] args) {
        new Home();
    }
}

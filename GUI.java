
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static jdk.nashorn.tools.ShellFunctions.input;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class GUI extends JFrame implements ActionListener{
    //varibles
    private Store store;
    JPanel p1 = new JPanel();
    JLabel objLabel1 = new JLabel("Enter Product ID: ");
    JLabel objLabel2 = new JLabel();
    JTextField objText = new JTextField();
    JButton objButton = new JButton("Click");
    JTextArea objArea = new JTextArea();
    

    public GUI(Store store){
        this.store=store;
        objArea.setText(store.toString());
         
        //setting
        
        //panel
        p1.setLayout(new GridLayout(5,1));
        
        //textArea
        objArea.setFont(new Font("Arial",Font.BOLD,16));
        objArea.setForeground(Color.BLACK);
        objArea.setEnabled(true);
        //Scroll Bar
        objArea.setLineWrap(true);
        objArea.setWrapStyleWord(true);
        JScrollPane objS = new JScrollPane(objArea);
        objS.setBounds(40, 40, 200, 100);
        
        //label
      
        objLabel1.setFont(new Font("Arial",Font.BOLD,15));
        objLabel1.setForeground(Color.BLACK);
        objLabel1.setEnabled(true);
        

        objLabel2.setFont(new Font("Arial",Font.BOLD,15));
        objLabel2.setForeground(Color.BLACK);
        objLabel2.setEnabled(true);
        
        //textField
        objText.setFont(new Font("Arial",Font.BOLD,10));
        objText.setForeground(Color.BLACK);
        objText.setEnabled(true);
        
        // button
        objButton.setFont(new Font("Arial",Font.BOLD,30));
        objButton.setForeground(Color.PINK);
        objButton.setEnabled(true);
        objButton.addActionListener(this);
        
        
        //add
        add(p1);
        p1.add(objS);
        p1.add(objLabel1);
        p1.add(objText);
        p1.add(objButton);
        p1.add(objLabel2);
        
        //settings of frame
        setSize(500,600);
        setTitle("CS151-375-Group8");
        setVisible(true);//tow show widow or frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);//close run
    }
    @Override
        public void actionPerformed(ActionEvent event){
            
            if(store.Remove( Integer.parseInt(objText.getText()) )){
                objLabel2.setText("Removed the product correctly.");
                objArea.setText(store.toString());}
            else{
                objLabel2.setText("The product cannot be removed. Enter an existed product.");
                objArea.setText(store.toString());}

    }
}

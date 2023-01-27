/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuexample;


import javax.swing.*;
/*import java.awt.*;*/
import java.awt.event.*;

public class MenuExample extends JFrame implements ActionListener {

    JFrame frame;
    JMenu dates, control;
    JMenuBar menu;
    JTextArea t;
    JMenuItem fibre,copper,straight,exit,reset;
    
   
    
    MenuExample(){
        frame=new JFrame("Aphiwe Express");
        fibre=new JMenuItem("Fibre Optic");
        copper=new JMenuItem("Copper");
        straight=new JMenuItem("Straigh-through");
        
        exit=new JMenuItem("Exit");
        reset=new JMenuItem("Reset Fields");
        
        
        
        fibre.addActionListener(this);
        copper.addActionListener(this);
        straight.addActionListener(this);
        
        reset.addActionListener(this);
        exit.addActionListener(this);
        
        
        menu=new JMenuBar();
        
        dates=new JMenu("Cables");
        control = new JMenu("Frame Controls");
        
        
        
        dates.add(fibre);
        dates.add(copper);
        dates.add(straight);
        
        control.add(exit);
        control.add(reset);
        
        menu.add(dates);
        menu.add(control);
        
        t=new JTextArea();
        t.setEditable(false);
        t.setBounds(5,5,360,320);
        frame.add(menu);
        frame.add(t);
        
        frame.setJMenuBar(menu);
        
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==exit){
            int n=JOptionPane.showConfirmDialog(null,"Are you sure you want to exit the program?","Exit dialog box",JOptionPane.OK_CANCEL_OPTION);
            if (n==JOptionPane.OK_OPTION){
                System.exit(0);
            }
        }
        if(e.getSource()==fibre)
            t.setText("You have selected a Fibre Optic cable, an agent will attend you shortly");
        if(e.getSource()==copper)
             t.setText("You have selected a Copper cable, an agent will attend you shortly");
         if(e.getSource()==straight)
             t.setText("You have selected a Straight-through cable, an agent will attend you shortly");
        if(e.getSource()==reset)
            t.setText("");
    }
   
    
    
   
    public static void main(String[] args) {
        
       new MenuExample();
    }
    
}
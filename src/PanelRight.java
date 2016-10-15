/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacobdhayes jdh5656
 */

import java.awt.*;
import javax.swing.*;
public class PanelRight extends JPanel
{
//    public PanelRight ()
//    {
//        super ();
//        BorderLayout border = new BorderLayout();
//        setLayout(border);
//        setBackground(Color.pink);
//        JButton jb1 = new JButton("I am on the North");
//        jb1.setBackground(Color.WHITE);
//        JButton jb2 = new JButton("I am in the middle");
//        jb2.setBackground(Color.yellow);
//        JButton jb3 = new JButton("I am on the South)");
//        jb3.setBackground(Color.CYAN);
//        add(jb1,"North");
//        add(jb2,"Center");
//        add(jb3,"South");
//    }
    
    public PanelRight ()
    {
        super ();
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setBackground(Color.gray);
        
        ImageIcon imageR = new ImageIcon("images/R10.jpg");
        JLabel label = new JLabel("", imageR, JLabel.CENTER);
        
        add(label,"Center");
    }
}
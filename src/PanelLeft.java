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
public class PanelLeft extends JPanel
{
//    public PanelLeft ()
//    {
//        super ();
//        GridLayout grid = new GridLayout(1,3);
//        setLayout(grid);
//        setBackground(Color.pink);
//        JButton jb1 = new JButton("I belong to panel left)");
//        JButton jb2 = new JButton("Hi");
//        jb2.setBackground(Color.red);
//        JButton jb3 = new JButton("I am a JButton)");
//        add(jb1);
//        add(jb2);
//        add(jb3);
//    }
    
    public PanelLeft ()
    {
        super ();
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setBackground(Color.black);
        JButton jb1 = new JButton("First Button");
        jb1.setBackground(Color.blue);
        JButton jb2 = new JButton("Second Button");
        jb2.setBackground(Color.yellow);
        ImageIcon imageFred = new ImageIcon("images/fred.jpg");
        JButton jb3 = new JButton(imageFred); //JButton with image only
        jb3.setText("Fred");// adds a text to an existing button

        add(jb1,"North");
        add(jb2,"Center");
        add(jb3,"South");
    }
}
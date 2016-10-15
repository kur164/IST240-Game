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
public class myJPanel extends JPanel
{
    public myJPanel ()
    {
        super ();
        GridLayout grid = new GridLayout(1,1);
        setLayout(grid);
        setBackground(Color.green);
        
        //Create Panels
        PanelLeft left = new PanelLeft();
        PanelRight right = new PanelRight();
        IntroScreen intro = new IntroScreen();
        Instructions instructions = new Instructions();
        GameDesigners gameDesigners = new GameDesigners();
        
        
        //Add Panels
        //add(left);
        //add(right);
        add(intro);
        add(instructions);
        add(gameDesigners);
        
    }

}
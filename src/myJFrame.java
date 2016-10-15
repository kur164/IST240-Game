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

public class myJFrame extends JFrame 
{
    myJPanel mjp;
    public myJFrame()
    {
        super ("My First Frame");
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear 
        try 
        {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) 
        {
            e.printStackTrace();
        } 
        //------------------------------------------------------
        // Create components: JPanel
        mjp = new myJPanel();
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mjp,"Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (1300, 800);
        setVisible(true);
    }
}

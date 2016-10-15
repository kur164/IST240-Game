import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nickonofrio
 */
public class IntroScreen extends JPanel {

    public IntroScreen()
    {
        super();
        
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear 

        
        GridLayout grid = new GridLayout(6,1);
        setLayout(grid);
        setBackground(Color.orange);
        
        //Create JLabels
        JLabel l1 = new JLabel("Welcome to our Game");
        l1.setHorizontalAlignment(JLabel.CENTER);
        
        //Create JButtons
        JButton jb1 = new JButton("Instructions");
        
        JButton jb2 = new JButton("Game Designers");
        
        //Add Components
        add(l1);
        add(jb1);
        add(jb2);
    }

    
}
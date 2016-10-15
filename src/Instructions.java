import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nickonofrio
 */
public class Instructions extends JPanel {

    public Instructions()
    {
        super();
    
         GridLayout grid = new GridLayout(6,1);
        setLayout(grid);
        setBackground(Color.yellow);
        
        //Create JLabels
        JLabel l1 = new JLabel("Instructions");
        l1.setHorizontalAlignment(JLabel.CENTER);
        
        //Create JButtons
        JButton jb1 = new JButton("Back to Intro");
        
        
        //Add Components
        add(l1);
        add(jb1);
    }

    
}
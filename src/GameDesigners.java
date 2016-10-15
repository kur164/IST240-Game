import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nickonofrio
 */
public class GameDesigners extends JPanel {

    public GameDesigners()
    {
        super();
    
         GridLayout grid = new GridLayout(6,1);
        setLayout(grid);
        setBackground(Color.blue);
        
        //Create JLabels
        JLabel l1 = new JLabel("John");
        l1.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel l2 = new JLabel("Jacob");
        l2.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel l3 = new JLabel("Karin");
        l3.setHorizontalAlignment(JLabel.CENTER);
        
        ImageIcon nick = new ImageIcon("images/NickOnofrio.jpg");
        JLabel l4 = new JLabel("Nick",nick,JLabel.CENTER);
        
        //Create JButtons
        JButton jb1 = new JButton("Back to Intro");
        
        
        //Add Components
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(jb1);
    }

    
}
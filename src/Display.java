import java.awt.Graphics; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
/**
 * @author Sayham Chowdhury
 *
 */
@SuppressWarnings("serial")
public class Display extends JPanel { 
	//private static final long serialVersionUID = 1L; 
	Controller controller ; 
	
	public void paintComponent(Graphics g) { 
		super.paintComponent(g); 
		g.fillRect(0, 0, getWidth(), getHeight()); 
		controller.draw(g); 
		} 
	// Display the frame
	public Display (Controller con) { 
		controller = con;
		JFrame frame = new JFrame(); 
		frame.add(this); 
		frame.setTitle("Paddle Ball");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);//Set frame location
		//frame.setResizable(false);  
		frame.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE ); 
	}
}
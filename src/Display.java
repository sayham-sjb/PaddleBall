import java.awt.Graphics; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
/**
 * The Class Display to display paddle, 
 * ball, frame in the order.
 * @author Sayham Chowdhury
 */
public class Display extends JPanel { 
	
	/** The controller. */
	//private static final long serialVersionUID = 1L; 
	Controller controller ; 
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) { 
		super.paintComponent(g); 
		g.fillRect(0, 0, getWidth(), getHeight()); 
		controller.draw(g); 
		} 
	
	/**
	 * Instantiates a new display.
	 * Display the frame
	 * @param con 
	 * @see Controller
	 */
	public Display (Controller con) { 
		controller = con;
		JFrame frame = new JFrame(); 
		frame.add(this); 
		frame.setTitle("Paddle Ball-sjb");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);//Set frame location
		//frame.setResizable(false);  
		frame.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE); 
	}
}
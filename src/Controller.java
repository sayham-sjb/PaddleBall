import java.awt.Graphics;
import java.awt.event.*; 
import javax.swing.*; 
/**
 * The Class Controller controls the mouse events and the movements 
 * of the paddle and ball.
 * @author Sayham Chowdhury
 */
public class Controller implements ActionListener, MouseMotionListener {	  
	
	/** The ball. */
	private Ball ball; 
	
	/** The paddle. */
	private Paddle paddle; 
	
	/** The display. */
	private Display display; 
	
	/** The time. */
	private Timer time; 
	
	/**
	 * Instantiates a new controller.
	 * Move paddle, set timer.
	 * @param g 
	 */
	public Controller (Graphics g) { 
		paddle = new Paddle(); 
		ball = new Ball(); 
		display = new Display(this);  
		display.addMouseMotionListener(this);//Move Paddle with mouse
		time = new Timer(25, this);//Set a Timer
		time.setInitialDelay(500); 
		time.start();//Start Timer
		}
	
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	//Detecting the Ball has contact with Paddle
	public void actionPerformed (ActionEvent e) { 
		ball.moveBall(display.getWidth(), display.getHeight()); 
		paddleHit(); 
		display.repaint(); 
		}
	
	/* (non-Javadoc)
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
	 */
	//Determine Paddle Position
	public void mouseDragged (MouseEvent e) { 
		paddle.positionOfPaddle(e.getX() - 25, display.getWidth()); 
		display.repaint();
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
	 */
	public void mouseMoved (MouseEvent e) { 
		paddle.positionOfPaddle(e.getX() - 25, display.getWidth()); 
		display.repaint(); 
		} 
	
	/**
	 * Draw.
	 * Check if Ball, Paddle exists then redraw
	 * @param g 
	 * @see Ball
	 */
	public void draw(Graphics g) { 
		if (ball != null) 
			ball.drawBall(g);
		if (paddle != null) 
			paddle.drawPaddle(g); 
		} 
	
	/**
	 * Paddle hit.
	 * Determine Ball hits the Paddle
	 * @see Ball
	 */
	public void paddleHit () {   
		if (ball.getTop() <= paddle.getBottom() 
				&& ball.getTop() >= paddle.getBottom() - 5)
			if (ball.getRight()-2 >= paddle.getLeft() 
				&& ball.getLeft() +2 <= paddle.getRight()) 
				
			ball.changeDirY();
		}
	}
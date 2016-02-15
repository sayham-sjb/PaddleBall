import java.awt.Graphics;
import java.awt.event.*; 
import javax.swing.*; 
/**
 * @author Sayham Chowdhury
 *
 */
public class Controller implements ActionListener, MouseMotionListener {	  
	private Ball ball; 
	private Paddle paddle; 
	private Display display; 
	private Timer time; 
	
	public Controller (Graphics g) { 
		paddle = new Paddle(); 
		ball = new Ball(); 
		display = new Display(this);  
		display.addMouseMotionListener(this);//Move Paddle with mouse
		time = new Timer(25, this);//Set a Timer
		time.setInitialDelay(500); 
		time.start();//Start Timer
		}
	
	//Detecting the Ball has contact with Paddle
	public void actionPerformed (ActionEvent e) { 
		ball.moveBall(display.getWidth(), display.getHeight()); 
		paddleHit(); 
		display.repaint(); 
		}
	
	//Determine Paddle Position
	public void mouseDragged (MouseEvent e) { 
		paddle.positionOfPaddle(e.getX() - 25, display.getWidth()); 
		display.repaint();
	}
	
	public void mouseMoved (MouseEvent e) { 
		paddle.positionOfPaddle(e.getX() - 25, display.getWidth()); 
		display.repaint(); 
		} 
	
	//Check if Ball & Paddle exists then redraw
	public void draw(Graphics g) { 
		if (ball != null) 
			ball.drawBall(g);
		if (paddle != null) 
			paddle.drawPaddle(g); 
		} 
	
	//Determine Ball hits the Paddle
	public void paddleHit () {   
		if (ball.getTop() <= paddle.getBottom() 
				&& ball.getTop() >= paddle.getBottom() - 5)
			if (ball.getRight()-2 >= paddle.getLeft() 
				&& ball.getLeft() +2 <= paddle.getRight()) 
				
			ball.changeDirY();
		}
	}
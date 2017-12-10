import java.awt.Color; 
import java.awt.Graphics; 
/**
 * The Class Ball. 
 * It creates and shapes the ball for the project.
 * @author Sayham Chowdhury
 */
public class Ball { 
	
	/** The diameter. */
	private final int diameter; 
	
	/** The ball x. */
	private int ballX;
	
	/** The ball y. */
	private int ballY; 
	
	/** The move on x. */
	private int moveOnX = 5; 
	
	/** The move on y. */
	private int moveOnY = 5; 
	
	/**
	 * Instantiates a new ball.
	 */
	public Ball() {
		diameter = 8;
		ballX = 0;
		ballY = 20; 
		}  
	
	/**
	 * Draw ball with current position.
	 * @param g the graphic object by the controller
	 * @see Controller
	 */
	public void drawBall(Graphics g) { 
		g.setColor(Color.cyan); 
		g.fillOval(ballX , ballY , diameter , diameter ); 
		} 
	
	/**
	 * Gets the top.
	 * @return the top
	 */
	public int getTop() { 
		return ballY; 
		} 
	
	/**
	 * Gets the bottom.
	 * @return the bottom
	 */
	public int getBottom() { 
		return (ballY + diameter ); 
		} 
	
	/**
	 * Gets the left.
	 * @return the left
	 */
	public int getLeft() { 
		return ballX ; 
		} 
	
	/**
	 * Gets the right.
	 * @return the right
	 */
	public int getRight() { 		
		return (ballX + diameter); 
		} 
	
	/**
	 * Center x.
	 * @return the int
	 */
	public int centerX() { 
		return ballX + (diameter / 2); 
		} 
	
	/**
	 * Center y.
	 * @return the int
	 */
	public int centerY() { 
		return ballY + (diameter / 2); 
		} 
	
	/**
	 * Change dir x.
	 * Reverse the X direction
	 */
	public void changeDirX() {
		moveOnX = - moveOnX ; 
		} 
	
	/**
	 * Change dir y.
	 * Reverse the Y direction
	 */
	public void changeDirY() {
		moveOnY = - moveOnY;
		}
	
	/**
	 * Move ball.
	 * Determine position changes.
	 * @param width the width
	 * @param height the height
	 */
	public void moveBall(int width, int height) { 
		ballX += moveOnX; 
		ballY += moveOnY;
		
		if (getTop() <= 0)
			changeDirY();
		if (getBottom() >= height)
			changeDirY();
		if (getLeft() <= 0)
			changeDirX();
		if (getRight() >= width)
			changeDirX();
		}
	}


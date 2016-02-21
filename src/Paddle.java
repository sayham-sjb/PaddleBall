import java.awt.Color; 
import java.awt.Graphics; 
/**
 * @author Sayham Chowdhury
 * The Class Paddle creates and shapes the paddle.
 * Paddle only moves horizontally on top of the display.
 * Position represents the center of the playing surface
 */
public class Paddle { 
	
	/** The paddle to x. */
	private int paddleToX ; 
	
	/** The paddle to y. */
	final int paddleToY = 15; 
	
	/** The paddle length. */
	final int paddleLength = 16; 
	
	/** The paddle width. */
	final int paddleWidth = 70;
	
	/**
	 * Instantiates a new paddle.
	 */
	public Paddle() { 
		positionOfPaddle(100, 300); 
		} 
	
	/**
	 * Position of paddle.
	 * @param mousePosition for the mouse position of paddle 
	 * @param width the width of the paddle
	 */
	public void positionOfPaddle(int mousePosition, int width) { 
		if (mousePosition < 0) 
			paddleToX = 0;
		else if (mousePosition >= width - 70) 
			paddleToX = width - 70;
		else 
			paddleToX = mousePosition; 
		} 
	
	/**
	 * Draw rectangular paddle by Graphics class.
	 * Display a Paddle.
	 * @param g the g
	 * @see Controller
	 */
	public void drawPaddle(Graphics g) { 
		g.setColor(Color. red ); 
		g.fillRect(paddleToX , paddleToY , paddleWidth , paddleLength); 
		} 
	
	/**
	 * Get the top position of the Paddle.
	 * @return the top position of the Paddle.
	 */
	public int getTop() { 
		return paddleToY ; 
		}
	
	/**
	 * Gets the bottom Position of the Paddle
	 * @return the bottom position of the Paddle.
	 */
	public int getBottom() { 
		return (paddleToY + paddleLength); 
		} 
	
	/**
	 * Gets the Right Position of the Paddle.
	 * @return the right position of the Paddle.
	 */
	public int getRight() { 
		return (paddleToX + paddleWidth); 
		}
	
	/**
	 * Gets the Left Position of the Paddle.
	 * @return the left position of the Paddle.
	 */
	public int getLeft() { 
		return paddleToX ; 
		} 
	}
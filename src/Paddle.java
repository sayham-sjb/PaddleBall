import java.awt.Color; 
import java.awt.Graphics; 
/**
 * @author Sayham Chowdhury
 *
 */
public class Paddle { 
	private int paddleToX ; 
	final int paddleToY = 15; 
	final int paddleLength = 16; 
	final int paddleWidth = 70;
	
	public Paddle() { 
		positionOfPaddle(100, 300); 
		} 
	
	// Position of the Paddle
	public void positionOfPaddle(int mousePosition, int width) { 
		if (mousePosition < 0) 
			paddleToX = 0;
		else if (mousePosition >= width - 70) 
			paddleToX = width - 70;
		else 
			paddleToX = mousePosition; 
		} 
	
	// Display a Paddle
	public void drawPaddle(Graphics g) { 
		g.setColor(Color. red ); 
		g.fillRect(paddleToX , paddleToY , paddleWidth , paddleLength); 
		} 
	
	// Top Position of the Paddle
	public int getTop() { 
		return paddleToY ; 
		}
	
	// Bottom Position of the Paddle
	public int getBottom() { 
		return (paddleToY + paddleLength); 
		} 
	
	// Right Position of the Paddle
	public int getRight() { 
		return (paddleToX + paddleWidth); 
		}
	
	// Left Position of the Paddle
	public int getLeft() { 
		return paddleToX ; 
		} 
	}
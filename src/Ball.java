import java.awt.Color; 
import java.awt.Graphics; 
/**
 * @author Sayham Chowdhury
 *
 */
public class Ball { 
	private final int diameter; 
	private int ballX;
	private int ballY; 
	private int moveOnX = 5; 
	private int moveOnY = 5; 
	
	public Ball() {
		diameter = 8;
		ballX = 0;
		ballY = 20; 
		}  
	
	public void drawBall(Graphics g) { 
		g.setColor(Color.cyan ); 
		g.fillOval(ballX , ballY , diameter , diameter ); 
		} 
	
	public int getTop() { 
		return ballY; 
		} 
	
	public int getBottom() { 
		return (ballY + diameter ); 
		} 
	
	public int getLeft() { 
		return ballX ; 
		} 
	
	public int getRight() { 		
		return (ballX + diameter ); 
		} 
	
	public int centerX() { 
		return ballX + (diameter / 2); 
		} 
	
	public int centerY() { 
		return ballY + (diameter / 2); 
		} 
	
	public void changeDirX() {//Reverse the X direction
		moveOnX = - moveOnX ; 
		} 
	
	public void changeDirY() {//Reverse the Y direction
		moveOnY = - moveOnY;
		}
	
	public void moveBall(int width, int height) { //Determine position changes
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


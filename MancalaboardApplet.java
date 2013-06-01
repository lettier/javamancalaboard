import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MancalaboardApplet extends Applet {
	public void init() {
		add(new Mancalaboard(this));
	}	
}

class Mancalaboard extends Canvas {
	public Mancalaboard(Applet parentApplet) {
		setSize( 301, 155);
		
		setBackground( new Color( 219, 185, 122 ) );
	}
		
	public void paint(Graphics g) {
		
		g.setColor( new Color( 135, 60, 31 ) );
		
		g.fillOval( 11,11,31,129);
		
		g.setColor( new Color( 25, 0, 0 ) );
		
		g.drawOval( 11,11,31,129);
		
		////////////////////////////////////////////
		
		g.setColor( new Color( 135, 60, 31 ) );
		
		g.fillOval( 259,11,31,129);
		
		g.setColor( new Color( 25, 0, 0 ) );
		
		g.drawOval( 259,11,31,129);

		for ( int i = 0 ; i < 5 ; i++ )
		{
			g.setColor( new Color( 135, 60, 31 ) );
		
			g.fillOval( 52+(i*41),11,31,31);
		
			g.setColor( new Color( 25, 0, 0 ) );
		
			g.drawOval( 52+(i*41),11,31,31);
		
		}
		
		for ( int i = 0 ; i < 5 ; i++ )
		{
		
			g.setColor( new Color( 135, 60, 31 ) );
		
			g.fillOval( 52+(i*41),109,31,31);
		
			g.setColor( new Color( 25, 0, 0 ) );
		
			g.drawOval( 52+(i*41),109,31,31);

		}
	}
}


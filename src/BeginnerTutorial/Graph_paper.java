/**
 * 
 */
package BeginnerTutorial;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Saif_sust_2013331007
 *
 */
public class Graph_paper extends Applet {

	private final int Width = 500;
	private final int Height = 500;
	private int width, height;
	private final int gap = 20;

	public void init() {
		setSize(Width, Height);
		width = getWidth();
		height = getHeight();

	}

	public void start() {

	}

	public void stop() {

	}

	public void destroy() {

	}

	public void paint(Graphics g) {

		int x = 20, y = 20;

		g.setColor(Color.BLACK);
		g.drawLine(x, y, x * 20, y);
		g.drawLine(x, y * 20, x * 20, y * 20);

		for (int i = 0; i < x; i++) {
			g.drawLine(x + gap * i, y, x + gap * i, y * 20);
			g.drawLine(x, y + gap * i, x * 20, y + gap * i);
		}

		g.setColor(Color.ORANGE);
		g.fillRect(x, y * 8, x * 11, y *11);

		g.setColor(Color.BLACK);
		g.drawRect(x*2 , y * 10, x*7, y*7);

	}
}

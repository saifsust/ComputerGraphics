/**
 * 
 */
package BeginnerTutorial;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

/**
 * @author Saif_sust_2013331007
 *
 */
public class drawLine extends Applet {

	private Image img;

	private int width, height;

	public void init() {

		setSize(500, 500);
		setName("Saiful Islam");
		width = getWidth();
		height = getHeight();
		img = getImage(getDocumentBase(), "a.jpg");
		// img = new Image(getDocumentBase(),new File("").toURI().toString());
	}

	public void start() {

	}

	public void stop() {

	}

	public void destroy() {

	}

	public void paint(Graphics g) {

		g.setColor(Color.PINK);

		g.drawImage(img, 5, 5, this);
		// g.drawString("Welcome", 10, 20);
		for (int i = 0; i < 100; i++) {
			// g.drawLine(width, height, i*10, 2);
		}
	}
}

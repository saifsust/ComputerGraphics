/**
 * 
 */
package BeginnerTutorial;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * @author Saif_sust_2013331007
 *
 */
public class helloWorld_applet extends Applet {

	public void init() {
		System.out.println("hello init method");
	}

	public void paint(Graphics g) {
		System.out.println("hello paint Method");
		g.drawString("Hello Applet Tutorial", 10, 100);

	}

	public void start() {

		System.out.println("hello start Method");

	}

	/*
	 * public void stop() { System.out.println("hello Stop Method"); }
	 */
	public void destroy() {
		System.out.println("hello Destroy Method");
	}

}

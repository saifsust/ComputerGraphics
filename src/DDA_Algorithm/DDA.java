/**
 * 
 */
package DDA_Algorithm;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;

/**
 * @author Saif_sust_2013331007
 *
 */
public class DDA extends Applet implements sizeConfig, colorConfig, layoutConfig, ActionListener {

	private int x1, y1, x2, y2, dx, dy;

	public void init() {
		this.setLayout(null);
		this.setBackground(windowColor);
		this.setSize(windowWidth, windowHeight);
		this.add(draw);
		this.add(tx1);
		this.add(ty1);
		this.add(tx2);
		this.add(ty2);
		this.add(new label(initLayoutX, initLayoutY, "X1"));
		this.add(new label(initLayoutX, initLayoutY + prefTextFieldHeight + 5, "Y1"));
		this.add(new label(initLayoutX, initLayoutY + 2 * (prefTextFieldHeight + 5), "X2"));
		this.add(new label(initLayoutX, initLayoutY + 3 * (prefTextFieldHeight + 5), "Y2"));
		draw.addActionListener(this);
	}

	public void start() {

	}

	public void stop() {

	}

	public void destroy() {

	}

	public void clear() {
		tx1.setText(null);
		ty1.setText(null);
		tx2.setText(null);
		ty2.setText(null);
	}

	public boolean notEmpty() {
		return !tx1.getText().trim().isEmpty() && !ty1.getText().trim().isEmpty() && !tx2.getText().trim().isEmpty()
				&& !ty2.getText().trim().isEmpty();
	}

	public void paint(Graphics g) {

		// System.out.println(tx1.getText());
		if (notEmpty()) {
			x1 = Integer.parseInt(tx1.getText());
			y1 = Integer.parseInt(ty1.getText());
			x2 = Integer.parseInt(tx2.getText());
			y2 = Integer.parseInt(ty2.getText());
			// System.out.println(x1);
			y1 += buttonLayoutY + 5 * (prefTextFieldHeight + 5);
			y2 += buttonLayoutY + 5 * (prefTextFieldHeight + 5);
			dx = x2 - x1;
			dy = y2 - y1;
			int step = Math.max(Math.abs(dx), Math.abs(dy));
			float x, y, xIncr, yIncr;
			xIncr = (float) dx / (float) step;
			yIncr = (float) dy / (float) step;
			System.out.println(xIncr + " " + yIncr);
			x = x1;
			y = y1;
			g.drawString(".", (int) x, (int) y);
			for (int i = 1; i < step; i++) {
				x = x + xIncr;
				y = y + yIncr;
				// System.out.println(x + " " + y);
				g.drawString(".", (int) x, (int) y);
			}

			// clear();
		}

	}

	public void actionPerformed(ActionEvent event) {
		repaint();
	}

	private button draw = new button(buttonLayoutX, buttonLayoutY + 4 * (prefTextFieldHeight + 5), "Draw");
	private textField tx1 = new textField(initLayoutX + prefLabelWidth + 10, initLayoutY);
	private textField ty1 = new textField(initLayoutX + prefLabelWidth + 10,
			initLayoutY + 1 * (prefTextFieldHeight + 5));
	private textField tx2 = new textField(initLayoutX + prefLabelWidth + 10,
			initLayoutY + 2 * (prefTextFieldHeight + 5));
	private textField ty2 = new textField(initLayoutX + prefLabelWidth + 10,
			initLayoutY + 3 * (prefTextFieldHeight + 5));

}

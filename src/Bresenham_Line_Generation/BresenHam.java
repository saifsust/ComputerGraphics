/**
 * 
 */
package Bresenham_Line_Generation;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;

import DDA_Algorithm.button;
import DDA_Algorithm.colorConfig;
import DDA_Algorithm.label;
import DDA_Algorithm.layoutConfig;
import DDA_Algorithm.sizeConfig;
import DDA_Algorithm.textField;

/**
 * @author Saif_sust_2013331007
 *
 */
public class BresenHam extends Applet implements sizeConfig, colorConfig, layoutConfig, ActionListener {

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
			dx = Math.abs(x2 - x1);
			dy = Math.abs(y2 - y1);

			int x, y, p;
			x = x1;
			y = y1;
			p = 2 * dy - dx;
			g.drawString(".", x, y);
			for (int k = 1; k < dx; k++) {
				if (p < 0) {
					g.drawString(".", x++, y);
					p += 2 * dy;
				} else {
					g.drawString(".", x++, y++);
					p += 2 * (dy - dx);
				}
			}

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

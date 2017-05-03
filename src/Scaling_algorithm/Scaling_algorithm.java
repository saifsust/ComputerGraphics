/**
 * 
 */
package Scaling_algorithm;

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
public class Scaling_algorithm extends Applet implements sizeConfig, colorConfig, layoutConfig, ActionListener {

	private int x, y, sx, sy, dx, dy;

	public void init() {
		this.setLayout(null);
		this.setBackground(windowColor);
		this.setSize(windowWidth, windowHeight);
		this.add(draw);
		this.add(tx1);
		this.add(ty1);
		this.add(tx2);
		this.add(ty2);
		this.add(new label(initLayoutX, initLayoutY, "X"));
		this.add(new label(initLayoutX, initLayoutY + prefTextFieldHeight + 5, "Y"));
		this.add(new label(initLayoutX, initLayoutY + 2 * (prefTextFieldHeight + 5), "sx"));
		this.add(new label(initLayoutX, initLayoutY + 3 * (prefTextFieldHeight + 5), "sy"));
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
			x = Integer.parseInt(tx1.getText());
			y = Integer.parseInt(ty1.getText());
			sx = Integer.parseInt(tx2.getText());
			sy = Integer.parseInt(ty2.getText());
			// System.out.println(x1);
			y += buttonLayoutY + 5 * (prefTextFieldHeight + 5);
			int w = 30, h = 50;
			g.setColor(Color.DARK_GRAY);
			g.fillRect(x, y, w, h);
			g.setColor(Color.ORANGE);
			g.fillRect(x * 5, h * 5, w * sx, h * sy);

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

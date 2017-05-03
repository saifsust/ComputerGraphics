/**
 * 
 */
package rotation;

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
public class Rotation extends Applet implements sizeConfig, colorConfig, layoutConfig, ActionListener {

	private int x, y, x2, y2, dx, dy;
	private int p = buttonLayoutY + 5 * (prefTextFieldHeight + 5);

	public void init() {
		this.setLayout(null);
		this.setBackground(windowColor);
		this.setSize(windowWidth, windowHeight);
		this.add(draw);
		this.add(tx1);
		this.add(ty1);
		this.add(tx2);
		this.add(new label(initLayoutX, initLayoutY, "X"));
		this.add(new label(initLayoutX, initLayoutY + prefTextFieldHeight + 5, "Y"));
		this.add(new label(initLayoutX, initLayoutY + 2 * (prefTextFieldHeight + 5), "theta"));
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
	}

	public boolean notEmpty() {
		return !tx1.getText().trim().isEmpty() && !ty1.getText().trim().isEmpty() && !tx2.getText().trim().isEmpty();
	}

	public void paint(Graphics g) {

		g.drawLine(400, p + 50, 400, 800);
		g.drawLine(5, p + 300, 500, p + 300);
		// System.out.println(tx1.getText());
		if (notEmpty()) {
			double theta;
			x = Integer.parseInt(tx1.getText());
			y = Integer.parseInt(ty1.getText());
			theta = Double.parseDouble(tx2.getText());
			// System.out.println(x1);

			double radian = Math.toRadians(theta);
			double sin, cos;
			sin = Math.sin(radian);
			cos = Math.cos(radian);
			y += p;
			y2 += p;
			x2 = (int) (x * cos - y * sin);
			y2 = (int) (x * sin + y * cos);
			g.setColor(Color.BLACK);
			g.drawLine(400, p + 300, x, y);
			g.setColor(Color.RED);
			g.drawLine(400, p + 300, x2, y2);

			int w = 30, h = 50;

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

}

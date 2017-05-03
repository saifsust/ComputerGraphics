/**
 * 
 */
package DDA_Algorithm;

import java.awt.Button;

/**
 * @author Saif_sust_2013331007
 *
 */
public class button extends Button implements sizeConfig, colorConfig {

	public button(int layoutX, int layoutY, String title) {
		this.setLocation(layoutX, layoutY);
		this.setSize(prefWidth, prefHeight);
		this.setLabel(title);
		this.setBackground(buttonColor);
	}

}

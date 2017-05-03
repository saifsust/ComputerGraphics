/**
 * 
 */
package DDA_Algorithm;

import java.awt.*;

/**
 * @author Saif_sust_2013331007
 *
 */
public class label extends Label implements sizeConfig, colorConfig {

	/**
	 * @throws HeadlessException
	 */
	public label(int layoutX, int layoutY, String name) throws HeadlessException {
		this.setLocation(layoutX, layoutY);
		this.setBackground(labelColor);
		this.setSize(prefLabelWidth, prefLabelHeight);
		this.setText(name);
		this.setAlignment(CENTER);
	}

}

/**
 * 
 */
package DDA_Algorithm;

import java.awt.*;

/**
 * @author Saif_sust_2013331007
 *
 */
public class textField extends TextField implements sizeConfig, colorConfig {

	/**
	 * @param text
	 * @param columns
	 * @throws HeadlessException
	 */
	public textField(int layoutX, int layoutY) throws HeadlessException {

		this.setLocation(layoutX, layoutY);
		this.setSize(prefTextFieldWidth, prefTextFieldHeight);
		this.setBackground(buttonColor);
	}

}

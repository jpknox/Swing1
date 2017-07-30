package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoaoPaulo on 30-Jul-17.
 */
public class PrependListener implements ActionListener {
	TextPanel textPanel;

	public PrependListener(TextPanel textPanel) {
		this.textPanel = textPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textPanel.prependText("Prepend text");
	}
}

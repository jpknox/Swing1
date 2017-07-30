package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoaoPaulo on 30-Jul-17.
 */
public class AppendListener implements ActionListener {
	TextPanel textPanel;

	public AppendListener(TextPanel textPanel) {
		this.textPanel = textPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textPanel.appendText("Append text");
	}
}

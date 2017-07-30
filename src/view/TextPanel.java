package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JoaoPaulo on 30-Jul-17.
 */
public class TextPanel extends JPanel {
	private JTextArea textArea;

	public TextPanel() {
		setLayout(new BorderLayout());
		setupComponents();
	}

	private void setupComponents() {
		textArea = new JTextArea();
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}

	public JTextArea getTextArea() {
		return this.textArea;
	}

	public void prependText(String message) {
		textArea.setText(message + "\n" + textArea.getText());
	}

	public void appendText(String message) {
		textArea.setText(textArea.getText() + "\n" + message);
	}
}

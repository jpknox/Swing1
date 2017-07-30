package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by JoaoPaulo on 30-Jul-17.
 */
public class ToolBar extends JPanel {
	private JToolBar toolbar;
	private JButton appendBtn;
	private JButton prependBtn;

	public ToolBar() {
		setLayout(new BorderLayout());
		setupComponents();
	}

	private void setupComponents() {
		toolbar = new JToolBar();
		add(toolbar, BorderLayout.CENTER);
		appendBtn = new JButton("Append");
		toolbar.add(appendBtn);
		prependBtn = new JButton("Prepend");
		toolbar.add(prependBtn);
	}

	public void AddAppendListener(ActionListener listener) {
		appendBtn.addActionListener(listener);
	}

	public void AddPrependListener(PrependListener listener) {
		prependBtn.addActionListener(listener);
	}
}

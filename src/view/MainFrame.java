package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoaoPaulo on 30-Jul-17.
 */
public class MainFrame extends JFrame implements ActionListener {

	private TextPanel textPanel;
	private JButton btn;
	private ToolBar toolbar;

	public MainFrame(String title, int width, int height) {
		super(title);
		setLayout(new BorderLayout());

		setupComponents();
		addListeners();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(width, height);
	}

	private void setupComponents() {
		toolbar = new ToolBar();
		add(toolbar, BorderLayout.NORTH);

		textPanel = new TextPanel();
		add(textPanel, BorderLayout.CENTER);

		btn = new JButton("Click me");
		add(btn, BorderLayout.SOUTH);

		toolbar.setTextPanel(textPanel);
	}

	private void addListeners() {
		btn.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String message = "Button Clicked";
		textPanel.appendText(message);
		textPanel.prependText(message);
	}
}

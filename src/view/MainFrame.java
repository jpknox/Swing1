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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(width, height);
	}

	private void setupComponents() {
		textPanel = new TextPanel();
		btn = new JButton("Click me");
		toolbar = new ToolBar();
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		add(toolbar, BorderLayout.NORTH);
		addListeners();
	}

	private void addListeners() {
		btn.addActionListener(this);
		toolbar.AddAppendListener(new AppendListener(textPanel));
		toolbar.AddPrependListener(new PrependListener(textPanel));
	}

	public void actionPerformed(ActionEvent e) {
		String message = "Button Clicked";
		textPanel.appendText(message);
		textPanel.prependText(message);
	}
}

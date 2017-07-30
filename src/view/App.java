package view;

import javax.swing.*;

/**
 * Created by JoaoPaulo on 30-Jul-17.
 */
public class App {

	public App(String title, int width, int height) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame(title, width, height);
			}
		});
	}
}

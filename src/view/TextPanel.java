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
        String separator = "\n";
        String text = textArea.getText();
        if (text.equals("")) {
            textArea.setText(message);
        } else {
            textArea.setText(text + message);
        }
    }
    
    public void println(String message) {
        StringBuilder strbuild = new StringBuilder();
        strbuild.append(textArea.getText());
        strbuild.append("\n");
        strbuild.append(message);
        textArea.setText(strbuild.toString());
    }
}

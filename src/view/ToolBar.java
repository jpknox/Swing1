package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JoaoPaulo on 30-Jul-17.
 */
public class ToolBar extends JPanel implements ActionListener {
    private JButton helloBtn;
    private JButton goodbyeBtn;
    private TextPanel textPanel;
    private StringListener stringListener;

    public ToolBar() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setupComponents();
        addListeners();
    }

    private void addListeners() {
        helloBtn.addActionListener(this);
        goodbyeBtn.addActionListener(this);
    }

    private void setupComponents() {
        helloBtn = new JButton("Hello");
        add(helloBtn);

        goodbyeBtn = new JButton("Goodbye");
        add(goodbyeBtn);
    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    public void setStringListener(StringListener stringListener) {
        this.stringListener = stringListener;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton btn = (JButton) event.getSource();
        if (btn == helloBtn) stringListener.textEmitted("Hello");
        if (btn == goodbyeBtn) stringListener.textEmitted("Goodbye");
    }
}

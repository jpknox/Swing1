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

    public ToolBar() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setupComponents();
        addListeneres();
    }

    private void setupComponents() {
        helloBtn = new JButton("Hello");
        add(helloBtn);

        goodbyeBtn = new JButton("Goodbye");
        add(goodbyeBtn);
    }

    private void addListeneres() {
        helloBtn.addActionListener(this);
        goodbyeBtn.addActionListener(this);
    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton pressed = (JButton)event.getSource();
        if (pressed == helloBtn)     textPanel.appendText("Hello");
        if (pressed == goodbyeBtn)     textPanel.appendText("Goodbye");
    }
}

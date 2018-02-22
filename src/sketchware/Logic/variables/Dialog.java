package sketch.Logic.variables;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Dialog extends JFrame {

    private String title, message;
    private JButton OKButt, CancelButt;
    private JTextArea text;
    private ActionListener ActListen;

    public Dialog() {
        setTitle(title);
        setBounds(200, 200, 400, 200);
        setResizable(false);
        getContentPane().add(panel());
    }

    private JPanel panel() {
        JPanel p = new JPanel();
        //
        OKButt.addActionListener(ActListen);
        CancelButt.addActionListener(ActListen);
        //SETTING\\
        p.setLayout(null);
        p.add(OKButt);
        p.add(CancelButt);
        p.add(text);
        OKButt.setSize(50, 25);
        OKButt.setLocation(75, 150);
        CancelButt.setSize(50, 25);
        CancelButt.setLocation(100, 150);
        text.setSize(250, 200);
        text.setFont(new Font("Serif", 20, 3));
        text.setLocation(0, 50);
        return p;
    }

    public void SetTitle(String titl) {
        title = titl;
    }

    public void setMessage(String messag) {
        message = messag;
    }

    public void Show(Dialog dialog) {
        dialog.setVisible(true);
    }

    public void setOkButtonListener(String button, ActionListener l) {
        OKButt.setText(button);
        ActListen = l;
    }

    public void setCancelButtonListener(String button, ActionListener l) {
        CancelButt.setText(button);
        ActListen = l;
    }

    public void setNeutralButtonListener(JButton button, ActionListener l) {
        ActListen = l;
        button.addActionListener(ActListen);
        panel().add(button);
    }
}

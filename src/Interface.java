import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

class Interface implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton b1,b2,b3;
    private TextArea ta;
    private Button btn;

    //Creation graphics interface program

    void interfaceGUI() {

        frame = new JFrame("Laba 8 OOP Asanov S.V.");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        ta = new TextArea();
        ta.setBounds(20, 20, 550, 200);
        ta.setVisible(true);
        panel.add(ta);

        b1 = new JButton("Add Button");
        b1.setActionCommand("create");
        b1.setBounds(60, 320, 120, 20);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Delete Button");
        b2.setActionCommand("delete");
        b2.setBounds(340,320,160,20);
        b2.addActionListener(this);
        panel.add(b2);

        b3 = new JButton("Get Button");
        b3.setActionCommand("get");
        b3.setBounds(200,320,120,20);
        b3.addActionListener(this);
        panel.add(b3);

        frame.setVisible(true);
    }

    Keyboard kb = new Keyboard();

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "create":
                Random r = new Random();
                String[] itemsName = {"H","Backspace","Esc","Delene","Enter","Shift","Button","Tab","Insert"};
                String nameValue = itemsName[r.nextInt(itemsName.length)];
                String heightValue = "" + r.nextInt(20);
                String weightValue = "" + r.nextInt(30);
//
                btn = new Button(nameValue, heightValue, weightValue);
                kb.addButton(btn);
                ta.setText(kb.myButtonsText());
                break;

            case "get":
                kb.getButtons();
                ta.setText(kb.buttonsGetText());
                break;

            case "delete":
                kb.buttons.removeLast();
                ta.setText(kb.deleteButtonsText());
                break;

        }
    }
}

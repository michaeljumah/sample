package COM.JUMA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class APP {
    private JPanel PNAME;
    private JButton BUTTON_msg;

    public APP() {
        BUTTON_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"hello world");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        frame.setContentPane(new APP().PNAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
//😊
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tinh tong 2 so");
        frame.setSize(350, 220);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel("Nhap so 1");
        JTextField txt1 = new JFormattedTextField();
        JLabel label2 = new JLabel("Nhap so 2");
        JTextField txt2 = new JFormattedTextField();
        JButton button = new JButton("Tinh");
        JLabel label3 = new JLabel("Ket qua");
        frame.add(label1);
        frame.add(txt1);
        frame.add(label2);
        frame.add(txt2);
        frame.add(button);
        frame.add(label3);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input1 = txt1.getText().trim();
                String input2 = txt2.getText().trim();
                if (input1.isEmpty() || input2.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Phai nhap du 2 so",
                            "Loi nhap lieu",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    double so1 = Double.parseDouble(input1);
                    double so2 = Double.parseDouble(input2);
                    double tong = so1 + so2;
                    label3.setText("Ket qua: " + tong);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Chi co the nhap so",
                            "Loi nhap lieu",
                            JOptionPane.ERROR_MESSAGE);
                    label3.setText("Ket qua: ");
                    txt1.requestFocus();
                }
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
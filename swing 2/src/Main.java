import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

            JFrame frame = new JFrame("Tinh tong 2 so");
        frame.setSize(500, 220);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageIcon = new ImageIcon("anh/1.png");
        frame.setIconImage(new ImageIcon("anh/1.png").getImage());
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
                String inputA = txt1.getText().trim();
                String inputB = txt2.getText().trim();
                if (inputA.isEmpty() || inputB.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Vui lòng nhập đầy đủ hệ số a và b!",
                            "Lỗi nhập liệu",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    double a = Double.parseDouble(inputA);
                    double b = Double.parseDouble(inputB);
                    if (a == 0) {
                        if (b == 0) {

                            label3.setText("Phương trình vô số nghiệm");
                        } else {
                            label3.setText("Phương trình vô nghiệm");
                        }
                    } else {
                        double x = -b / a;
                        label3.setText(" Phương trình có nghiệm x = " + x);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Dữ liệu nhập không hợp lệ", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
                    label3.setText("Kết quả: ");
                    txt1.requestFocus();
                }
                }

        });

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

    }
}
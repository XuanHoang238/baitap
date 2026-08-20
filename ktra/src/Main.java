import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Tinh tong cac so nguyen to nho hon N");
        frame.setSize(500, 220);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel("Nhap N: ");
        JTextField txt1 = new JFormattedTextField();
        JButton button = new JButton("Tinh");
        JLabel label3 = new JLabel("Ket qua");
        frame.add(label1);
        frame.add(txt1);
        frame.add(button);
        frame.add(label3);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputA = txt1.getText().trim();
                if (inputA.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Vui long nhap day du N ",
                            "Loi nhap lieu",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int n;
                try {
                    n = Integer.parseInt(inputA);
                } catch (Exception ex) {
                    label3.setText("N phai la so nguyen");
                    return;
                }
                if (n <= 0) {
                    label3.setText("N phai la so nguyen duong");
                    return;
                }
                button.setEnabled(false);
                label3.setText("Dang tinh");
                SwingWorker<Long, Void> worker = new SwingWorker<Long, Void>() {
                    @Override
                    protected Long doInBackground() {
                        long sum = 0;
                        for (int i = 2; i < n; i++) {
                            if (isPrime(i)) {
                                sum += i;
                            }
                        }
                        return sum;
                    }

                    @Override
                    protected void done() {
                        try {
                            long tong = get();
                            label3.setText("" + tong);
                        } catch (Exception ex) {
                            label3.setText("Co loi xay ra");
                        } finally {
                            button.setEnabled(true);
                        }
                    }
                };
                worker.execute();
            }
        });
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
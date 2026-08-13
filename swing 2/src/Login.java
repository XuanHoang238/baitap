import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Đăng nhập");
        ImageIcon imageIcon = new ImageIcon("anh/1.png");
        frame.setIconImage(new ImageIcon("anh/1.png").getImage());
        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();
        JComboBox<String> role = new JComboBox<>(new String[]{"Sinh viên", "Giảng viên", "Admin"});
        JCheckBox remember = new JCheckBox("Nhớ tài khoản");
        JButton btn = new JButton("Đăng nhập");
        frame.setLayout(new GridLayout(4, 2, 5, 5));
        frame.add(new JLabel("Tài khoản:"));
        frame.add(user);
        frame.add(new JLabel("Mật khẩu:"));
        frame.add(pass);
        frame.add(new JLabel("Vai trò:"));
        frame.add(role);
        frame.add(remember);
        frame.add(btn);
        btn.addActionListener(e -> {
            String username = user.getText();
            String password = new String(pass.getPassword());

            if (username.equals("admin") && password.equals("123")) {
                JOptionPane.showMessageDialog(frame, "Đăng nhập thành công!");
            } else {
                JOptionPane.showMessageDialog(frame, "Sai tài khoản hoặc mật khẩu!");
            }
        });

        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

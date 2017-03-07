package Dykyi;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Reestrasia extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel label_NazvaVikna;
	private JLabel label_Login;
	private JTextField textField_Login;
	private JLabel label_Password;
	private JPasswordField passwordField_Password;
	private JButton button_Nazad;
	private JLabel label_PIP;
	private JTextField textField_PIP;
	private JLabel label_email;
	private JTextField textField_mail;
	private JButton button_Gotovo;

	public Reestrasia(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		label_NazvaVikna = new JLabel("Реєстрація");
		label_NazvaVikna.setBounds(12, 13, 1250, 88);
		label_NazvaVikna.setFont(new Font("Monotype Corsiva", Font.BOLD, 55));
		label_NazvaVikna.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(label_NazvaVikna);

		label_Login = new JLabel("Логін");
		label_Login.setBounds(78, 124, 231, 29);
		label_Login.setHorizontalAlignment(SwingConstants.CENTER);
		label_Login.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		getContentPane().add(label_Login);

		textField_Login = new JTextField();
		textField_Login.setBounds(78, 176, 231, 36);
		textField_Login.setToolTipText("");
		textField_Login.setText("1");
		textField_Login.setColumns(10);
		getContentPane().add(textField_Login);

		label_Password = new JLabel("Пароль");
		label_Password.setBounds(78, 269, 231, 29);
		label_Password.setHorizontalAlignment(SwingConstants.CENTER);
		label_Password.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		getContentPane().add(label_Password);

		passwordField_Password = new JPasswordField();
		passwordField_Password.setBounds(78, 322, 231, 36);
		passwordField_Password.setToolTipText("");
		passwordField_Password.setText("1");
		getContentPane().add(passwordField_Password);

		button_Nazad = new JButton("Назад");
		button_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Avtor("Дієтолог");
				setVisible(false);
			}
		});
		button_Nazad.setBounds(78, 421, 231, 36);
		button_Nazad.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		getContentPane().add(button_Nazad);

		label_PIP = new JLabel("Ім'я та Прізвище");
		label_PIP.setBounds(426, 124, 231, 29);
		label_PIP.setHorizontalAlignment(SwingConstants.CENTER);
		label_PIP.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		getContentPane().add(label_PIP);

		textField_PIP = new JTextField();
		textField_PIP.setBounds(426, 176, 231, 36);
		textField_PIP.setToolTipText("");
		textField_PIP.setText("1");
		textField_PIP.setColumns(10);
		getContentPane().add(textField_PIP);

		label_email = new JLabel("e-mail");
		label_email.setBounds(426, 269, 231, 29);
		label_email.setHorizontalAlignment(SwingConstants.CENTER);
		label_email.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		getContentPane().add(label_email);

		textField_mail = new JTextField();
		textField_mail.setBounds(426, 322, 231, 36);
		textField_mail.setToolTipText("");
		textField_mail.setText("1");
		getContentPane().add(textField_mail);

		button_Gotovo = new JButton("Готово");
		button_Gotovo.setBounds(426, 421, 231, 36);
		button_Gotovo.addActionListener(new ActionListener() {

			private String s_Login;
			private String s_Password;
			private String s_PIP;
			private String s_mail;

			private Formatter formatter_reestracia;
			private String s_reestracia;

			private int i_korektnist = 0;
			private int i_korektnist1 = 0;

			@SuppressWarnings("deprecation")

			public void actionPerformed(ActionEvent arg0) {

				s_Login = textField_Login.getText();
				s_Password = passwordField_Password.getText();
				s_PIP = textField_PIP.getText();
				s_mail = textField_mail.getText();

				File file = new File("res/Avtoruzacia/" + s_Login + ".txt");

				if (file.exists()) {
					JOptionPane.showMessageDialog(null, "Уже зареєстрований користувач під даним логіном");
				} else {

					int blockCount = s_PIP.split(" ").length;

					if (blockCount != 2) {
						JOptionPane.showMessageDialog(null, "Некоректне ім'я чи прізвище");
					} else {
						char[] chars = s_PIP.toCharArray();
						for (int i = 0; i < chars.length; i++) {
							try {
								if (chars[i] == '1' || chars[i] == '0' || chars[i] == '(' || chars[i] == ')'
										|| chars[i] == '+' || chars[i] == '=' || chars[i] == '/' || chars[i] == '.'
										|| chars[i] == ',') {
									i_korektnist++;
								}
							} catch (Exception e) {
							}
						}
						char[] chars1 = s_mail.toCharArray();
						for (int i = 0; i < chars1.length; i++) {
							try {
								if (chars1[i] == '@') {
									i_korektnist1 = 1;
								}
							} catch (Exception e) {
							}
						}
						if (i_korektnist == 0 && i_korektnist1 == 1) {

							try {
								formatter_reestracia = new Formatter("res/Avtoruzacia/" + s_Login + ".txt");
							} catch (Exception e) {
								JOptionPane.showMessageDialog(null, "System Error");
							}

							s_reestracia = s_Password + " " + s_PIP + " " + s_mail;

							formatter_reestracia.format(s_reestracia);
							formatter_reestracia.close();

							JOptionPane.showMessageDialog(null, "Зареєстровано");
							new Avtor("Дієтолог");
							setVisible(false);

						} else {
							JOptionPane.showMessageDialog(null, "Перевірте введення");
						}
						i_korektnist = 0;

					}
				}

			}
		});
		button_Gotovo.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		getContentPane().add(button_Gotovo);

		setVisible(true);
	}

}

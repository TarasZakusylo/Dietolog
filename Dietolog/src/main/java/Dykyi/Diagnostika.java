package Dykyi;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Diagnostika extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField t_RikNarodgenna;
	private JTextField t_Zrist;
	private JTextField t_Vaga;
	private Choice choice_Stat;
	private JLabel l_putanna;
	private Choice choice_Profesia;
	private JLabel l_Vvedit;
	private JLabel l_Stat;
	private JLabel l_Zrist;
	private JLabel l_RikNarodgenna;
	private JLabel l_Profesia;
	private JLabel l_Vaga;
	private JLabel l_cm;
	private JLabel l_kg;
	private JButton btnNewButton;

	private JLabel l_fon;

	public Diagnostika(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Vvedit = new JLabel("Введіть:");
		l_Vvedit.setForeground(new Color(255, 0, 255));
		l_Vvedit.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Vvedit.setBounds(0, 87, 116, 36);
		getContentPane().add(l_Vvedit);

		l_Stat = new JLabel("стать");
		l_Stat.setForeground(new Color(255, 0, 255));
		l_Stat.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Stat.setBounds(162, 136, 151, 36);
		getContentPane().add(l_Stat);

		l_RikNarodgenna = new JLabel("рік народження");
		l_RikNarodgenna.setForeground(new Color(255, 0, 255));
		l_RikNarodgenna.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_RikNarodgenna.setBounds(128, 87, 205, 36);
		getContentPane().add(l_RikNarodgenna);

		l_Zrist = new JLabel("зріст");
		l_Zrist.setForeground(new Color(255, 0, 255));
		l_Zrist.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Zrist.setBounds(162, 195, 151, 36);
		getContentPane().add(l_Zrist);

		l_Vaga = new JLabel("вагу");
		l_Vaga.setForeground(new Color(255, 0, 255));
		l_Vaga.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Vaga.setBounds(162, 256, 151, 36);
		getContentPane().add(l_Vaga);

		l_Profesia = new JLabel("професію");
		l_Profesia.setForeground(new Color(255, 0, 255));
		l_Profesia.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_Profesia.setBounds(162, 320, 151, 36);
		getContentPane().add(l_Profesia);

		t_RikNarodgenna = new JTextField();
		t_RikNarodgenna.setBounds(336, 88, 116, 36);
		getContentPane().add(t_RikNarodgenna);
		t_RikNarodgenna.setColumns(10);

		t_Zrist = new JTextField();
		t_Zrist.setColumns(10);
		t_Zrist.setBounds(336, 196, 116, 36);
		getContentPane().add(t_Zrist);

		t_Vaga = new JTextField();
		t_Vaga.setColumns(10);
		t_Vaga.setBounds(336, 257, 116, 36);
		getContentPane().add(t_Vaga);

		choice_Profesia = new Choice();
		choice_Profesia.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_Profesia.setBounds(336, 334, 191, 24);
		getContentPane().add(choice_Profesia);
		choice_Profesia.add("студент");
		choice_Profesia.add("фізична робота");
		choice_Profesia.add("інтелектуальна робота");

		choice_Stat = new Choice();
		choice_Stat.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_Stat.setBounds(335, 150, 117, 54);
		getContentPane().add(choice_Stat);
		choice_Stat.add("чоловіча");
		choice_Stat.add("жіноча");

		l_putanna = new JLabel("1-5/25");
		l_putanna.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna.setBounds(12, 440, 84, 49);
		getContentPane().add(l_putanna);

		l_cm = new JLabel("см.");
		l_cm.setForeground(new Color(255, 0, 255));
		l_cm.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_cm.setBounds(464, 196, 75, 36);
		getContentPane().add(l_cm);

		l_kg = new JLabel("кг.");
		l_kg.setForeground(new Color(255, 0, 255));
		l_kg.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		l_kg.setBounds(464, 257, 75, 36);
		getContentPane().add(l_kg);
		
		JButton b_Menu = new JButton("Меню");
		b_Menu.setForeground(new Color(255, 140, 0));
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] options = { "Так, перейти", "Ні, залишитись" };
				int i_menu = JOptionPane.showOptionDialog(null, "Бажаєте перейти в меню ? Введені дані не збережуться.",
						"Попередження", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
						null);
				if (i_menu == 0) {
					new Menu("Дієтолог");
					setVisible(false);
				}
			}
		});
		b_Menu.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Menu.setBounds(115, 470, 386, 49);
		getContentPane().add(b_Menu);
		
		btnNewButton = new JButton("Перейти до інших запитань");
		btnNewButton.setForeground(new Color(255, 140, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		btnNewButton.addActionListener(new ActionListener() {

			private String s_RikNarodgenna;
			private String s_Zrist;
			private String s_Vaga;
			private int i_RikNarodgenna;
			private int i_Zrist;
			private int i_Vaga;

			public void actionPerformed(ActionEvent arg0) {

				s_RikNarodgenna = t_RikNarodgenna.getText();
				s_Zrist = t_Zrist.getText();
				s_Vaga = t_Vaga.getText();

				if (s_RikNarodgenna.equals("") || s_RikNarodgenna.equals(" ") || s_RikNarodgenna.equals("  ")
						|| s_RikNarodgenna.equals("   ")) {
					JOptionPane.showMessageDialog(null, "Введіть рік народження");
				} else {
					if (s_Zrist.equals("") || s_Zrist.equals(" ") || s_Zrist.equals("  ") || s_Zrist.equals("   ")) {
						JOptionPane.showMessageDialog(null, "Введіть зріст");
					} else {
						if (s_Vaga.equals("") || s_Vaga.equals(" ") || s_Vaga.equals("  ") || s_Vaga.equals("   ")) {
							JOptionPane.showMessageDialog(null, "Введіть вагу");
						} else {

							try {
								i_RikNarodgenna = Integer.parseInt(s_RikNarodgenna);
								i_Zrist = Integer.parseInt(s_Zrist);
								i_Vaga = Integer.parseInt(s_Vaga);
							} catch (Exception e) {
								JOptionPane.showMessageDialog(null, "Перевірте введення");
							}
							if (i_RikNarodgenna > 1900 && i_RikNarodgenna <= 2017) {
								if (i_Zrist > 30 && i_Zrist <= 250) {
									if (i_Vaga > 2 && i_Vaga <= 800) {

										String s_Stat = choice_Stat.getSelectedItem();
										String s_Profesia = choice_Profesia.getSelectedItem();
										int i_Stat = 0;
										int i_Profesia = 0;

										switch (s_Stat) {
										case "чоловіча": {
											i_Stat = 0;
										}
											break;
										case "жіноча": {
											i_Stat = 1;
										}
											break;
										} 
										
										switch (s_Profesia) {
										case "студент": {
											i_Profesia = 0;
										}
										case "фізична робота": {
											i_Profesia = 1;
										}
										case "інтелектуальна робота": {
											i_Profesia = 2;
										}
											break;
										}

										new Diagnostika1(i_RikNarodgenna, i_Stat, i_Zrist, i_Vaga, i_Profesia);
										setVisible(false);

									} else {
										JOptionPane.showMessageDialog(null, "Помилкова вага");
									}
								} else {
									JOptionPane.showMessageDialog(null, "Помилковий зріст");
								}
							} else {
								JOptionPane.showMessageDialog(null, "Помилковий рік народження");
							}

						}
					}
				}
			}
		});
		btnNewButton.setBounds(115, 408, 386, 49);
		getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("res/Diagnostika0.jpg"));
		label.setBounds(515, 24, 479, 506);
		getContentPane().add(label);

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Reestracia.png"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);
		
		setVisible(true);

	}
}

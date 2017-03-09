package Dykyi;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JLabel l_Hapka;
	private JLabel l_Vvedit;
	private JLabel l_Stat;
	private JLabel l_Zrist;
	private JLabel l_RikNarodgenna;
	private JLabel l_Profesia;
	private JLabel l_Vaga;
	private JLabel l_cm;
	private JLabel l_kg;

	private Button b_dali;
	private Button b_Menu;

	public Diagnostika(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Hapka = new JLabel("Пройдіть, будь ласка, опитування");
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(32, 13, 1230, 36);
		getContentPane().add(l_Hapka);

		l_Vvedit = new JLabel("Введіть");
		l_Vvedit.setBounds(30, 87, 130, 36);
		getContentPane().add(l_Vvedit);

		l_Stat = new JLabel("стать");
		l_Stat.setBounds(162, 136, 151, 36);
		getContentPane().add(l_Stat);

		l_RikNarodgenna = new JLabel("рік народження");
		l_RikNarodgenna.setBounds(162, 87, 151, 36);
		getContentPane().add(l_RikNarodgenna);

		l_Zrist = new JLabel("зріст");
		l_Zrist.setBounds(162, 195, 151, 36);
		getContentPane().add(l_Zrist);

		l_Vaga = new JLabel("вагу");
		l_Vaga.setBounds(162, 256, 151, 36);
		getContentPane().add(l_Vaga);

		l_Profesia = new JLabel("професію");
		l_Profesia.setBounds(162, 320, 151, 36);
		getContentPane().add(l_Profesia);

		t_RikNarodgenna = new JTextField();
		t_RikNarodgenna.setBounds(325, 87, 116, 36);
		getContentPane().add(t_RikNarodgenna);
		t_RikNarodgenna.setColumns(10);

		t_Zrist = new JTextField();
		t_Zrist.setColumns(10);
		t_Zrist.setBounds(325, 195, 116, 36);
		getContentPane().add(t_Zrist);

		t_Vaga = new JTextField();
		t_Vaga.setColumns(10);
		t_Vaga.setBounds(325, 256, 116, 36);
		getContentPane().add(t_Vaga);

		choice_Profesia = new Choice();
		choice_Profesia.setBounds(324, 320, 117, 36);
		getContentPane().add(choice_Profesia);
		choice_Profesia.add("студент");

		choice_Stat = new Choice();
		choice_Stat.setBounds(324, 150, 117, 22);
		getContentPane().add(choice_Stat);
		choice_Stat.add("чоловіча");
		choice_Stat.add("жіноча");

		l_putanna = new JLabel("1-5");
		l_putanna.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna.setBounds(12, 623, 56, 49);
		getContentPane().add(l_putanna);

		b_dali = new Button("Перейти до інших запитань");
		b_dali.addActionListener(new ActionListener() {

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

										new Diagnostika1(i_RikNarodgenna, s_Stat, i_Zrist, i_Vaga, s_Profesia);
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
		b_dali.setBounds(227, 623, 214, 36);
		getContentPane().add(b_dali);

		l_cm = new JLabel("см.");
		l_cm.setBounds(453, 195, 75, 36);
		getContentPane().add(l_cm);

		l_kg = new JLabel("кг.");
		l_kg.setBounds(453, 256, 75, 36);
		getContentPane().add(l_kg);

		b_Menu = new Button("Меню");
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Так, перейти", "Ні, залишитись"};
				int i_menu = JOptionPane.showOptionDialog(null, "Бажаєте перейти в меню ? Введені дані не збережуться.",
						"Попередження", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						options,  null);
				if(i_menu==0){
					new Menu("Дієтолог");
					setVisible(false);
				}
			}
		});
		b_Menu.setBounds(120, 623, 108, 36);
		getContentPane().add(b_Menu);

		setVisible(true);

	}
}

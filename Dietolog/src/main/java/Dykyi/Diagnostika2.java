package Dykyi;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Diagnostika2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_Hapka;

	private JLabel l_11;
	private Choice choice_11;
	private Choice choice_12;
	private Choice choice_13;
	private Choice choice_14;
	private Choice choice_15;
	private JLabel l_13;
	private JLabel l_14;
	private JLabel l_15;
	private JLabel l_12;

	private JLabel l_putanna2;
	private Button b_dali2;

	public Diagnostika2(int i_RikNarodgenna, String s_Stat, int i_Zrist, int i_Vaga, String s_Profesia,
			String s_choice_6, String s_choice_7, String s_choice_8, String s_choice_9, String s_choice_10) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Hapka = new JLabel("Пройдіть, будь ласка, опитування");
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(32, 13, 1230, 36);
		getContentPane().add(l_Hapka);

		l_11 = new JLabel("Скільки овочів та фруктів з’їдаєте за день ? ");
		l_11.setBounds(30, 87, 280, 36);
		getContentPane().add(l_11);

		choice_11 = new Choice();
		choice_11.setBounds(316, 90, 177, 36);
		getContentPane().add(choice_11);
		choice_11.add("4-5 і більше ");
		choice_11.add("3 рази");
		choice_11.add("2 рази і менше");

		l_12 = new JLabel("Скільки рідини випиваєте за день ?");
		l_12.setBounds(32, 136, 281, 36);
		getContentPane().add(l_12);

		choice_12 = new Choice();
		choice_12.setBounds(316, 139, 177, 22);
		getContentPane().add(choice_12);
		choice_12.add("Ранком");
		choice_12.add("Вобід");
		choice_12.add("Ввечері");
		choice_12.add("Вночі");

		l_13 = new JLabel("Буває у Вас після прийому їжі важкість ?");
		l_13.setBounds(32, 195, 281, 36);
		getContentPane().add(l_13);

		choice_13 = new Choice();
		choice_13.setBounds(316, 195, 177, 22);
		getContentPane().add(choice_13);
		choice_13.add("До 22");
		choice_13.add("Близько 23");
		choice_13.add("Близько опівночі");
		choice_13.add("Після першої");

		l_14 = new JLabel("Займаєтесь спортом, додатковими фізичними навантаженнями ?");
		l_14.setBounds(32, 256, 281, 36);
		getContentPane().add(l_14);

		choice_14 = new Choice();
		choice_14.setBounds(316, 256, 177, 22);
		getContentPane().add(choice_14);
		choice_14.add("Кислі");
		choice_14.add("Солодкі");
		choice_14.add("Сольоні");

		l_15 = new JLabel("Як ви ставитесь до вегетаріанства ?");
		l_15.setBounds(32, 320, 281, 36);
		getContentPane().add(l_15);

		choice_15 = new Choice();
		choice_15.setBounds(316, 320, 175, 28);
		getContentPane().add(choice_15);
		choice_15.add("До 18");
		choice_15.add("Близько 20");
		choice_15.add("Близько 22");
		choice_15.add("Після 24");

		l_putanna2 = new JLabel("11-15");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna2.setBounds(12, 614, 82, 49);
		getContentPane().add(l_putanna2);

		b_dali2 = new Button("Перейти до інших запитань");
		b_dali2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s_choice_6 = choice_11.getSelectedItem();
				String s_choice_7 = choice_12.getSelectedItem();
				String s_choice_8 = choice_13.getSelectedItem();
				String s_choice_9 = choice_14.getSelectedItem();
				String s_choice_10 = choice_15.getSelectedItem();

				// new Diagnostika2(i_RikNarodgenna, s_Stat, i_Zrist, i_Vaga,
				// s_Profesia, s_choice_6, s_choice_7, s_choice_8, s_choice_9,
				// s_choice_10);
				// setVisible(false);
			}
		});
		b_dali2.setBounds(286, 603, 214, 36);
		getContentPane().add(b_dali2);

		setVisible(true);

	}
}

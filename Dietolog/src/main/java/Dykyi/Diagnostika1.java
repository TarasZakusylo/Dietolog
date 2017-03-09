package Dykyi;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Diagnostika1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_Hapka;

	private JLabel l_6;
	private Choice choice_6;
	private Choice choice_7;
	private Choice choice_8;
	private Choice choice_9;
	private Choice choice_10;
	private JLabel l_8;
	private JLabel l_9;
	private JLabel l_10;
	private JLabel l_7;

	private JLabel l_putanna1;
	private Button b_dali1;
 
	public Diagnostika1(final int i_RikNarodgenna, final String s_Stat, final int i_Zrist, final int i_Vaga,
			final String s_Profesia) {
 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Hapka = new JLabel("Пройдіть, будь ласка, опитування");
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(32, 13, 1230, 36);
		getContentPane().add(l_Hapka);

		l_6 = new JLabel("Скільки разів на день Ви харчуєтесь ? ");
		l_6.setBounds(30, 87, 280, 36);
		getContentPane().add(l_6);

		choice_6 = new Choice();
		choice_6.setBounds(316, 90, 177, 36);
		getContentPane().add(choice_6);
		choice_6.add("4-5 і більше ");
		choice_6.add("3 рази");
		choice_6.add("2 рази і менше");

		l_7 = new JLabel("Коли основний прийом їжі ?");
		l_7.setBounds(32, 136, 281, 36);
		getContentPane().add(l_7);

		choice_7 = new Choice();
		choice_7.setBounds(316, 139, 177, 22);
		getContentPane().add(choice_7);
		choice_7.add("Ранком");
		choice_7.add("Вобід");
		choice_7.add("Ввечері");
		choice_7.add("Вночі");

		l_8 = new JLabel("Коли ви зазвичай лягаєте спати ? ");
		l_8.setBounds(32, 195, 281, 36);
		getContentPane().add(l_8);

		choice_8 = new Choice();
		choice_8.setBounds(316, 195, 177, 22);
		getContentPane().add(choice_8);
		choice_8.add("До 22");
		choice_8.add("Близько 23");
		choice_8.add("Близько опівночі");
		choice_8.add("Після першої");

		l_9 = new JLabel("Які продукти подобаються більше за все ?");
		l_9.setBounds(32, 256, 281, 36);
		getContentPane().add(l_9);

		choice_9 = new Choice();
		choice_9.setBounds(316, 256, 177, 22);
		getContentPane().add(choice_9);
		choice_9.add("Кислі");
		choice_9.add("Солодкі");
		choice_9.add("Сольоні");

		l_10 = new JLabel("О котрій у Вас вечеря ?");
		l_10.setBounds(32, 320, 281, 36);
		getContentPane().add(l_10);

		choice_10 = new Choice();
		choice_10.setBounds(316, 320, 175, 28);
		getContentPane().add(choice_10);
		choice_10.add("До 18");
		choice_10.add("Близько 20");
		choice_10.add("Близько 22");
		choice_10.add("Після 24");

		l_putanna1 = new JLabel("6-10");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna1.setBounds(12, 614, 56, 49);
		getContentPane().add(l_putanna1);

		b_dali1 = new Button("Перейти до інших запитань");
		b_dali1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s_choice_6 = choice_6.getSelectedItem();
				String s_choice_7 = choice_7.getSelectedItem();
				String s_choice_8 = choice_8.getSelectedItem();
				String s_choice_9 = choice_9.getSelectedItem();
				String s_choice_10 = choice_10.getSelectedItem();

				 new Diagnostika2(i_RikNarodgenna, s_Stat, i_Zrist, i_Vaga,
				 s_Profesia, s_choice_6, s_choice_7, s_choice_8, s_choice_9,
				 s_choice_10);
				setVisible(false);
			}
		});
		b_dali1.setBounds(286, 603, 214, 36);
		getContentPane().add(b_dali1);

		setVisible(true);

	}
}

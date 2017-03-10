package Dykyi;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Diagnostika4 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_Hapka;

	private JLabel l_21;
	private Choice choice_21;
	private Choice choice_22;
	private Choice choice_23;
	private Choice choice_24;
	private Choice choice_25;
	private JLabel l_23;
	private JLabel l_24;
	private JLabel l_25;
	private JLabel l_22;

	private JLabel l_putanna4;
	private Button b_dali4;

	public Diagnostika4(final int i_RikNarodgenna, final int i_Stat, final int i_Zrist, final int i_Vaga,
			final int i_Profesia, final int i_choice_6, final int i_choice_7, final int i_choice_8,
			final int i_choice_9, final int i_choice_10, final int i_choice_11, final int i_choice_12,
			final int i_choice_13, final int i_choice_14, final int i_choice_15, final int i_choice_16,
			final int i_choice_17, final int i_choice_18, final int i_choice_19, final int i_choice_20) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Hapka = new JLabel("Пройдіть, будь ласка, опитування");
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(32, 13, 1230, 36);
		getContentPane().add(l_Hapka);

		l_21 = new JLabel("Ви вважаєте себе солодкоїжкою ?");
		l_21.setBounds(30, 87, 280, 36);
		getContentPane().add(l_21);

		choice_21 = new Choice();
		choice_21.setBounds(316, 90, 177, 36);
		getContentPane().add(choice_21);
		choice_21.add("Не частіше ніж раз на тиждень");
		choice_21.add("Раз на кільки днів ласую");
		choice_21.add("Не люблю");
		choice_21.add("І дня не проживу без солодкого");

		l_22 = new JLabel("Чи впливає стрес на ваше харчування ?");
		l_22.setBounds(32, 136, 281, 36);
		getContentPane().add(l_22);

		choice_22 = new Choice();
		choice_22.setBounds(316, 139, 177, 22);
		getContentPane().add(choice_22);
		choice_22.add("Стрес ніяк не впливає на моє харчування");
		choice_22.add("Їжа допомагає мені зняти стрес");
		choice_22.add("Під час стресу забуваю їсти");

		l_23 = new JLabel("Доводилось Вам сидіти на дієтах чи голодати ?");
		l_23.setBounds(32, 195, 281, 36);
		getContentPane().add(l_23);

		choice_23 = new Choice();
		choice_23.setBounds(316, 195, 177, 22);
		getContentPane().add(choice_23);
		choice_23.add("Ніколи");
		choice_23.add("1 раз");
		choice_23.add("Кільки разів");
		choice_23.add("Постійно сижду на якійсь диєті");

		l_24 = new JLabel("Курите ?");
		l_24.setBounds(32, 256, 281, 36);
		getContentPane().add(l_24);

		choice_24 = new Choice();
		choice_24.setBounds(316, 256, 177, 22);
		getContentPane().add(choice_24);
		choice_24.add("Ніколи");
		choice_24.add("Берусь і відразу кидаю");
		choice_24.add("Іноді, пачку на тиждень");
		choice_24.add("Так, що най менше пачку в день");

		l_25 = new JLabel("Як ви ставитесь до їжі «за компанію» ?");
		l_25.setBounds(32, 320, 281, 36);
		getContentPane().add(l_25);

		choice_25 = new Choice();
		choice_25.setBounds(316, 320, 175, 28);
		getContentPane().add(choice_25);
		choice_25.add("Ніколи не дозволяю собі такого");
		choice_25.add("Іноді потрапляю на банкет");
		choice_25.add("Люблю із друзями так обідати/вечеряти");
		choice_25.add("Завжди так харчуюсь");

		l_putanna4 = new JLabel("21-25/25");
		l_putanna4.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna4.setBounds(12, 614, 124, 49);
		getContentPane().add(l_putanna4);

		b_dali4 = new Button("Перейти до інших запитань");
		b_dali4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s_choice_21 = choice_21.getSelectedItem();
				String s_choice_22 = choice_22.getSelectedItem();
				String s_choice_23 = choice_23.getSelectedItem();
				String s_choice_24 = choice_24.getSelectedItem();
				String s_choice_25 = choice_25.getSelectedItem();

				int i_choice_21 = 0;
				int i_choice_22 = 0;
				int i_choice_23 = 0;
				int i_choice_24 = 0;
				int i_choice_25 = 0;

				switch (s_choice_21) {
				case "Не частіше ніж раз на тиждень": {
					i_choice_21 = 0;
				}
					break;
				case "Раз на кільки днів ласую": {
					i_choice_21 = 1;
				}
					break;
				case "Не люблю": {
					i_choice_21 = 2;
				}
					break;
				case "І дня не проживу без солодкого": {
					i_choice_21 = 3;
				}
					break;
				}
			 
				switch (s_choice_22) {
				case "Стрес ніяк не впливає на моє харчування": {
					i_choice_22 = 0;
				}
					break;
				case "Їжа допомагає мені зняти стрес": {
					i_choice_22 = 1;
				}
					break;
				case "Під час стресу забуваю їсти": {
					i_choice_22 = 2;
				}
					break;
				}
			 
				switch (s_choice_23) {
				case "Ніколи": {
					i_choice_23 = 0;
				}
					break;
				case "1 раз": {
					i_choice_23 = 1;
				}
					break;
				case "Кільки разів": {
					i_choice_23 = 2;
				}
					break;
				case "Постійно сижду на якійсь диєті": {
					i_choice_23 = 3;
				}
					break;
				}
	 
				switch (s_choice_24) {
				case "Ніколи": {
					i_choice_24 = 0;
				}
					break;
				case "Берусь і відразу кидаю": {
					i_choice_24 = 1;
				}
					break;
				case "Іноді, пачку на тиждень": {
					i_choice_24 = 2;
				}
					break;
				case "Так, що най менше пачку в день": {
					i_choice_24 = 3;
				}
					break;
				}
			
				switch (s_choice_25) {
				case "Ніколи не дозволяю собі такого": {
					i_choice_25 = 0;
				}
					break;
				case "Іноді потрапляю на банкет": {
					i_choice_25 = 1;
				}
					break;
				case "Люблю із друзями так обідати/вечеряти": {
					i_choice_25 = 2;
				}
					break;
				case "Завжди так харчуюсь": {
					i_choice_25 = 3;
				}
					break;
				}

				new DiagnostikaVusnovok(i_RikNarodgenna, i_Stat, i_Zrist, i_Vaga, i_Profesia, i_choice_6, i_choice_7,
						i_choice_8, i_choice_9, i_choice_10, i_choice_11, i_choice_12, i_choice_13, i_choice_14,
						i_choice_15, i_choice_16, i_choice_17, i_choice_18, i_choice_19, i_choice_20, i_choice_21,
						i_choice_22, i_choice_23, i_choice_24, i_choice_25);
				setVisible(false);
			}
		});
		b_dali4.setBounds(286, 603, 214, 36);
		getContentPane().add(b_dali4);

		setVisible(true);

	}
}

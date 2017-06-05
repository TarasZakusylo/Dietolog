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
import javax.swing.SwingConstants;

public class Diagnostika4 extends JFrame {

	private static final long serialVersionUID = 1L;

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
	private JButton button;
	private JButton button_1;
	private JLabel label;

	private JLabel l_fon;

	public Diagnostika4(final int i_RikNarodgenna, final int i_Stat, final int i_Zrist, final int i_Vaga,
			final int i_Profesia, final int i_choice_6, final int i_choice_7, final int i_choice_8,
			final int i_choice_9, final int i_choice_10, final int i_choice_11, final int i_choice_12,
			final int i_choice_13, final int i_choice_14, final int i_choice_15, final int i_choice_16,
			final int i_choice_17, final int i_choice_18, final int i_choice_19, final int i_choice_20) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_21 = new JLabel("Ви вважаєте себе солодкоїжкою ?");
		l_21.setForeground(new Color(255, 0, 255));
		l_21.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_21.setHorizontalAlignment(SwingConstants.CENTER);
		l_21.setBounds(2, 357, 380, 36);
		getContentPane().add(l_21);

		choice_21 = new Choice();
		choice_21.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_21.setBounds(390, 370, 233, 24);
		getContentPane().add(choice_21);
		choice_21.add("Не частіше ніж раз на тиждень");
		choice_21.add("Раз на кільки днів ласую");
		choice_21.add("Не люблю");
		choice_21.add("І дня не проживу без солодкого");

		l_22 = new JLabel("Чи впливає стрес на ваше харчування ?");
		l_22.setForeground(new Color(255, 0, 255));
		l_22.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_22.setHorizontalAlignment(SwingConstants.CENTER);
		l_22.setBounds(4, 136, 378, 36);
		getContentPane().add(l_22);

		choice_22 = new Choice();
		choice_22.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_22.setBounds(390, 149, 294, 24);
		getContentPane().add(choice_22);
		choice_22.add("Стрес ніяк не впливає на моє харчування");
		choice_22.add("Їжа допомагає мені зняти стрес");
		choice_22.add("Під час стресу забуваю їсти");

		l_23 = new JLabel("Доводилось Вам сидіти на дієтах чи голодати ?");
		l_23.setForeground(new Color(255, 0, 255));
		l_23.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_23.setHorizontalAlignment(SwingConstants.CENTER);
		l_23.setBounds(2, 216, 380, 36);
		getContentPane().add(l_23);

		choice_23 = new Choice();
		choice_23.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_23.setBounds(388, 227, 235, 24);
		getContentPane().add(choice_23);
		choice_23.add("Ніколи");
		choice_23.add("1 раз");
		choice_23.add("Кільки разів");
		choice_23.add("Постійно сижду на якійсь диєті");

		l_24 = new JLabel("Курите ?");
		l_24.setForeground(new Color(255, 0, 255));
		l_24.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_24.setHorizontalAlignment(SwingConstants.CENTER);
		l_24.setBounds(2, 287, 380, 36);
		getContentPane().add(l_24);

		choice_24 = new Choice();
		choice_24.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_24.setBounds(388, 297, 235, 24);
		getContentPane().add(choice_24);
		choice_24.add("Ніколи");
		choice_24.add("Берусь і відразу кидаю");
		choice_24.add("Іноді, пачку на тиждень");
		choice_24.add("Так, що най менше пачку в день");

		l_25 = new JLabel("Як ви ставитесь до їжі «за компанію» ?");
		l_25.setForeground(new Color(255, 0, 255));
		l_25.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_25.setHorizontalAlignment(SwingConstants.CENTER);
		l_25.setBounds(2, 61, 380, 36);
		getContentPane().add(l_25);

		choice_25 = new Choice();
		choice_25.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		choice_25.setBounds(388, 71, 296, 24);
		getContentPane().add(choice_25);
		choice_25.add("Ніколи не дозволяю собі такого");
		choice_25.add("Іноді потрапляю на банкет");
		choice_25.add("Люблю із друзями так обідати/вечеряти");
		choice_25.add("Завжди так харчуюсь");

		l_putanna4 = new JLabel("21-25/25");
		l_putanna4.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna4.setBounds(29, 460, 124, 49);
		getContentPane().add(l_putanna4);

		button = new JButton("Перейти до інших запитань");
		button.addActionListener(new ActionListener() {
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

				new DiagnostikaVusnovokObchuslenna(i_RikNarodgenna, i_Stat, i_Zrist, i_Vaga, i_Profesia, i_choice_6,
						i_choice_7, i_choice_8, i_choice_9, i_choice_10, i_choice_11, i_choice_12, i_choice_13,
						i_choice_14, i_choice_15, i_choice_16, i_choice_17, i_choice_18, i_choice_19, i_choice_20,
						i_choice_21, i_choice_22, i_choice_23, i_choice_24, i_choice_25);
				setVisible(false);
			}
		});
		button.setForeground(new Color(255, 140, 0));
		button.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		button.setBounds(184, 425, 386, 49);
		getContentPane().add(button);

		button_1 = new JButton("Меню");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		button_1.setForeground(new Color(255, 140, 0));
		button_1.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		button_1.setBounds(184, 487, 386, 49);
		getContentPane().add(button_1);

		label = new JLabel("");
		label.setBounds(629, 0, 365, 565);
		label.setIcon(new ImageIcon("res/Diagnostika4.jpg"));
		getContentPane().add(label);

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Reestracia.png"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}

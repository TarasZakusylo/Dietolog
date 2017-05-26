package Dykyi;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;

public class Diagnostika2 extends JFrame {

	private static final long serialVersionUID = 1L;

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
	private JButton button;
	private JButton button_1;

	public Diagnostika2(final int i_RikNarodgenna, final int i_Stat, final int i_Zrist, final int i_Vaga,
			final int i_Profesia, final int i_choice_6, final int i_choice_7, final int i_choice_8,
			final int i_choice_9, final int i_choice_10) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_11 = new JLabel("Скільки овочів та фруктів з’їдаєте за день ? ");
		l_11.setBounds(30, 87, 280, 36);
		getContentPane().add(l_11);

		choice_11 = new Choice();
		choice_11.setBounds(316, 90, 177, 36);
		getContentPane().add(choice_11);
		choice_11.add("Основа мого раціону");
		choice_11.add("Сумарно десь тарілочку на тиждень");
		choice_11.add("Майже не їм");

		l_12 = new JLabel("Скільки рідини випиваєте за день ?");
		l_12.setBounds(32, 136, 281, 36);
		getContentPane().add(l_12);

		choice_12 = new Choice();
		choice_12.setBounds(316, 139, 177, 22);
		getContentPane().add(choice_12);
		choice_12.add("Не менше 2,5 літрів різноманітних напоїв");
		choice_12.add("Кілька кружок чаю чи кави");
		choice_12.add("Чашечку кави ранком та чашечку ввечері");

		l_13 = new JLabel("Буває у Вас після прийому їжі важкість ?");
		l_13.setBounds(32, 195, 281, 36);
		getContentPane().add(l_13);

		choice_13 = new Choice();
		choice_13.setBounds(316, 195, 177, 22);
		getContentPane().add(choice_13);
		choice_13.add("Ніколи");
		choice_13.add("Дуже рідко");
		choice_13.add("Іноді після вечері");
		choice_13.add("Постійно");

		l_14 = new JLabel("Займаєтесь спортом, додатковими фізичними навантаженнями ?");
		l_14.setBounds(32, 256, 281, 36);
		getContentPane().add(l_14);

		choice_14 = new Choice();
		choice_14.setBounds(316, 256, 177, 22);
		getContentPane().add(choice_14);
		choice_14.add("Спорт у мене в крові");
		choice_14.add("1-2 рази на таждень");
		choice_14.add("Дуже рідко");
		choice_14.add("Ніколи, це не для мене");

		l_15 = new JLabel("Як ви ставитесь до вегетаріанства ?");
		l_15.setBounds(32, 320, 281, 36);
		getContentPane().add(l_15);

		choice_15 = new Choice();
		choice_15.setBounds(316, 320, 175, 28);
		getContentPane().add(choice_15);
		choice_15.add("Я вегетеріанець");
		choice_15.add("Цікавлюсь цим");
		choice_15.add("Це не для мене");

		l_putanna2 = new JLabel("11-15/25");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_putanna2.setBounds(12, 434, 125, 49);
		getContentPane().add(l_putanna2);
		
		button = new JButton("Перейти до інших запитань");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s_choice_11 = choice_11.getSelectedItem();
				String s_choice_12 = choice_12.getSelectedItem();
				String s_choice_13 = choice_13.getSelectedItem();
				String s_choice_14 = choice_14.getSelectedItem();
				String s_choice_15 = choice_15.getSelectedItem();

				int i_choice_11 = 0;
				int i_choice_12 = 0;
				int i_choice_13 = 0;
				int i_choice_14 = 0;
				int i_choice_15 = 0;

				switch (s_choice_11) {
				case "Основа мого раціону": {
					i_choice_11 = 0;
				}
					break;
				case "Сумарно десь тарілочку на тиждень": {
					i_choice_11 = 1;
				}
					break;
				case "Майже не їм": {
					i_choice_11 = 2;
				}
					break;
				}

				switch (s_choice_12) {
				case "Не менше 2 літрів різноманітних напоїв": {
					i_choice_12 = 0;
				}
					break;
				case "Кілька кружок чаю чи кави": {
					i_choice_12 = 1;
				}
					break;
				case "Чашечку кави ранком та чашечку ввечері": {
					i_choice_12 = 2;
				}
					break;
				}

				switch (s_choice_13) {
				case "Ніколи": {
					i_choice_13 = 0;
				}
					break;
				case "Дуже рідко": {
					i_choice_13 = 1;
				}
					break;
				case "Іноді після вечері": {
					i_choice_13 = 2;
				}
					break;
				case "Постійно": {
					i_choice_13 = 3;
				}
					break;
				}
			 
				switch (s_choice_14) {
				case "Спорт у мене в крові": {
					i_choice_14 = 0;
				}
					break;
				case "1-2 рази на таждень": {
					i_choice_14 = 1;
				}
					break;
				case "Дуже рідко": {
					i_choice_14 = 2;
				}
					break;
				case "Ніколи, це не для мене": {
					i_choice_14 = 3;
				}
					break;
				}
				
				switch (s_choice_15) {
				case "Я вегетеріанець": {
					i_choice_15 = 0;
				}
					break;
				case "Цікавлюсь цим": {
					i_choice_15 = 1;
				}
					break;
				case "Це не для мене": {
					i_choice_15 = 2;
				}
					break;
				}

				new Diagnostika3(i_RikNarodgenna, i_Stat, i_Zrist, i_Vaga, i_Profesia, i_choice_6, i_choice_7,
						i_choice_8, i_choice_9, i_choice_10, i_choice_11, i_choice_12, i_choice_13, i_choice_14,
						i_choice_15);
				setVisible(false);
			}
		});
		button.setForeground(new Color(255, 140, 0));
		button.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		button.setBounds(151, 404, 386, 49);
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
		button_1.setBounds(151, 466, 386, 49);
		getContentPane().add(button_1);

		setVisible(true);

	}
}

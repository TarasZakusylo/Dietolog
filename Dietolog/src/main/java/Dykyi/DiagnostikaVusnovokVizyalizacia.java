package Dykyi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class DiagnostikaVusnovokVizyalizacia extends JFrame {

	private static final long serialVersionUID = 1L;

	private ButtonGroup group_Rezultatu;
	private JTextPane textPane_Rezultatu;
	private JRadioButton rB_Zagalno;
	private JRadioButton rB_Induvidualno;
	private JRadioButton rB_Dunamika;
	private JButton b_Vegan;
	private JRadioButton rB_Ditu;

	String s_RekomendaciiDlaDitey = "Не обмежуйте дитину в їжі. Це може призвести до анорексії, булімії "
			+ "та ряду інших хвороб. Не забувайте, що організм формується.\n\n"
			+ "Завжди майте під рукою здорову їжу. Наприклад, робіть перекус фруктами.\n\n"
			+ "Не діліть їжу на погану та хорошу. Краще робіть посилання на корисність.\n\n"
			+ "Хваліть за вибір їжі.\n\n" + "Будьте компромісними. Цукерки можна замінити сухофруктами.\n\n"
			+ "Заохочуйте дитину не їжею, а фізичними розвагами.\n\n" + "Сімейна вечеря - це традиція.\n\n"
			+ "Радьтесь із дітьми, щоб знати, що їм подобається.\n\n"
			+ "Не забувайте радитись із експертами у галузі харчування.\n\n"
			+ "Навчайте дітей правильно харчуватись.\n\n";

	private JLabel l_fon;
	boolean d_Ocinka = false;
	String s_Error = "";
	private JLabel l_IMT_komentar;

	public DiagnostikaVusnovokVizyalizacia(final String s_IMT, double d_IMT0, final String s_RekomendaciiZagalni,
			final String s_RekomendaciiPerconalni, int i_Vegeterianstvo, final int i_Ocinka, final int i_Error,
			final String s_Dunamika) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton b_Menu = new JButton("Меню");
		b_Menu.setForeground(new Color(255, 140, 0));
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu("Дієтолог");
				setVisible(false);
			}
		});
		b_Menu.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		b_Menu.setBounds(608, 516, 386, 49);
		getContentPane().add(b_Menu);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 44, 610, 521);
		getContentPane().add(scrollPane);

		textPane_Rezultatu = new JTextPane();
		scrollPane.setViewportView(textPane_Rezultatu);
		textPane_Rezultatu.setText(s_IMT + s_RekomendaciiPerconalni);
		textPane_Rezultatu.setForeground(Color.MAGENTA);
		textPane_Rezultatu.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textPane_Rezultatu.setBackground(Color.WHITE);
		textPane_Rezultatu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if (d_Ocinka == false) {
					if (i_Ocinka <= 9) {
						JOptionPane.showMessageDialog(null,
								"Стан Вашого харчування у межах норми.\n" + "Так тримати. Бережіть себе.");
					}
					if (i_Ocinka >= 9 && i_Ocinka <= 18) {
						JOptionPane.showMessageDialog(null, "Стан Вашого харчування - небезпечний.\n"
								+ "Детально перегляньте своє харчування. Бережіть себе.");
					}
					if (i_Ocinka >= 18) {
						JOptionPane.showMessageDialog(null,
								"Стан Вашого харчування критичний.\n" + "ТЕРМІНОВО займіться собою. Бережіть себе.");
					}
					d_Ocinka = true;
				}
				if (i_Error == 1) {
					s_Error = s_Error
							+ "Помилкове введення, рекомендовано пройти опитування ще раз.\nЗверніть увагу на рік народження.";
					JOptionPane.showMessageDialog(null, s_Error);
				}
			}
		});

		rB_Zagalno = new JRadioButton("Загально");
		rB_Zagalno.setOpaque(false);
		rB_Zagalno.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		rB_Zagalno.setForeground(Color.ORANGE);
		rB_Zagalno.setBounds(8, 10, 120, 25);
		getContentPane().add(rB_Zagalno);
		rB_Zagalno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Rezultatu.setText(s_RekomendaciiZagalni);
			}
		});

		rB_Induvidualno = new JRadioButton("Індивідуально");
		rB_Induvidualno.setOpaque(false);
		rB_Induvidualno.setSelected(true);
		rB_Induvidualno.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		rB_Induvidualno.setForeground(Color.ORANGE);
		rB_Induvidualno.setBounds(142, 10, 152, 25);
		getContentPane().add(rB_Induvidualno);
		rB_Induvidualno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Rezultatu.setText(s_IMT + s_RekomendaciiPerconalni);
			}
		});

		rB_Dunamika = new JRadioButton("Динаміка");
		rB_Dunamika.setOpaque(false);
		rB_Dunamika.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		rB_Dunamika.setForeground(Color.ORANGE);
		rB_Dunamika.setBounds(320, 10, 152, 25);
		getContentPane().add(rB_Dunamika);
		rB_Dunamika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Rezultatu.setText(s_Dunamika);
			}
		});

		b_Vegan = new JButton("Вегетеріанство");
		b_Vegan.setForeground(new Color(255, 140, 0));
		b_Vegan.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		getContentPane().add(b_Vegan);
		if (i_Vegeterianstvo == 0) {
			b_Vegan.setBounds(608, 469, 386, 49);
		}
		b_Vegan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vegeterianstvo("Дієтолог");
				setVisible(false);
			}
		});

		rB_Ditu = new JRadioButton("Для дітей");
		rB_Ditu.setOpaque(false);
		rB_Ditu.setForeground(Color.ORANGE);
		rB_Ditu.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		rB_Ditu.setBounds(476, 10, 152, 25);
		getContentPane().add(rB_Ditu);
		rB_Ditu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Rezultatu.setText(s_RekomendaciiDlaDitey);
			}
		});

		group_Rezultatu = new ButtonGroup();
		group_Rezultatu.add(rB_Zagalno);
		group_Rezultatu.add(rB_Induvidualno);
		group_Rezultatu.add(rB_Dunamika);
		group_Rezultatu.add(rB_Ditu);

		JLabel l_Kartunka = new JLabel("");
		l_Kartunka.setIcon(new ImageIcon("res/DiagnostukaRezultatu.jpg"));
		l_Kartunka.setBounds(608, 69, 386, 386);
		getContentPane().add(l_Kartunka);

		JLabel l_IMT = new JLabel("Індекс Маси Тіла  = " + d_IMT0);
		l_IMT.setForeground(Color.BLUE);
		l_IMT.setHorizontalAlignment(SwingConstants.CENTER);
		l_IMT.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		l_IMT.setBounds(679, 10, 251, 25);
		getContentPane().add(l_IMT);

		l_IMT_komentar = new JLabel("Норма в межах з 18 до 25");
		l_IMT_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_IMT_komentar.setForeground(Color.MAGENTA);
		l_IMT_komentar.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		l_IMT_komentar.setBounds(622, 35, 362, 14);
		getContentPane().add(l_IMT_komentar);

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Reestracia.png"));
		l_fon.setBounds(-1, 0, 995, 572);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}

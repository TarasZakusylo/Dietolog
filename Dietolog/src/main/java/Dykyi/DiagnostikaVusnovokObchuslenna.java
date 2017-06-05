package Dykyi;

import java.io.File;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DiagnostikaVusnovokObchuslenna {

	private Formatter formatter_dani;
	private Scanner scanner_Korustuvac;
	String[][] Reading_PIP = new String[1][2];
	private String Reading_Name;
	private String Reading_Prizvusko;

	private Scanner scanner_Dani;
	String[][] Reading_Dani = new String[1][28];
	private String Reading_1;
	private String Reading_2;
	private String Reading_3;
	private String Reading_4;
	private String Reading_5;
	private String Reading_6;
	private String Reading_7;
	private String Reading_8;
	private String Reading_9;
	private String Reading_10;
	private String Reading_11;
	private String Reading_12;
	private String Reading_13;
	private String Reading_14;
	private String Reading_15;
	private String Reading_16;
	private String Reading_17;
	private String Reading_18;
	private String Reading_19;
	private String Reading_20;
	private String Reading_21;
	private String Reading_22;
	private String Reading_23;
	private String Reading_24;
	private String Reading_25;
	private String Reading_26;
	private String Reading_27;
	private String Reading_28;

	private int i_Reading_1;
	private int i_Reading_2;
	private int i_Reading_3;
	private int i_Reading_4;
	private int i_Reading_5;
	private int i_Reading_6;
	private int i_Reading_7;
	private int i_Reading_8;
	private int i_Reading_9;
	private int i_Reading_10;
	private int i_Reading_11;
	private int i_Reading_12;
	private int i_Reading_13;
	private int i_Reading_14;
	private int i_Reading_15;
	private int i_Reading_16;
	private int i_Reading_17;
	private int i_Reading_18;
	private int i_Reading_19;
	private int i_Reading_20;
	private int i_Reading_21;
	private int i_Reading_22;
	private int i_Reading_23;
	private int i_Reading_24;
	private int i_Reading_25;
	private int i_Reading_26;
	private int i_Reading_27;
	private int i_Reading_28;

	String s_Error = "";

	@SuppressWarnings("static-access")

	public DiagnostikaVusnovokObchuslenna(final int i_RikNarodgenna, final int i_Stat, final int i_Zrist,
			final int i_Vaga, final int i_Profesia, final int i_choice_6, final int i_choice_7, final int i_choice_8,
			final int i_choice_9, final int i_choice_10, final int i_choice_11, final int i_choice_12,
			final int i_choice_13, final int i_choice_14, final int i_choice_15, final int i_choice_16,
			final int i_choice_17, final int i_choice_18, final int i_choice_19, final int i_choice_20,
			final int i_choice_21, final int i_choice_22, final int i_choice_23, final int i_choice_24,
			final int i_choice_25) {

		Calendar calendar = Calendar.getInstance();
		int den = calendar.get(calendar.DAY_OF_MONTH);
		int misac = calendar.get(calendar.MONTH) + 1;
		int rik = calendar.get(calendar.YEAR);

		String dani = i_RikNarodgenna + " " + i_Stat + " " + i_Zrist + " " + i_Vaga + " " + i_Profesia + " "
				+ i_choice_6 + " " + i_choice_7 + " " + i_choice_8 + " " + i_choice_9 + " " + i_choice_10 + " "
				+ i_choice_11 + " " + i_choice_12 + " " + i_choice_13 + " " + i_choice_14 + " " + i_choice_15 + " "
				+ i_choice_16 + " " + i_choice_17 + " " + i_choice_18 + " " + i_choice_19 + " " + i_choice_20 + " "
				+ i_choice_21 + " " + i_choice_22 + " " + i_choice_23 + " " + i_choice_24 + " " + i_choice_25 + " "
				+ den + " " + misac + " " + rik;

		try {
			scanner_Korustuvac = new Scanner(new File("res/TumcasoviFaylu/Korustuvac.txt"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Помилка введення");
		}

		while (scanner_Korustuvac.hasNext()) {
			for (int row = 0; row < Reading_PIP.length; row++) {
				for (int col = 0; col < Reading_PIP[row].length; col++) {
					Reading_PIP[row][col] = scanner_Korustuvac.next();
					if (col == 0) {
						Reading_Name = Reading_PIP[row][col];
					}
					if (col == 1) {
						Reading_Prizvusko = Reading_PIP[row][col];
					}
				}
			}
		}
		scanner_Korustuvac.close();

		String PIP = Reading_Name + " " + Reading_Prizvusko;

		final File file = new File("res/Dani/" + PIP + ".txt");
		if (file.exists()) {
			try {
				scanner_Dani = new Scanner(new File("res/Dani/" + PIP + ".txt"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Помилка введення");
			}

			while (scanner_Dani.hasNext()) {
				for (int row = 0; row < Reading_Dani.length; row++) {
					for (int col = 0; col < Reading_Dani[row].length; col++) {
						Reading_Dani[row][col] = scanner_Dani.next();
						switch (col) {
						case 0:
							Reading_1 = Reading_Dani[row][col];
							break;
						case 1:
							Reading_2 = Reading_Dani[row][col];
							break;
						case 2:
							Reading_3 = Reading_Dani[row][col];
							break;
						case 3:
							Reading_4 = Reading_Dani[row][col];
							break;
						case 4:
							Reading_5 = Reading_Dani[row][col];
							break;
						case 5:
							Reading_6 = Reading_Dani[row][col];
							break;
						case 6:
							Reading_7 = Reading_Dani[row][col];
							break;
						case 7:
							Reading_8 = Reading_Dani[row][col];
							break;
						case 8:
							Reading_9 = Reading_Dani[row][col];
							break;
						case 9:
							Reading_10 = Reading_Dani[row][col];
							break;
						case 10:
							Reading_11 = Reading_Dani[row][col];
							break;
						case 11:
							Reading_12 = Reading_Dani[row][col];
							break;
						case 12:
							Reading_13 = Reading_Dani[row][col];
							break;
						case 13:
							Reading_14 = Reading_Dani[row][col];
							break;
						case 14:
							Reading_15 = Reading_Dani[row][col];
							break;
						case 15:
							Reading_16 = Reading_Dani[row][col];
							break;
						case 16:
							Reading_17 = Reading_Dani[row][col];
							break;
						case 17:
							Reading_18 = Reading_Dani[row][col];
							break;
						case 18:
							Reading_19 = Reading_Dani[row][col];
							break;
						case 19:
							Reading_20 = Reading_Dani[row][col];
							break;
						case 20:
							Reading_21 = Reading_Dani[row][col];
							break;
						case 21:
							Reading_22 = Reading_Dani[row][col];
							break;
						case 22:
							Reading_23 = Reading_Dani[row][col];
							break;
						case 23:
							Reading_24 = Reading_Dani[row][col];
							break;
						case 24:
							Reading_25 = Reading_Dani[row][col];
							break;
						case 25:
							Reading_26 = Reading_Dani[row][col];
							break;
						case 26:
							Reading_27 = Reading_Dani[row][col];
							break;
						case 27:
							Reading_28 = Reading_Dani[row][col];
							break;
						}
					}
				}
			}
			scanner_Dani.close();

			i_Reading_1 = Integer.parseInt(Reading_1);
			i_Reading_2 = Integer.parseInt(Reading_2);
			i_Reading_3 = Integer.parseInt(Reading_3);
			i_Reading_4 = Integer.parseInt(Reading_4);
			i_Reading_5 = Integer.parseInt(Reading_5);
			i_Reading_6 = Integer.parseInt(Reading_6);
			i_Reading_7 = Integer.parseInt(Reading_7);
			i_Reading_8 = Integer.parseInt(Reading_8);
			i_Reading_9 = Integer.parseInt(Reading_9);
			i_Reading_10 = Integer.parseInt(Reading_10);
			i_Reading_11 = Integer.parseInt(Reading_11);
			i_Reading_12 = Integer.parseInt(Reading_12);
			i_Reading_13 = Integer.parseInt(Reading_13);
			i_Reading_14 = Integer.parseInt(Reading_14);
			i_Reading_15 = Integer.parseInt(Reading_15);
			i_Reading_16 = Integer.parseInt(Reading_16);
			i_Reading_17 = Integer.parseInt(Reading_17);
			i_Reading_18 = Integer.parseInt(Reading_18);
			i_Reading_19 = Integer.parseInt(Reading_19);
			i_Reading_20 = Integer.parseInt(Reading_20);
			i_Reading_21 = Integer.parseInt(Reading_21);
			i_Reading_22 = Integer.parseInt(Reading_22);
			i_Reading_23 = Integer.parseInt(Reading_23);
			i_Reading_24 = Integer.parseInt(Reading_24);
			i_Reading_25 = Integer.parseInt(Reading_25);
			i_Reading_26 = Integer.parseInt(Reading_26);
			i_Reading_27 = Integer.parseInt(Reading_27);
			i_Reading_28 = Integer.parseInt(Reading_28);

			if (i_Reading_6 != i_RikNarodgenna) {
				s_Error = s_Error
						+ "Помилкове введення пройдіть опитування, буль ласка опитування ще раз.\nЗверніть увагу на рік народження";
			}

			// динаміка характеристик

			double d_IMT0 = i_Vaga / ((i_Zrist / 100) * (i_Zrist / 100));
			double d_IMT1 = i_Reading_4 / ((i_Reading_3 / 100) * (i_Reading_3 / 100));
			String s_IMT = "";
			String s_RekomendaciiZagalni = "Їсти бажано в один і той же час, який ви повинні встановити "
					+ "собі самі (у зв’язку із характером праці).\n"
					+ "Склянка води без газу за півгодини до їжі зменшує апетит.\n"
					+ "Їжу потрібно починати з нежирного супу або салату.\n"
					+ "Слідкуйте за розміром порцій і не беріть добавки.\n"
					+ "Їжте повільно, ретельно пережовуючи. При швидкому поглинанні "
					+ "їжі відчуття насичення \"відстає\" від кількості поглинутої їжі."
					+ " Внаслідок чого з’їдається зайва кількість їжі.\n"
					+ "Купуйте продукти за попередньо складеним списком.\n"
					+ "Не купуйте продукти у стані голоду.\n"
					+ "Купуючи продукти, завжди читати етикетку про склад (жири, вуглеводи, кілокалорії).\n"
					+ "Не довіряти словам \"дієтичний\" або \"низькокалорійний\", дивитися на цифри.\n";
			
			String s_RekomendaciiPerconalni = "" ;
			
			int s_Vegeterianstvo = 0;

			if (d_IMT0 >= 18 || d_IMT0 <= 25) {
				s_IMT = s_IMT + "Маса тіла у межах норми. Вітаємо !";
			}
			if (d_IMT0 <= 18) {
				s_IMT = s_IMT + "Недостатня маса тіла. Необхідні термінові заходи.";
			}
			if (d_IMT0 >= 25) {
				s_IMT = s_IMT + "Надмірна маса тіла. Необхідні термінові заходи.";
			}
			if (i_choice_6 != 0 && i_choice_13 == 0 || i_choice_6 != 0 && i_choice_13 == 1) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Спосперігається недоїдання, намагайтесь їсти частіше.\n";
			}
			if (i_choice_6 != 0 && i_choice_13 == 2 || i_choice_6 != 0 && i_choice_13 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Недоречні прийоми їжі. Намагайтесь їсти частіше, але меншими порціями.\n";
			}
			if (i_choice_6 == 0 && i_choice_13 == 2 || i_choice_6 == 0 && i_choice_13 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Спосперігається переїдання, намагайтесь їсти рідше."
						+ "Необхідно іноді влаштовувати розвантажувальний день, наприклад, "
						+ "2 літри знежиреного кефіру або молока, або 1 кг. кабачків і 200 г. "
						+ "нежирного м’яса за день. При цьому воду або чай можна пити без обмежень.\n";
			}

			int i_IjaPeredSnom = i_choice_8 - i_choice_10;

			if (i_IjaPeredSnom == 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вам необхадно вечеряти на годину раніше. Ви занадто пізно їсте.\n";
			}

			if (i_IjaPeredSnom > 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вам необхадно вечеряти на 2 години раніше. Ви занадто пізно їсте.\n";
			}

			if (i_choice_7 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Основним прийомом їжі має бути обід.\n";
			}
			if (i_choice_9 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вам варто вживати менше солодкого.\n";
			}
			if (i_choice_11 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Варто більше вживати овочів та фруктів.\n";
			}
			if (i_choice_12 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Людина має пити не менше 2 літпів води на день.\n";
			}
			if (i_Profesia != 1) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Оскільки у Вас інтелектуальна робота, то Вам неохідно насичувати свій раціон"
						+ " кашами, злаками, овочами.\n";
			}
			if (i_Profesia == 1 && i_choice_14 == 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Оскільки у Вас фізична робота та Ви займаєтесь спортом,"
						+ " то Вам неохідно насичувати свій раціон" + " м'ясом, яйцями, рибою, горіхами.\n";
			}
			if (i_choice_15 != 0) {
				s_Vegeterianstvo = 1;
			}
			if (i_choice_16 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Завжди необхыдно снідати.\n";
			}
			if (i_choice_17 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вживайте більше молочних продуктів.\n";
			}
			if (i_choice_18 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Намагайтесь урізноманітнювати Ваш раціон.\n";
			}
			if (i_choice_19 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Алкоголь убиває Вас і Ваш раціон. Позбудьтесь його.\n";
			}
			if (i_choice_20 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Старайтесь мінімізувати вживання жирної їжі.\n";
			}
			if (i_choice_21 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Солодке псує ваше здорв'я.\n";
			}
			if (i_choice_22 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Пам'ятайте, що стрес дуже негативно впливає на Ваше харчування та здоров'я.\n";
			}
			if (i_choice_23 == 2 && i_choice_23 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вірте тільки тим дієтам, які порекомендував Вам лікар. "
						+ "Подрузі, книги чи Інтернет не є надійним джерелом.\n";
			}
			if (i_choice_25 == 2 && i_choice_25 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вам варто відмовитись від харчування із друзями, колегами. Це шкодить вашому раціону.\n";
			}
			if (i_choice_24 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вам необхідно кидати курити. Прогнозується, що це супроводжуватиметься підвищенням апетиту"
						+ ", тому дотримуйтесь раціону. Іноді курці замінюють сигаретою прийом їжі, недопускайте цього.\n";
			}

			new DiagnostikaVusnovokVizyalizacia(s_IMT, s_RekomendaciiPerconalni, s_Vegeterianstvo);

		} else {
			// System.out.println("Файл не существует.");
			try {
				formatter_dani = new Formatter("res/Dani/" + PIP + ".txt");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "System Error");
			}
			formatter_dani.format(dani);
			formatter_dani.close();
		}

	}

}

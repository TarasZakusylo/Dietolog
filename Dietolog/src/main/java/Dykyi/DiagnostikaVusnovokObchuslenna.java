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
	private String Reading_3;
	private String Reading_4;
	private String Reading_6;
	private String Reading_7;
	private String Reading_8;
	private String Reading_9;
	private String Reading_10;
	private String Reading_11;
	private String Reading_12;
	private String Reading_13;
	private String Reading_16;
	private String Reading_17;
	private String Reading_18;
	private String Reading_19;
	private String Reading_20;
	private String Reading_21;
	private String Reading_25;

	private int i_Reading_1;
	private int i_Reading_3;
	private int i_Reading_4;
	private int i_Reading_6;
	private int i_Reading_7;
	private int i_Reading_8;
	private int i_Reading_9;
	private int i_Reading_10;
	private int i_Reading_11;
	private int i_Reading_12;
	private int i_Reading_13;
	private int i_Reading_16;
	private int i_Reading_17;
	private int i_Reading_18;
	private int i_Reading_19;
	private int i_Reading_20;
	private int i_Reading_21;
	private int i_Reading_25;

	int i_Error = 0;

	String s_IMT = "";
	String s_RekomendaciiZagalni = "Їсти бажано в один і той же час, який ви повинні встановити "
			+ "собі самі (у зв’язку із характером праці).\n\n"
			+ "Склянка води без газу за півгодини до їжі зменшує апетит.\n\n"
			+ "Їжу потрібно починати з нежирного супу або салату.\n\n"
			+ "Слідкуйте за розміром порцій і не беріть добавки.\n\n"
			+ "Їжте повільно, ретельно пережовуючи. При швидкому поглинанні "
			+ "їжі відчуття насичення \"відстає\" від кількості поглинутої їжі."
			+ " Внаслідок чого з’їдається зайва кількість їжі.\n\n"
			+ "Купуйте продукти за попередньо складеним списком.\n\n" + "Не купуйте продукти у стані голоду.\n\n"
			+ "Купуючи продукти, завжди читати етикетку про склад (жири, вуглеводи, кілокалорії).\n\n"
			+ "Не довіряти словам \"дієтичний\" або \"низькокалорійний\", дивитися на цифри.\n\n";

	String s_RekomendaciiPerconalni = "";

	int i_Vegeterianstvo = 0;
	int i_Ocinka = 0;
	String s_Dunamika = "";

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
						case 2:
							Reading_3 = Reading_Dani[row][col];
							break;
						case 3:
							Reading_4 = Reading_Dani[row][col];
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
						case 24:
							Reading_25 = Reading_Dani[row][col];
							break;
						}
					}
				}
			}
			scanner_Dani.close();

			i_Reading_1 = Integer.parseInt(Reading_1);
			i_Reading_3 = Integer.parseInt(Reading_3);
			i_Reading_4 = Integer.parseInt(Reading_4);
			i_Reading_6 = Integer.parseInt(Reading_6);
			i_Reading_7 = Integer.parseInt(Reading_7);
			i_Reading_8 = Integer.parseInt(Reading_8);
			i_Reading_9 = Integer.parseInt(Reading_9);
			i_Reading_10 = Integer.parseInt(Reading_10);
			i_Reading_11 = Integer.parseInt(Reading_11);
			i_Reading_12 = Integer.parseInt(Reading_12);
			i_Reading_13 = Integer.parseInt(Reading_13);
			i_Reading_16 = Integer.parseInt(Reading_16);
			i_Reading_17 = Integer.parseInt(Reading_17);
			i_Reading_18 = Integer.parseInt(Reading_18);
			i_Reading_19 = Integer.parseInt(Reading_19);
			i_Reading_20 = Integer.parseInt(Reading_20);
			i_Reading_21 = Integer.parseInt(Reading_21);
			i_Reading_25 = Integer.parseInt(Reading_25);

			if (i_Reading_1 != i_RikNarodgenna) {
				i_Error = 1;
			}

			double d_IMT0 = i_Vaga
					/ (((i_Zrist / 100) + ((i_Zrist % 100) * 0.01)) * ((i_Zrist / 100) + ((i_Zrist % 100) * 0.01)));
			double d_IMT = d_IMT0;

			if (d_IMT0 >= 18 && d_IMT0 <= 25) {
				s_IMT = s_IMT + "Маса тіла у межах норми. Вітаємо !\n\n";
			}
			if (d_IMT0 <= 18) {
				s_IMT = s_IMT + "Недостатня маса тіла. Необхідні термінові заходи.\n\n";
			}
			if (d_IMT0 >= 25) {
				s_IMT = s_IMT + "Надмірна маса тіла. Необхідні термінові заходи.\n\n";
			}

			double d_IMT1 = i_Reading_4 / (((i_Reading_3 / 100) + ((i_Reading_3 % 100) * 0.01))
					* ((i_Reading_3 / 100) + ((i_Reading_3 % 100) * 0.01)));

			d_IMT1 = d_IMT1 - 22;
			d_IMT0 = d_IMT0 - 22;

			if (d_IMT0 < 0) {
				d_IMT0 = 0 - d_IMT0;
			}
			if (d_IMT1 < 0) {
				d_IMT1 = 0 - d_IMT1;
			}

			if (d_IMT1 == d_IMT0) {
				s_Dunamika = s_Dunamika + "Індекс маси Вашого тіла стабільний.\n\n";
			} else {
				if (d_IMT1 < d_IMT0) {
					s_Dunamika = s_Dunamika + "Індекс маси Вашого тіла раніше був кращий. Ви втрачаєте форму.\n\n";
				} else {
					s_Dunamika = s_Dunamika + "Індекс маси Вашого тіла став кращим. Ви набераєте форму.\n\n";
				}
			}

			int i_PereidannaDunamika = 0;

			if (i_choice_6 != 0 && i_choice_13 == 0 || i_choice_6 != 0 && i_choice_13 == 1) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Спосперігається недоїдання, намагайтесь їсти частіше.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_PereidannaDunamika = 1;
			}
			if (i_choice_6 != 0 && i_choice_13 == 2 || i_choice_6 != 0 && i_choice_13 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Недоречні прийоми їжі. Намагайтесь їсти частіше, але меншими порціями.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_PereidannaDunamika = 2;
			}
			if (i_choice_6 == 0 && i_choice_13 == 2 || i_choice_6 == 0 && i_choice_13 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Спосперігається переїдання, намагайтесь їсти рідше."
						+ "Необхідно іноді влаштовувати розвантажувальний день, наприклад, "
						+ "2 літри знежиреного кефіру або молока, або 1 кг. кабачків і 200 г. "
						+ "нежирного м’яса за день. При цьому воду або чай можна пити без обмежень.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_PereidannaDunamika = 3;
			}

			if (i_Reading_6 != 0 && i_Reading_13 == 0 || i_Reading_6 != 0 && i_Reading_13 == 1) {
				if (i_PereidannaDunamika == 0) {
					s_Dunamika = s_Dunamika + "Ви вирішили проблему із недоїданням. Вітаю.\n\n";
				}
				if (i_PereidannaDunamika == 1) {
					s_Dunamika = s_Dunamika + "Проблема із недоїданням у Вас так і залишилась.\n\n";
				}
				if (i_PereidannaDunamika == 2) {
					s_Dunamika = s_Dunamika + "Ви вирішили проблему із недоїданням. Але тепер у Вас "
							+ "Проблема із недоречними прийоми їжі."
							+ " Намагайтесь їсти частіше, але меншими порціями.\n\n";
				}
				if (i_PereidannaDunamika == 3) {
					s_Dunamika = s_Dunamika + "Ви вирішили проблему із недоїданням. Але тепер у Вас "
							+ "проблема із переїданням у Вас.\n\n";
				}
			}
			if (i_Reading_6 != 0 && i_Reading_13 == 2 || i_Reading_6 != 0 && i_Reading_13 == 3) {
				if (i_PereidannaDunamika == 0) {
					s_Dunamika = s_Dunamika + "Ви вирішили проблему із недоречними прийоми їжі.\n\n";
				}
				if (i_PereidannaDunamika == 1) {
					s_Dunamika = s_Dunamika + "Ви вирішили проблему із недоречними прийоми їжі. Але тепер у Вас \n\n"
							+ " Проблема із недоїданням.\n\n";
				}
				if (i_PereidannaDunamika == 2) {
					s_Dunamika = s_Dunamika + "Проблема із недоречними прийоми їжі у Вас так і залишилась.\n\n";
				}
				if (i_PereidannaDunamika == 3) {
					s_Dunamika = s_Dunamika + "Ви вирішили проблему із недоречними прийоми їжі. Але тепер у Вас \n\n"
							+ "проблема із переїданням.\n\n";
				}
			}
			if (i_Reading_6 == 0 && i_Reading_13 == 2 || i_Reading_6 == 0 && i_Reading_13 == 3) {
				if (i_PereidannaDunamika == 0) {
					s_Dunamika = s_Dunamika + "Ви вирішили проблему із переїданням.\n\n";
				}
				if (i_PereidannaDunamika == 1) {
					s_Dunamika = s_Dunamika + "Ви вирішили проблему із переїданням. Але тепер у Вас\n\n"
							+ " Проблема із недоїданням.\n\n";
				}
				if (i_PereidannaDunamika == 2) {
					s_Dunamika = s_Dunamika + "Ви вирішили проблему із переїданням. Але тепер у Вас\n\n"
							+ " Проблема із недоречним прийомом їжі.\n\n";
				}
				if (i_PereidannaDunamika == 3) {
					s_Dunamika = s_Dunamika + "Проблема із переїданням у Вас так і залишилась.\n\n";
				}
			}

			int i_IjaPeredSnom = i_choice_8 - i_choice_10;
			int i_IjaPeredSnomDunamika = 0;

			if (i_IjaPeredSnom == 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вам необхадно вечеряти на годину раніше. Ви занадто пізно їсте.\n\n";
				i_Ocinka = i_Ocinka + 1;
				i_IjaPeredSnomDunamika = 1;
			}

			if (i_IjaPeredSnom > 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вам необхадно вечеряти на 2 години раніше. Ви занадто пізно їсте.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_IjaPeredSnomDunamika = 2;
			}

			int i_IjaPeredSnom1 = i_Reading_8 - i_Reading_10;

			if (i_IjaPeredSnom1 < 0) {
				if (i_IjaPeredSnomDunamika == 1) {
					s_Dunamika = s_Dunamika + "Ви почали занадто пізно вечеряти. "
							+ "Вам необхадно вечеряти на годину раніше.\n\n";
				}
				if (i_IjaPeredSnomDunamika == 2) {
					s_Dunamika = s_Dunamika + "Ви почали дуже пізно вечеряти. "
							+ "Вам необхадно вечеряти на 2 години раніше.\n\n";
				}
			}
			if (i_IjaPeredSnom1 == 0) {
				if (i_IjaPeredSnomDunamika == 0) {
					s_Dunamika = s_Dunamika + "Ви почали вечеряти значно раніше, Молодець.\n\n";
				}
				if (i_IjaPeredSnomDunamika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не почали раніше харчуватись."
							+ "Вам необхадно вечеряти на годину раніше. Ви занадто пізно їсте.\n\n";
				}
				if (i_IjaPeredSnomDunamika == 2) {
					s_Dunamika = s_Dunamika + "Ви почали ще пізніше харчуватись! "
							+ "Вам необхадно вечеряти на дві години раніше. Ви дуже пізно їсте.\n\n";
				}
			}
			if (i_IjaPeredSnom1 > 0) {
				if (i_IjaPeredSnomDunamika == 0) {
					s_Dunamika = s_Dunamika + "Ви почали вечеряти значно раніше, Молодень." + " Ви виправились.\n\n";
				}
				if (i_IjaPeredSnomDunamika == 1) {
					s_Dunamika = s_Dunamika + "Ви почали вечеряти значно раніше, Молодень."
							+ "Але це ше не кінець, продовжуйте.\n\n";
				}
				if (i_IjaPeredSnomDunamika == 2) {
					s_Dunamika = s_Dunamika + "Ви так і не почали раніше харчуватись."
							+ "Вам необхадно вечеряти на 2 години раніше. Ви занадто пізно їсте.\n\n";
				}
			}
			int i_Reading_7_Diadnostika = 0;
			if (i_choice_7 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Основним прийомом їжі має бути обід.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_7_Diadnostika = 1;
			}
			if (i_Reading_7 != 0) {
				if (i_Reading_7_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви зробили основним прийомом їжі обід, Молодень.\n\n";
				}
				if (i_Reading_7_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не зробили основним прийомом їжі обід, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_7_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви почили робити помилки. Поверніть попереднє ставлення до обіду. "
							+ "Основним прийомом їжі має бути обід.\n\n";
				}
			}
			int i_Reading_9_Diadnostika = 0;
			if (i_choice_9 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вам варто вживати менше солодкого.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_9_Diadnostika = 1;
			}
			if (i_Reading_9 == 2) {
				if (i_Reading_9_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви почали менше вживати солодкого, Вітаю.\n\n";
				}
				if (i_Reading_9_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не зменшили вживання солодкого, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_9_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Поверніть попереднє ставлення до солодкого. "
							+ "Ви почили занадто багато його вживати.\n\n";
				}
			}
			int i_Reading_11_Diadnostika = 0;
			if (i_choice_11 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Варто більше вживати овочів та фруктів.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_11_Diadnostika = 1;
			}
			if (i_Reading_11 != 0) {
				if (i_Reading_11_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви більше стали вживати овочів та фруктів, так тримати.\n\n";
				}
				if (i_Reading_11_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не стали більше вживати овочів та фруктів, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_11_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Поверніть попереднє ставлення до овочів та фруктів. "
							+ "Ви почили занадто мало їх вживати.\n\n";
				}
			}
			int i_Reading_12_Diadnostika = 0;
			if (i_choice_12 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Людина має пити не менше 2 літпів води на день.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_12_Diadnostika = 1;
			}
			if (i_Reading_12 != 0) {
				if (i_Reading_12_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви більше стали вживати води, Молодець.\n\n";
				}
				if (i_Reading_12_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не стали більше вживати води, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_12_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви робите нові помилки. Поверніть попереднє ставлення до води. "
							+ "Ви почили занадто мало її вживати.\n\n";
				}
			}
			if (i_Profesia != 1) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Оскільки у Вас інтелектуальна робота, то Вам неохідно насичувати свій раціон"
						+ " кашами, злаками, овочами.\n";
			}
			if (i_Profesia == 1 && i_choice_14 == 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Оскільки у Вас фізична робота та Ви займаєтесь спортом,"
						+ " то Вам неохідно насичувати свій раціон" + " м'ясом, яйцями, рибою, горіхами.\n\n";
			}
			if (i_choice_15 == 2) {
				i_Vegeterianstvo = 1;
			}

			int i_Reading_16_Diadnostika = 0;
			if (i_choice_16 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Завжди необхыдно снідати.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_16_Diadnostika = 1;
			}
			if (i_Reading_16 != 0) {
				if (i_Reading_16_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви почали снідати, так тримати.\n\n";
				}
				if (i_Reading_16_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не почали снідати, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_16_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Терміново знову почніть снідати.\n\n";
				}
			}

			int i_Reading_17_Diadnostika = 0;
			if (i_choice_17 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вживайте більше молочних продуктів.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_17_Diadnostika = 1;
			}
			if (i_Reading_17 != 0) {
				if (i_Reading_17_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви більше стали вживати молочних продуктів, Вітаю.\n\n";
				}
				if (i_Reading_17_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не стали більше вживати молочних продуктів, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_17_Diadnostika == 1) {
					s_Dunamika = s_Dunamika
							+ "Ви робите нові помилки. Поверніть попереднє ставлення до молочних продуктів.\n\n";
				}
			}

			int i_Reading_18_Diadnostika = 0;
			if (i_choice_18 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Намагайтесь урізноманітнювати Ваш раціон.\n\n";
				i_Ocinka = i_Ocinka + 1;
				i_Reading_18_Diadnostika = 1;
			}
			if (i_Reading_18 == 2) {
				if (i_Reading_18_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви урізноманітнили свій регіон, так тримати.\n\n";
				}
				if (i_Reading_18_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не стали урізньоманітнювати свій регіон, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_18_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Поверніть попередній різноманітний раціон.\n\n";
				}
			}

			int i_Reading_19_Diadnostika = 0;
			if (i_choice_19 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Алкоголь убиває Вас і Ваш раціон. Позбудьтесь його.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_19_Diadnostika = 1;
			}
			if (i_Reading_19 == 2) {
				if (i_Reading_19_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви позбулись алкоголю, Вітаю.\n\n";
				}
				if (i_Reading_19_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не стали уникати алкоголю, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_19_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Вам варто позбутись алкоголю.\n\n";
				}
			}

			int i_Reading_20_Diadnostika = 0;
			if (i_choice_20 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Старайтесь мінімізувати вживання жирної їжі.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_20_Diadnostika = 1;
			}
			if (i_Reading_20 == 2) {
				if (i_Reading_20_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви позбулись жирної їжі, Молодець.\n\n";
				}
				if (i_Reading_20_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не стали уникати жирної їжі, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_20_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Вам варто позбутись жирної їжі.\n\n";
				}
			}

			int i_Reading_21_Diadnostika = 0;
			if (i_choice_21 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Солодке псує ваше здорв'я.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_21_Diadnostika = 1;
			}
			if (i_Reading_21 == 3) {
				if (i_Reading_21_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви позбулись солодкого, Вітаю.\n\n";
				}
				if (i_Reading_21_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не позбулись солодкого, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_21_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Вам варто зменшити вживання солодкого.\n\n";
				}
			}

			if (i_choice_22 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Пам'ятайте, що стрес дуже негативно впливає на Ваше харчування та здоров'я.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_23 == 2 && i_choice_23 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вірте тільки тим дієтам, які порекомендував Вам лікар. "
						+ "Подрузі, книги чи Інтернет не є надійним джерелом.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}
			int i_Reading_25_Diadnostika = 0;
			if (i_choice_25 == 2 && i_choice_25 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вам варто відмовитись від харчування із друзями, колегами. Це шкодить вашому раціону.\n\n";
				i_Ocinka = i_Ocinka + 2;
				i_Reading_25_Diadnostika = 1;
			}
			if (i_Reading_25 == 2 && i_Reading_25 == 3) {
				if (i_Reading_25_Diadnostika == 0) {
					s_Dunamika = s_Dunamika + "Ви перестали харчуватись за компанію, так тримати.\n\n";
				}
				if (i_Reading_25_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Ви так і не перестали харчуватись за компанію, виправляйтесь.\n\n";
				}
			} else {
				if (i_Reading_25_Diadnostika == 1) {
					s_Dunamika = s_Dunamika + "Вам варто перестати харчуватись за компанію.\n\n";
				}
			}

			if (i_choice_24 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вам необхідно кидати курити. Прогнозується, що це супроводжуватиметься підвищенням апетиту"
						+ ", тому дотримуйтесь раціону. Іноді курці замінюють сигаретою прийом їжі, недопускайте цього.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			try {
				formatter_dani = new Formatter("res/Dani/" + PIP + ".txt");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "System Error");
			}
			formatter_dani.format(dani);
			formatter_dani.close();

			new DiagnostikaVusnovokVizyalizacia(s_IMT, d_IMT, s_RekomendaciiZagalni, s_RekomendaciiPerconalni,
					i_Vegeterianstvo, i_Ocinka, i_Error, s_Dunamika);

		} else {
			// System.out.println("Файл не существует.");
			try {
				formatter_dani = new Formatter("res/Dani/" + PIP + ".txt");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "System Error");
			}
			formatter_dani.format(dani);
			formatter_dani.close();

			s_Dunamika = s_Dunamika + "Оскільки Ви вперше користуєтесь даним функціоналом, "
					+ "то система не може відобразити динаміку. Зверніться, будь ласка, пізніше.";

			double d_IMT0 = i_Vaga
					/ (((i_Zrist / 100) + ((i_Zrist % 100) * 0.01)) * ((i_Zrist / 100) + ((i_Zrist % 100) * 0.01)));
			double d_IMT = d_IMT0;

			if (d_IMT0 >= 18 && d_IMT0 <= 25) {
				s_IMT = s_IMT + "Маса тіла у межах норми. Вітаємо !\n\n";
			}
			if (d_IMT0 <= 18) {
				s_IMT = s_IMT + "Недостатня маса тіла. Необхідні термінові заходи.\n\n";
			}
			if (d_IMT0 >= 25) {
				s_IMT = s_IMT + "Надмірна маса тіла. Необхідні термінові заходи.\n\n";
			}

			if (i_choice_6 != 0 && i_choice_13 == 0 || i_choice_6 != 0 && i_choice_13 == 1) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Спосперігається недоїдання, намагайтесь їсти частіше.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}
			if (i_choice_6 != 0 && i_choice_13 == 2 || i_choice_6 != 0 && i_choice_13 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Недоречні прийоми їжі. Намагайтесь їсти частіше, але меншими порціями.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}
			if (i_choice_6 == 0 && i_choice_13 == 2 || i_choice_6 == 0 && i_choice_13 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Спосперігається переїдання, намагайтесь їсти рідше."
						+ "Необхідно іноді влаштовувати розвантажувальний день, наприклад, "
						+ "2 літри знежиреного кефіру або молока, або 1 кг. кабачків і 200 г. "
						+ "нежирного м’яса за день. При цьому воду або чай можна пити без обмежень.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			int i_IjaPeredSnom = i_choice_8 - i_choice_10;

			if (i_IjaPeredSnom == 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вам необхадно вечеряти на годину раніше. Ви занадто пізно їсте.\n\n";
				i_Ocinka = i_Ocinka + 1;
			}

			if (i_IjaPeredSnom > 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вам необхадно вечеряти на 2 години раніше. Ви занадто пізно їсте.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_7 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Основним прийомом їжі має бути обід.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_9 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вам варто вживати менше солодкого.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_11 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Варто більше вживати овочів та фруктів.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_12 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Людина має пити не менше 2 літпів води на день.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_Profesia != 1) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Оскільки у Вас інтелектуальна робота, то Вам неохідно насичувати свій раціон"
						+ " кашами, злаками, овочами.\n";
			}
			if (i_Profesia == 1 && i_choice_14 == 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Оскільки у Вас фізична робота та Ви займаєтесь спортом,"
						+ " то Вам неохідно насичувати свій раціон" + " м'ясом, яйцями, рибою, горіхами.\n\n";
			}
			if (i_choice_15 == 2) {
				i_Vegeterianstvo = 1;
			}

			if (i_choice_16 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Завжди необхыдно снідати.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_17 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Вживайте більше молочних продуктів.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_18 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Намагайтесь урізноманітнювати Ваш раціон.\n\n";
				i_Ocinka = i_Ocinka + 1;
			}

			if (i_choice_19 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Алкоголь убиває Вас і Ваш раціон. Позбудьтесь його.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_20 == 2) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Старайтесь мінімізувати вживання жирної їжі.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_21 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni + "Солодке псує ваше здорв'я.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_22 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Пам'ятайте, що стрес дуже негативно впливає на Ваше харчування та здоров'я.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_23 == 2 && i_choice_23 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вірте тільки тим дієтам, які порекомендував Вам лікар. "
						+ "Подрузі, книги чи Інтернет не є надійним джерелом.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}
			if (i_choice_25 == 2 && i_choice_25 == 3) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вам варто відмовитись від харчування із друзями, колегами. Це шкодить вашому раціону.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			if (i_choice_24 != 0) {
				s_RekomendaciiPerconalni = s_RekomendaciiPerconalni
						+ "Вам необхідно кидати курити. Прогнозується, що це супроводжуватиметься підвищенням апетиту"
						+ ", тому дотримуйтесь раціону. Іноді курці замінюють сигаретою прийом їжі, недопускайте цього.\n\n";
				i_Ocinka = i_Ocinka + 2;
			}

			new DiagnostikaVusnovokVizyalizacia(s_IMT, d_IMT, s_RekomendaciiZagalni, s_RekomendaciiPerconalni,
					i_Vegeterianstvo, i_Ocinka, i_Error, s_Dunamika);

		}

	}

}

package Dykyi;

import java.io.File;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DiagnostikaVusnovok {

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
	
//	private int i_Reading_1;
//	private int i_Reading_2;
//	private int i_Reading_3;
//	private int i_Reading_4;
//	private int i_Reading_5;
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
	
	String s_Error = "" ;

	@SuppressWarnings("static-access")

	public DiagnostikaVusnovok(final int i_RikNarodgenna, final int i_Stat, final int i_Zrist, final int i_Vaga,
			final int i_Profesia, final int i_choice_6, final int i_choice_7, final int i_choice_8,
			final int i_choice_9, final int i_choice_10, final int i_choice_11, final int i_choice_12,
			final int i_choice_13, final int i_choice_14, final int i_choice_15, final int i_choice_16,
			final int i_choice_17, final int i_choice_18, final int i_choice_19, final int i_choice_20,
			final int i_choice_21, final int i_choice_22, final int i_choice_23, final int i_choice_24,
			final int i_choice_25) {

		System.out.println(i_RikNarodgenna + "\n" + i_Stat + "\n" + i_Zrist + "\n" + i_Vaga + "\n" + i_Profesia + "\n"
				+ i_choice_6 + "\n" + i_choice_7 + "\n" + i_choice_8 + "\n" + i_choice_9 + "\n" + i_choice_10 + "\n"
				+ i_choice_11 + "\n" + i_choice_12 + "\n" + i_choice_13 + "\n" + i_choice_14 + "\n" + i_choice_15 + "\n"
				+ i_choice_16 + "\n" + i_choice_17 + "\n" + i_choice_18 + "\n" + i_choice_19 + "\n" + i_choice_20 + "\n"
				+ i_choice_21 + "\n" + i_choice_22 + "\n" + i_choice_23 + "\n" + i_choice_24 + "\n" + i_choice_25);

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

		System.out.println(Reading_Name + " " + Reading_Prizvusko);
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

			System.out.println(Reading_1 + " " + Reading_2 + " " + Reading_3 + " " + Reading_4 + " " + Reading_5 + " "
					+ Reading_6 + " " + Reading_7 + " " + Reading_8 + " " + Reading_9 + " " + Reading_10 + " "
					+ Reading_11 + " " + Reading_12 + " " + Reading_13 + " " + Reading_14 + " " + Reading_15 + " "
					+ Reading_16 + " " + Reading_17 + " " + Reading_18 + " " + Reading_19 + " " + Reading_20 + " "
					+ Reading_21 + " " + Reading_22 + " " + Reading_23 + " " + Reading_24 + " " + Reading_25 + " "
					+ Reading_26 + " " + Reading_27 + " " + Reading_28);
 
//			i_Reading_1 = Integer.parseInt(Reading_1);
//			i_Reading_2 = Integer.parseInt(Reading_2);
//			i_Reading_3 = Integer.parseInt(Reading_3);
//			i_Reading_4 = Integer.parseInt(Reading_4);
//			i_Reading_5 = Integer.parseInt(Reading_5);
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
			 
//			if(i_Reading_6 != i_RikNarodgenna){
//				s_Error = s_Error + "Помилкове введення пройдіть опитування, буль ласка опитування ще раз. Зверніть увагу на рік народження";
//			}
			
			File []fList;        
			File F = new File("res/Avtoruzacia");			        
			fList = F.listFiles();
			    String f = "" ;            
			for(int i=0; i<fList.length; i++)           
			{
			     //Нужны только папки в место isFile() пишим isDirectory()
			     if(fList[i].isFile())
			         f = f +   "\n" + fList[i].getName();
			}
			System.out.println(f);
			
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

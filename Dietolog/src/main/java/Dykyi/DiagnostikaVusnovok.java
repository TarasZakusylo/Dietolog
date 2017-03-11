package Dykyi;

import java.io.File;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DiagnostikaVusnovok {

 	private Formatter formatter_dani;
	private Scanner scanner_Korustuvac;
	String[][] Reading = new String[1][2];
	private String Reading_Name;
	private String Reading_Prizvusko;

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

//		 final File file = new File("res/TumcasoviFaylu/Korustuvac.txt");
//	        System.out.println(filename + ":");
//	        if (file.exists()) {
//	            System.out.println("Файл существует.");
//	        } else {
//	            System.out.println("Файл не существует.");
//	        }
		
		
		try {
			scanner_Korustuvac = new Scanner(new File("res/TumcasoviFaylu/Korustuvac.txt"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Помилка введення");
		}

		while (scanner_Korustuvac.hasNext()) {
			for (int row = 0; row < Reading.length; row++) {
				Reading_Name = " ";
				Reading_Prizvusko = " ";
				for (int col = 0; col < Reading[row].length; col++) {
					Reading[row][col] = scanner_Korustuvac.next();
					if (col == 0) {
						Reading_Name = Reading[row][col];
					}
					if (col == 1) {
						Reading_Prizvusko = Reading[row][col];
					}
					
				}
			}
		}
		scanner_Korustuvac.close();
		
		System.out.println(Reading_Name + " " + Reading_Prizvusko);
		
		Calendar calendar = Calendar.getInstance();
		int den = calendar.get(calendar.DAY_OF_MONTH);
		int misac = calendar.get(calendar.MONTH)+1;
		int rik = calendar.get(calendar.YEAR);
 
		String dani = i_RikNarodgenna + " " + i_Stat + " " + i_Zrist + " " + i_Vaga + " " + i_Profesia + " "
				+ i_choice_6 + " " + i_choice_7 + " " + i_choice_8 + " " + i_choice_9 + " " + i_choice_10 + " "
				+ i_choice_11 + " " + i_choice_12 + " " + i_choice_13 + " " + i_choice_14 + " " + i_choice_15 + " "
				+ i_choice_16 + " " + i_choice_17 + " " + i_choice_18 + " " + i_choice_19 + " " + i_choice_20 + " "
				+ i_choice_21 + " " + i_choice_22 + " " + i_choice_23 + " " + i_choice_24 + " " + i_choice_25 + " " 
				+ den + " " + misac + " " + rik ;

//		try {
//			formatter_dani = new Formatter("res/dani/.txt");
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "System Error");
//		}
//		formatter_dani.format(dani);
//		formatter_dani.close();

	}
}

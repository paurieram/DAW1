package RieraPau;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Enunciat_02 {
	   public final static String FIT_ENTRADA = "fitxers/NotesAlumne.txt";
	   public final static String FIT_SORTIDA = "fitxers/NotesDAW1.md";

	   public final static String[] LINIES = {
	      "**Mòduls de Primer de DAW de l'alumne:** ",
	      "Mòdul | Nota",
	      "----- | -----:"
	   };
	   public static void guardar(String array[]) {
		   try {
			   	FileWriter fitxer = new FileWriter(FIT_SORTIDA);
			   	fitxer.write(LINIES[0]+array[0]+"\n\n");
			   	System.out.print(LINIES[0]+array[0]+"\n\n");
			   	fitxer.write(LINIES[1]+"\n");
			   	System.out.print(LINIES[1]+"\n");
			   	fitxer.write(LINIES[2]+"\n");
			   	System.out.print(LINIES[2]+"\n");
			   	for(int i=0;i!=MODULS.length;i++) {
			   		String[] arrayn = array[i+1].split("&");
			   		float f=Float.parseFloat(arrayn[1]);
			   		fitxer.write(MODULS[i]+" | "+f+"\n");
			   		System.out.print(MODULS[i]+" | "+f+"\n");
			   	}
				fitxer.close();
			} catch (Exception e) {
			}
	   }
	   public static String llegir(File fitxer) {
		   String notes = "";
				try {
					Scanner t = new Scanner (fitxer);
					notes = t.nextLine();
					t.close();
				} catch (Exception e) {
				}
		   return notes;
	   }
	   public final static String[] MODULS = {
	      "MP01 - Sistemes informàtics",
	      "MP02 - Bases de dades",
	      "MP03 - Programació",
	      "MP04 - Llenguatge de marques i sistemes de gestió d'informació",
	      "MP14 - Introducció al disseny i programació per a dispositius mòbils"
	   };

	   public static void main(String[] args) {
		   File fitxer = new File(FIT_ENTRADA);
		   String notes=llegir(fitxer);
		   String[] array = notes.split("#");
		   guardar(array);
		   
		   
	   }
	}



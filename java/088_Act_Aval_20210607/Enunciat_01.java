package RieraPau;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Enunciat_01 {
   public final static float MAX_EXCELLENT = 10.0f;
   public final static float MIN_EXCELLENT = 9.0f;
   public final static float MAX_NOTABLE = 8.99f;
   public final static float MIN_NOTABLE = 6.5f;
   public final static float MAX_APROBAT = 6.4f;
   public final static float MIN_APROBAT = 5.0f;
   public final static float MAX_SUSPES = 4.9f;
   public final static float MIN_SUSPES = 0.0f;
   public final static char ASTERISC = '*';
   public final static String[] NOTES = {"Excel·lent ","Notable    ","Aprovat    ","Suspès     "};
   public final static String FIT_ENTRADA = "fitxers/NotesClasse.txt";
   public final static String FIT_SORTIDA = "fitxers/NotesClasseHisto.txt";
   public final static int TOTAL_NOTES = 4;
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
   public static void guardar(int res[]) {
	   try {
		   	FileWriter fitxer = new FileWriter(FIT_SORTIDA);
		   	for(int i=0;i!=NOTES.length;i++) {
		   		fitxer.write(NOTES[i]+" : ");
		   		for (int j=0;j!=res[i];j++) {
		   			fitxer.write(ASTERISC);
		   		}
		   		fitxer.write("\n");
		   	}
			fitxer.close();
		} catch (Exception e) {
		}
   }
   public static void main(String[] args) {
   File fitxer = new File(FIT_ENTRADA);
   String notes=llegir(fitxer);
   String[] array = notes.split("#");
   int[] res = new int[4];
   for (int i=0;i!=array.length;i++) {
		   float com = Float.parseFloat(array[i]);
		   if (com>=MIN_EXCELLENT) {
			   res[0]++;
		   }else if(com <= MAX_NOTABLE && com >= MIN_NOTABLE){
			   res[1]++;
		   }else if(com <= MAX_APROBAT && com >= MIN_APROBAT) {
			   res[2]++;
		   }else if(com <= MAX_SUSPES) {
			   res[3]++;
		   }
		}
   	guardar(res);
	}
}
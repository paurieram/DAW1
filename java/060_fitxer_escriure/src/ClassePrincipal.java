import java.io.FileWriter;

public class ClassePrincipal {
	public static void OA(int[] a) {
		for(int i=0;i!=10;i++) {
				a[i]= (int) (1000*Math.random()+1);
		}	
	}
	public static void EF(int[] a, FileWriter fitxer,String NF) {
		
			try {
				fitxer = new FileWriter(NF);
				for(int i=0;i!=a.length;i++) {
					fitxer.write(a[i]+"\n");	
				}
				fitxer.close();
			} catch (Exception e) {
				System.out.print("ERROR! "+e.getMessage());
			}
		
	}
	public static void main(String[] args) {
		int a[]=new int[10];
		OA(a);
		FileWriter fitxer=null;
		String NF="lib/fitxer.txt";//"Y:\\zdaw\\eclipse\\proj\\061_fitxer_llegir\\lib\\fitxer.txt"
		EF(a, fitxer, NF);
	}
}
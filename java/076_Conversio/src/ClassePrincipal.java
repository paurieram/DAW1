import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner TStr = new Scanner(System.in);
		System.out.println("Tipus de Conversio\n(1)Longitud\n(2)Massa\n(3)Temperatura\n(4)Temps");
		int N = Integer.parseInt(TStr.nextLine());
		switch(N) {
		case 1:
			Longitud L = new Longitud();
			System.out.println("Mesura a introduir\n(1)KM\n(2)M\n(3)CM\n(4)MM\n(5)llegues\n(6)milles\n(7)iardes\n(8)peus\n(9)polzades");
			int L1 = Integer.parseInt(TStr.nextLine());
			System.out.println("Mesura a convertir\n(1)KM\n(2)M\n(3)CM\n(4)MM\n(5)llegues\n(6)milles\n(7)iardes\n(8)peus\n(9)polzades");
			int L2 = Integer.parseInt(TStr.nextLine());
			System.out.println("Introdueix la quantitat a convertir");
			double L3 = Integer.parseInt(TStr.nextLine());
			switch(L1) {
			case 1:
				L.setKM(L3);
				switch(L2) {
				case 1:
					System.out.println(L3+" "+L.getKM());
				break;
				case 2:
					System.out.println(L3+" "+L.getM());
				break;
				case 3:
					System.out.println(L3+" "+L.getCM());
				break;
				case 4:
					System.out.println(L3+" "+L.getMM());
				break;
				case 5:
					System.out.println(L3+" "+L.getLlegues());
				break;
				case 6:
					System.out.println(L3+" "+L.getMilles());
				break;
				case 7:
					System.out.println(L3+" "+L.getIardes());
				break;
				case 8:
					System.out.println(L3+" "+L.getPeus());
				break;
				case 9:
					System.out.println(L3+" "+L.getPolsades());
				break;
				}
			break;
			case 2:
				L.setM(L3);
				switch(L2) {
				case 1:
					System.out.println(L3+" "+L.getKM());
				break;
				case 2:
					System.out.println(L3+" "+L.getM());
				break;
				case 3:
					System.out.println(L3+" "+L.getCM());
				break;
				case 4:
					System.out.println(L3+" "+L.getMM());
				break;
				case 5:
					System.out.println(L3+" "+L.getLlegues());
				break;
				case 6:
					System.out.println(L3+" "+L.getMilles());
				break;
				case 7:
					System.out.println(L3+" "+L.getIardes());
				break;
				case 8:
					System.out.println(L3+" "+L.getPeus());
				break;
				case 9:
					System.out.println(L3+" "+L.getPolsades());
				break;
				}
			break;
			case 3:
				L.setCM(L3);
				switch(L2) {
				case 1:
					System.out.println(L3+" "+L.getKM());
				break;
				case 2:
					System.out.println(L3+" "+L.getM());
				break;
				case 3:
					System.out.println(L3+" "+L.getCM());
				break;
				case 4:
					System.out.println(L3+" "+L.getMM());
				break;
				case 5:
					System.out.println(L3+" "+L.getLlegues());
				break;
				case 6:
					System.out.println(L3+" "+L.getMilles());
				break;
				case 7:
					System.out.println(L3+" "+L.getIardes());
				break;
				case 8:
					System.out.println(L3+" "+L.getPeus());
				break;
				case 9:
					System.out.println(L3+" "+L.getPolsades());
				break;
				}
			break;
			case 4:
				L.setMM(L3);
				switch(L2) {
				case 1:
					System.out.println(L3+" "+L.getKM());
				break;
				case 2:
					System.out.println(L3+" "+L.getM());
				break;
				case 3:
					System.out.println(L3+" "+L.getCM());
				break;
				case 4:
					System.out.println(L3+" "+L.getMM());
				break;
				case 5:
					System.out.println(L3+" "+L.getLlegues());
				break;
				case 6:
					System.out.println(L3+" "+L.getMilles());
				break;
				case 7:
					System.out.println(L3+" "+L.getIardes());
				break;
				case 8:
					System.out.println(L3+" "+L.getPeus());
				break;
				case 9:
					System.out.println(L3+" "+L.getPolsades());
				break;
				}
			break;
			case 5:
				L.setLlegues(L3);
				switch(L2) {
				case 1:
					System.out.println(L3+" "+L.getKM());
				break;
				case 2:
					System.out.println(L3+" "+L.getM());
				break;
				case 3:
					System.out.println(L3+" "+L.getCM());
				break;
				case 4:
					System.out.println(L3+" "+L.getMM());
				break;
				case 5:
					System.out.println(L3+" "+L.getLlegues());
				break;
				case 6:
					System.out.println(L3+" "+L.getMilles());
				break;
				case 7:
					System.out.println(L3+" "+L.getIardes());
				break;
				case 8:
					System.out.println(L3+" "+L.getPeus());
				break;
				case 9:
					System.out.println(L3+" "+L.getPolsades());
				break;
				}
			break;
			case 6:
				L.setMilles(L3);
				switch(L2) {
				case 1:
					System.out.println(L3+" "+L.getKM());
				break;
				case 2:
					System.out.println(L3+" "+L.getM());
				break;
				case 3:
					System.out.println(L3+" "+L.getCM());
				break;
				case 4:
					System.out.println(L3+" "+L.getMM());
				break;
				case 5:
					System.out.println(L3+" "+L.getLlegues());
				break;
				case 6:
					System.out.println(L3+" "+L.getMilles());
				break;
				case 7:
					System.out.println(L3+" "+L.getIardes());
				break;
				case 8:
					System.out.println(L3+" "+L.getPeus());
				break;
				case 9:
					System.out.println(L3+" "+L.getPolsades());
				break;
				}
			break;
			case 7:
				L.setIardes(L3);
				switch(L2) {
				case 1:
					System.out.println(L3+" "+L.getKM());
				break;
				case 2:
					System.out.println(L3+" "+L.getM());
				break;
				case 3:
					System.out.println(L3+" "+L.getCM());
				break;
				case 4:
					System.out.println(L3+" "+L.getMM());
				break;
				case 5:
					System.out.println(L3+" "+L.getLlegues());
				break;
				case 6:
					System.out.println(L3+" "+L.getMilles());
				break;
				case 7:
					System.out.println(L3+" "+L.getIardes());
				break;
				case 8:
					System.out.println(L3+" "+L.getPeus());
				break;
				case 9:
					System.out.println(L3+" "+L.getPolsades());
				break;
				}
			break;
			case 8:
				L.setPeus(L3);
				switch(L2) {
				case 1:
					System.out.println(L3+" "+L.getKM());
				break;
				case 2:
					System.out.println(L3+" "+L.getM());
				break;
				case 3:
					System.out.println(L3+" "+L.getCM());
				break;
				case 4:
					System.out.println(L3+" "+L.getMM());
				break;
				case 5:
					System.out.println(L3+" "+L.getLlegues());
				break;
				case 6:
					System.out.println(L3+" "+L.getMilles());
				break;
				case 7:
					System.out.println(L3+" "+L.getIardes());
				break;
				case 8:
					System.out.println(L3+" "+L.getPeus());
				break;
				case 9:
					System.out.println(L3+" "+L.getPolsades());
				break;
				}
			break;
			case 9:
				L.setPolsades(L3);
				switch(L2) {
				case 1:
					System.out.println(L3+" "+L.getKM());
				break;
				case 2:
					System.out.println(L3+" "+L.getM());
				break;
				case 3:
					System.out.println(L3+" "+L.getCM());
				break;
				case 4:
					System.out.println(L3+" "+L.getMM());
				break;
				case 5:
					System.out.println(L3+" "+L.getLlegues());
				break;
				case 6:
					System.out.println(L3+" "+L.getMilles());
				break;
				case 7:
					System.out.println(L3+" "+L.getIardes());
				break;
				case 8:
					System.out.println(L3+" "+L.getPeus());
				break;
				case 9:
					System.out.println(L3+" "+L.getPolsades());
				break;
				}
			break;
			}
		break;
		case 2:
			Massa M = new Massa();
			System.out.println("Mesura a introduir\n(1)KG\n(2)GR\n(3)MG\n(4)TON\n(5)LB\n(6)OZ");
			int M1 = Integer.parseInt(TStr.nextLine());
			System.out.println("Mesura a convertir\n(1)KG\n(2)GR\n(3)MG\n(4)TON\n(5)LB\n(6)OZ");
			int M2 = Integer.parseInt(TStr.nextLine());
			System.out.println("Introdueix la quantitat a convertir");
			double M3 = Integer.parseInt(TStr.nextLine());
			switch(M1) {
			case 1:
				M.setKG(M3);
				switch(M2) {
				case 1:
					System.out.println(M3+" "+M.getKG());
				break;
				case 2:
					System.out.println(M3+" "+M.getGR());
				break;
				case 3:
					System.out.println(M3+" "+M.getMG());
				break;
				case 4:
					System.out.println(M3+" "+M.getTON());
				break;
				case 5:
					System.out.println(M3+" "+M.getLB());
				break;
				case 6:
					System.out.println(M3+" "+M.getOZ());
				break;
				}
			break;
			case 2:
				M.setGR(M3);
				switch(M2) {
				case 1:
					System.out.println(M3+" "+M.getKG());
				break;
				case 2:
					System.out.println(M3+" "+M.getGR());
				break;
				case 3:
					System.out.println(M3+" "+M.getMG());
				break;
				case 4:
					System.out.println(M3+" "+M.getTON());
				break;
				case 5:
					System.out.println(M3+" "+M.getLB());
				break;
				case 6:
					System.out.println(M3+" "+M.getOZ());
				break;
				}
			break;
			case 3:
				M.setMG(M3);
				switch(M2) {
				case 1:
					System.out.println(M3+" "+M.getKG());
				break;
				case 2:
					System.out.println(M3+" "+M.getGR());
				break;
				case 3:
					System.out.println(M3+" "+M.getMG());
				break;
				case 4:
					System.out.println(M3+" "+M.getTON());
				break;
				case 5:
					System.out.println(M3+" "+M.getLB());
				break;
				case 6:
					System.out.println(M3+" "+M.getOZ());
				break;
				}
			break;
			case 4:
				M.setTON(M3);
				switch(M2) {
				case 1:
					System.out.println(M3+" "+M.getKG());
				break;
				case 2:
					System.out.println(M3+" "+M.getGR());
				break;
				case 3:
					System.out.println(M3+" "+M.getMG());
				break;
				case 4:
					System.out.println(M3+" "+M.getTON());
				break;
				case 5:
					System.out.println(M3+" "+M.getLB());
				break;
				case 6:
					System.out.println(M3+" "+M.getOZ());
				break;
				}
			break;
			case 5:
				M.setLB(M3);
				switch(M2) {
				case 1:
					System.out.println(M3+" "+M.getKG());
				break;
				case 2:
					System.out.println(M3+" "+M.getGR());
				break;
				case 3:
					System.out.println(M3+" "+M.getMG());
				break;
				case 4:
					System.out.println(M3+" "+M.getTON());
				break;
				case 5:
					System.out.println(M3+" "+M.getLB());
				break;
				case 6:
					System.out.println(M3+" "+M.getOZ());
				break;
				}
			break;
			case 6:
				M.setOZ(M3);
				switch(M2) {
				case 1:
					System.out.println(M3+" "+M.getKG());
				break;
				case 2:
					System.out.println(M3+" "+M.getGR());
				break;
				case 3:
					System.out.println(M3+" "+M.getMG());
				break;
				case 4:
					System.out.println(M3+" "+M.getTON());
				break;
				case 5:
					System.out.println(M3+" "+M.getLB());
				break;
				case 6:
					System.out.println(M3+" "+M.getOZ());
				break;
				}
			break;
			}
		break;
		case 3:
			Temperatura T = new Temperatura();
			System.out.println("Mesura a introduir\n(1)K\n(2)C\n(3)F");
			int T1 = Integer.parseInt(TStr.nextLine());
			System.out.println("Mesura a convertir\n(1)K\n(2)C\n(3)F");
			int T2 = Integer.parseInt(TStr.nextLine());
			System.out.println("Introdueix la quantitat a convertir");
			double T3 = Integer.parseInt(TStr.nextLine());
			switch(T1) {
			case 1:
				T.setK(T3);
				switch(T2) {
				case 1:
					System.out.println(T3+" "+T.getK());
				break;
				case 2:
					System.out.println(T3+" "+T.getC());
				break;
				case 3:
					System.out.println(T3+" "+T.getF());
				break;
				}
			break;
			case 2:
				T.setC(T3);
				switch(T2) {
				case 1:
					System.out.println(T3+" "+T.getK());
				break;
				case 2:
					System.out.println(T3+" "+T.getC());
				break;
				case 3:
					System.out.println(T3+" "+T.getF());
				break;
				}
			break;
			case 3:
				T.setF(T3);
				switch(T2) {
				case 1:
					System.out.println(T3+" "+T.getK());
				break;
				case 2:
					System.out.println(T3+" "+T.getC());
				break;
				case 3:
					System.out.println(T3+" "+T.getF());
				break;
				}
			break;
			}
		break;
		case 4:
			Temps E = new Temps();
			System.out.println("Mesura a introduir\n(1)H\n(2)M\n(3)S\n(4)MS");
			int E1 = Integer.parseInt(TStr.nextLine());
			System.out.println("Mesura a convertir\n(1)H\n(2)M\n(3)S\n(4)MS");
			int E2 = Integer.parseInt(TStr.nextLine());
			System.out.println("Introdueix la quantitat a convertir");
			double E3 = Integer.parseInt(TStr.nextLine());
			switch(E1) {
			case 1:
				E.setH(E3);
				switch(E2) {
				case 1:
					System.out.println(E3+" "+E.getH());
				break;
				case 2:
					System.out.println(E3+" "+E.getM());
				break;
				case 3:
					System.out.println(E3+" "+E.getS());
				break;
				case 4:
					System.out.println(E3+" "+E.getMS());
				break;
				}
			break;
			case 2:
				E.setM(E3);
				switch(E2) {
				case 1:
					System.out.println(E3+" "+E.getH());
				break;
				case 2:
					System.out.println(E3+" "+E.getM());
				break;
				case 3:
					System.out.println(E3+" "+E.getS());
				break;
				case 4:
					System.out.println(E3+" "+E.getMS());
				break;
				}
			break;
			case 3:
				E.setS(E3);
				switch(E2) {
				case 1:
					System.out.println(E3+" "+E.getH());
				break;
				case 2:
					System.out.println(E3+" "+E.getM());
				break;
				case 3:
					System.out.println(E3+" "+E.getS());
				break;
				case 4:
					System.out.println(E3+" "+E.getMS());
				break;
				}
			break;
			case 4:
				E.setMS(E3);
				switch(E2) {
				case 1:
					System.out.println(E3+" "+E.getH());
				break;
				case 2:
					System.out.println(E3+" "+E.getM());
				break;
				case 3:
					System.out.println(E3+" "+E.getS());
				break;
				case 4:
					System.out.println(E3+" "+E.getMS());
				break;
				}
			break;
			}
		break;
		}
	}
}
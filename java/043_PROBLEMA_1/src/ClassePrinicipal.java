import java.util.Arrays;
import java.util.Scanner;

public class ClassePrinicipal {

	public static void main(String[] args) {
	Scanner t = new Scanner (System.in);
	System.out.print("Introdueix les cartes: ");
	String C = t.nextLine();
	char P[] = new char[4];
	for(int i=1, c=0;i!=C.length();i++){
		if (C.charAt(i)=='T' || C.charAt(i)=='D' || C.charAt(i)=='C' || C.charAt(i)=='P'){
			P[c] = C.charAt(i);
			c++;
		}
	}
	if (P[0]==P[1] && P[1]==P[2] && P[2]==P[3]) {
		int I[] = new int[4];
	for (int i=0, c=0, e=0;i!=C.length();i++){
		if(C.charAt(i)==' ') {
			e++;
			if(e%2==0) {
				c++;
			}
		}else if (C.charAt(i)=='A') {
			I[c] = 14;
		}else if (C.charAt(i)=='J') {
			I[c] = 11;
		}else if (C.charAt(i)=='Q') {
			I[c] = 12;
		}else if (C.charAt(i)=='K') {
			I[c] = 13;
		}else if (C.charAt(i)!='T' && C.charAt(i)!='D' && C.charAt(i)!='C' && C.charAt(i)!='P') {
			I[c] = Integer.parseInt(String.valueOf(C.charAt(i)));
		}
	}
	Arrays.sort(I);
	boolean res = false;
	if (I[0]+1==I[1] && I[1]+1==I[2] && I[2]+1==I[3]) {
		if (I[3]==14) {
			System.out.print(I[0]-1+" "+P[0]);
			res = true;
		}else {
			System.out.print(I[3]+1+" "+P[0]);
			res = true;
		}	
	}
	if (res==false) {
		for (int b=0, c=0, c1=0;c!=I.length;c++, c1++){
			if (I[c]!=I[c1]) {
				b++;
			}else if (I[c]+1!=I[c1]){
				System.out.print("Res");
				res = true;
				break;
			}
			if (b==2) {
				res = true;
				System.out.print("Res");
				break;
			}
		}
	if (res==false) {
		if (I[0]+1==I[1]) {
			if (I[1]+1==I[2]) {
				if (I[2]==I[3]) {
					System.out.print(I[3]+1+" "+P[0]);
				}else {
					System.out.print(I[2]+1+" "+P[0]);
				}
			}else {
				System.out.print(I[1]+1+" "+P[0]);
			}
		}else {
			System.out.print(I[0]+1+" "+P[0]);
		}
	}
	}
	}
	t.close();	
	}
}
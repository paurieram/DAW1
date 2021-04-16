
public class ClassePrincipal {
	public static void RNG(int[] R) {
		R[0] = (int) (100*Math.random());
		R[1] = (int) (100*Math.random());
		R[2] = (int) (100*Math.random());
	}
	public static void main(String[] args) {
		int R[] = new int[3];
		int S[] = new int[5];
		int P[] = new int[5];
		int N=0;
		do {
			try {
				RNG(R);
				R[1]=R[1]/R[2];
				if(R[1]%2==0) {
					P[R[0]]=R[1];
				}else {
					S[R[0]]=R[1];
				}
			}catch(ArithmeticException e){
				System.out.println("ERROR! X/0");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ERROR! limits");
			}catch (Exception e){
				System.out.println("ERROR! general");
			}
		}while(N==10);
			

	}

}

package RieraPau;

public class Biblioteca {
	private Fitxa[] array;
	private short max;
	private short ele;
	public Biblioteca(short d) {
		array = new Fitxa[d];
		max=d;
	}
	public short capacitat() {
		return max;
	}
	public short nreElements() {
		return ele;
	}
	public short afegir(Fitxa f) {
		for(short i=0;i!=max;i++) {
			if (f.equals(array[i])) {
				System.out.println("No afegit perque ya existeix aquesta referencia");
				break;
			}else {
				for(short j=0;j!=max;j++) {
					if (array[j]==null) {
						if (f==null) {
							return -2;
						}else {
							array[j]=f;
							ele++;
							return -1;
						}
					}else if (j==max){
						return -3;
					}
				}
			}
		}
		return -4;
	}
	public Fitxa extreure(String r) {
		for(short i=0;i!=max;i++) {
			if (array[i].getReferencia().equals(r)) {
				return array[i];
			}
		}
	return null;
	}
	public short cercar(String r) {
		for(short i=0;i!=max;i++) {
			if (array[i].getReferencia().equals(r)) {
				return i;
			}
		}
	return -1;
	}
	public void visualitzar() {
		System.out.println("Contingut de la biblioteca");
		System.out.println("**************************");
		System.out.println("Capacitat.....: "+max);
		System.out.println("Nre. Exemplars: "+ele);
		for(short i=0;i!=max;i++) {
			if (array[i]!=null) {
				System.out.println("Exemplar "+i+": "+array[i].toString());
			}
		}
		
		
	}
}

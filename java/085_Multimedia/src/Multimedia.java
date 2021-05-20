
public class Multimedia {
	private String titol;
	private String format;
	private String autor;
	private String duracio;

public Multimedia(String t,String f,String a,String d){
	titol=t;
	format=f;
	autor=a;
	duracio=d;
}

public String getTitol() {
	return titol;
}

public String getFormat() {
	return format;
}

public String getAutor() {
	return autor;
}

public String getDuracio() {
	return duracio;
}
public String toString() {
	return "--Multimedia titol= " + titol + " format= " + format + " nautor= " + autor + " nduracio= " + duracio+"\n";
}
public boolean equals(Multimedia m) {
	if (m.getAutor().equals(autor)) {
		if (m.getTitol().equals(titol)) {
			return true;
		}
	}
	return false;
}
}
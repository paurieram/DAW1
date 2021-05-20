
public class Pelicula extends Multimedia{
	private String actor;
	private String director;
	
	public Pelicula(String t, String f, String a, String d,String ac,String di) {
		super(t, f, a, d);
		actor=ac;
		director=di;
	}
	public String toString() {
		return super.toString()+"-Pelicula actor= " + actor + "director= " + director+"\n";
	}
	public String getActor() {
		return actor;
	}
	public String getDirector() {
		return director;
	}
}


public class Vehicle {
	private String matricula;
	private String model;
	
	Vehicle(String ma,String mo){
		matricula=ma;
		model=mo;
	}
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String toString() {
		return "---Vehicle \nmatricula=" + matricula + "\n model=" + model + "";
	}
}
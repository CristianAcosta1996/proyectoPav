package logica;

public class Docente extends Perfil{
	private String instituto;

	public Docente(String nombre, String imagenUrl, String email, String password, String instituto) {
		super(nombre, imagenUrl, email, password);
		this.instituto = instituto;
	}

	public String getInstituto() {
		return instituto;
	}

	public void setInstituto(String instituto) {
		this.instituto = instituto;
	} 
	
	
}

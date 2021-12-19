package logica;

public abstract class Perfil {
	private String nombre;
	private String imagenUrl;
	private String email;
	private String password;

	public Perfil(String nombre, String imagenUrl, String email, String password) {
		super();
		this.nombre = nombre;
		this.imagenUrl = imagenUrl;
		this.email = email;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagenUrl() {
		return imagenUrl;
	}

	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

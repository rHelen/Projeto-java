package ProjetoJava;

public abstract class Menu {
	private String tipoMenu;

	public Menu(String tipoMenu) {
		super();
		this.tipoMenu = tipoMenu;
	}

	public String getTipoMenu() {
		return tipoMenu;
	}

	public void setTipoMenu(String tipoMenu) {
		this.tipoMenu = tipoMenu;
	}
	
	abstract public void aspectoComida(); 
	abstract public void frequenciaComida();
	abstract public void comerTudo();

}

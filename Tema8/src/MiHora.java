
public class MiHora {
	private int miHora;
	private static final int FACTOR_HORA = 3600;
	private static final int FACTOR_MINUTOS = 60;

	// CONSTRUCTORES
	public MiHora() {
		this(0,0,0);
	}

	public MiHora(int h) {
		this(h,0,0);
	}

	public MiHora(int h, int m) {
		this(h,m,0);
	}
	
	public MiHora(MiHora miHora) {
		this.setMiHora(miHora.getMiHora());
	}
	
	public MiHora(int h, int m, int s) {
		this.setHoras(h);
		this.setMinutos(m);
		this.setSegundos(s);
	}
	
	// METODOS DE INSTANCIA
	public void setHoras(int h) throws IllegalArgumentException {
		if(h>-1 && h<24) {
			int resto = this.miHora % FACTOR_HORA;
			this.miHora = h*FACTOR_HORA + resto;
		}
		else throw new IllegalArgumentException("hora debe ser de 0 a 23");
	}
	
	public int getHoras() {
		return this.miHora/FACTOR_HORA;
	}
	
	public void setMinutos(int m) {
		if(m>-1 && m<60) {
			int h = this.getHoras();
			int s = (this.miHora%FACTOR_HORA)%FACTOR_MINUTOS;
			this.miHora = h*FACTOR_HORA + m*FACTOR_MINUTOS + s;
		}
		else throw new IllegalArgumentException("minutos debe ser de 0 a 59");
	}
	
	public int getMinutos() {
		return (this.miHora%FACTOR_HORA)/FACTOR_MINUTOS;
	}

	public void setSegundos(int s) {
		if(s>-1 && s<60) {
			this.miHora = this.getHoras()*FACTOR_HORA+this.getMinutos()*FACTOR_MINUTOS+s;
		}
		else throw new IllegalArgumentException("segundos debe ser de 0 a 59");
	}
	
	public int getSegundos() {
		return (this.miHora%FACTOR_HORA)%FACTOR_MINUTOS;
	}
	
	public String toString() {
		return "hola";
	}
	
	// SETTERS & GETTERS
	public int getMiHora() {
		return miHora;
	}

	public void setMiHora(int miHora) {
		this.miHora = miHora;
	}
}

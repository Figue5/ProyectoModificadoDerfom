
// TODO: Auto-generated Javadoc
/**
 * The Class MiHora.
 */
public class MiHora {
	
	/** The mi hora. */
	private int miHora;
	
	/** The Constant FACTOR_HORA. */
	private static final int FACTOR_HORA = 3600;
	
	/** The Constant FACTOR_MINUTOS. */
	private static final int FACTOR_MINUTOS = 60;

	/**
	 * Instantiates a new mi hora.
	 */
	// CONSTRUCTORES
	public MiHora() {
		this(0,0,0);
	}

	/**
	 * Instantiates a new mi hora.
	 *
	 * @param h the h
	 */
	public MiHora(int h) {
		this(h,0,0);
	}

	/**
	 * Instantiates a new mi hora.
	 *
	 * @param h the h
	 * @param m the m
	 */
	public MiHora(int h, int m) {
		this(h,m,0);
	}
	
	/**
	 * Instantiates a new mi hora.
	 *
	 * @param miHora the mi hora
	 */
	public MiHora(MiHora miHora) {
		this.setMiHora(miHora.getMiHora());
	}
	
	/**
	 * Instantiates a new mi hora.
	 *
	 * @param h the h
	 * @param m the m
	 * @param s the s
	 */
	public MiHora(int h, int m, int s) {
		this.setHoras(h);
		this.setMinutos(m);
		this.setSegundos(s);
	}
	
	/**
	 * Sets the horas.
	 *
	 * @param h the new horas
	 * @throws IllegalArgumentException the illegal argument exception
	 */
	// METODOS DE INSTANCIA
	public void setHoras(int h) throws IllegalArgumentException {
		if(h>-1 && h<24) {
			int resto = this.miHora % FACTOR_HORA;
			this.miHora = h*FACTOR_HORA + resto;
		}
		else throw new IllegalArgumentException("hora debe ser de 0 a 23");
	}
	
	/**
	 * Gets the horas.
	 *
	 * @return the horas
	 */
	public int getHoras() {
		return this.miHora/FACTOR_HORA;
	}
	
	/**
	 * Sets the minutos.
	 *
	 * @param m the new minutos
	 */
	public void setMinutos(int m) {
		if(m>-1 && m<60) {
			int h = this.getHoras();
			int s = (this.miHora%FACTOR_HORA)%FACTOR_MINUTOS;
			this.miHora = h*FACTOR_HORA + m*FACTOR_MINUTOS + s;
		}
		else throw new IllegalArgumentException("minutos debe ser de 0 a 59");
	}
	
	/**
	 * Gets the minutos.
	 *
	 * @return the minutos
	 */
	public int getMinutos() {
		return (this.miHora%FACTOR_HORA)/FACTOR_MINUTOS;
	}

	/**
	 * Sets the segundos.
	 *
	 * @param s the new segundos
	 */
	public void setSegundos(int s) {
		if(s>-1 && s<60) {
			this.miHora = this.getHoras()*FACTOR_HORA+this.getMinutos()*FACTOR_MINUTOS+s;
		}
		else throw new IllegalArgumentException("segundos debe ser de 0 a 59");
	}
	
	/**
	 * Gets the segundos.
	 *
	 * @return the segundos
	 */
	public int getSegundos() {
		return (this.miHora%FACTOR_HORA)%FACTOR_MINUTOS;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "hola";
	}
	
	/**
	 * Gets the mi hora.
	 *
	 * @return the mi hora
	 */
	// SETTERS & GETTERS
	public int getMiHora() {
		return miHora;
	}

	/**
	 * Sets the mi hora.
	 *
	 * @param miHora the new mi hora
	 */
	public void setMiHora(int miHora) {
		this.miHora = miHora;
	}
}

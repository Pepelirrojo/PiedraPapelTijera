package piedraPapelTijera;

public class PiedraPapelTijera {
	private int miTirada;
	private String miMensaje;
	private String mensajeRival[] = { "Piedra", "Papel", "Tijera" };
	private int aux;
	private boolean resultado;
	private int enemigo;
	private int jugador;

	public boolean isResultado() {
		return resultado;
	}

	public void setMiTirada(int tirada) {
		miTirada = tirada;
	}

	public void jugar() {
		resultado = false;
		int tiradaRival = (int) Math.floor(Math.random() * 3);
		if (miTirada == 0 && tiradaRival == 2 || miTirada == 1 && tiradaRival == 0
				|| miTirada == 2 && tiradaRival == 1) {
			resultado = true;
			jugador += 1;
		} else if ((miTirada == tiradaRival)) {
			miMensaje = "Empatastes pelotudo";
		} else {
			enemigo += 1;
		}
		if (miTirada != tiradaRival) {
			miMensaje = resultado ? "Ganastes putito" : "Perdiste Weon";
		}
		aux = tiradaRival;

	}

	public String getEnemigo() {
		String cadena = Integer.toString(enemigo);
		return cadena;
	}

	public String getJugador() {
		String cadena = Integer.toString(jugador);
		return cadena;
	}

	public String getMensajeRival() {
		return mensajeRival[aux];
	}

	public int getMiTirada() {
		return miTirada;
	}

	public String getMiMensaje() {
		return miMensaje;
	}

}

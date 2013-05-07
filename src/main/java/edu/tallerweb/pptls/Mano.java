package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Forma forma;
	private static final Integer dimension = 5;
	private Resultado[][] matriz = new Resultado[dimension][dimension];
	private static final Integer cero = 0;
	private static final Integer uno = 1;
	private static final Integer dos = 2;
	private static final Integer tres = 3;
	private static final Integer cuatro = 4;
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		//throw new RuntimeException("No implementado aún");
		this.forma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		//throw new RuntimeException("No implementado aún");
	    matriz[cero][cero] = Resultado.EMPATA;
	    matriz[uno][uno] = Resultado.EMPATA;
	    matriz[dos][dos] = Resultado.EMPATA;
	    matriz[tres][tres] = Resultado.EMPATA;
	    matriz[cuatro][cuatro] = Resultado.EMPATA;
	    matriz[cero][tres] = Resultado.GANA;
	    matriz[cero][cuatro] = Resultado.GANA;
	    matriz[uno][cero] = Resultado.GANA;
	    matriz[uno][cuatro] = Resultado.GANA;
	    matriz[dos][cero] = Resultado.GANA;
	    matriz[dos][uno] = Resultado.GANA;
	    matriz[tres][uno] = Resultado.GANA;
	    matriz[tres][dos] = Resultado.GANA;
	    matriz[cuatro][dos] = Resultado.GANA;
	    matriz[cuatro][tres] = Resultado.GANA;
	    matriz[cero][uno] = Resultado.PIERDE;
	    matriz[cero][dos] = Resultado.PIERDE;
	    matriz[uno][dos] = Resultado.PIERDE;
	    matriz[uno][tres] = Resultado.PIERDE;
	    matriz[dos][tres] = Resultado.PIERDE;
	    matriz[dos][cuatro] = Resultado.PIERDE;
	    matriz[tres][cero] = Resultado.PIERDE;
	    matriz[tres][cuatro] = Resultado.PIERDE;
	    matriz[cuatro][cero] = Resultado.PIERDE;
	    matriz[cuatro][uno] = Resultado.PIERDE;
	    return matriz[this.forma.getValor()][otra.forma.getValor()];
	}

}

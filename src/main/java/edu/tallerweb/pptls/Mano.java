package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Forma forma;
	private Integer dimension = 5;
	private Resultado matriz[][] = new Resultado[dimension][dimension];
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
	    matriz[0][0] = Resultado.EMPATA;
	    matriz[1][1] = Resultado.EMPATA;
	    matriz[2][2] = Resultado.EMPATA;
	    matriz[3][3] = Resultado.EMPATA;
	    matriz[4][4] = Resultado.EMPATA;
	    matriz[0][3] = Resultado.GANA;
	    matriz[0][4] = Resultado.GANA;
	    matriz[1][0] = Resultado.GANA;
	    matriz[1][4] = Resultado.GANA;
	    matriz[2][0] = Resultado.GANA;
	    matriz[2][1] = Resultado.GANA;
	    matriz[3][1] = Resultado.GANA;
	    matriz[3][2] = Resultado.GANA;
	    matriz[4][2] = Resultado.GANA;
	    matriz[4][3] = Resultado.GANA;
	    matriz[0][1] = Resultado.PIERDE;
	    matriz[0][2] = Resultado.PIERDE;
	    matriz[1][2] = Resultado.PIERDE;
	    matriz[1][3] = Resultado.PIERDE;
	    matriz[2][3] = Resultado.PIERDE;
	    matriz[2][4] = Resultado.PIERDE;
	    matriz[3][0] = Resultado.PIERDE;
	    matriz[3][4] = Resultado.PIERDE;
	    matriz[4][0] = Resultado.PIERDE;
	    matriz[4][1] = Resultado.PIERDE;
	    return matriz[this.forma.getValor()][otra.forma.getValor()];
	}

}

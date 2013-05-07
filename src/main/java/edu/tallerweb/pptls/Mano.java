package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	/**
	 * Creamos una matriz de 5x5, del tipo Resultado la cual en cada casillero va a contener el resultado
	 * De la combinaci�n jugada, la diagonal va a contener los empates y luego las dem�s combinaciones
	 * Estar�n definidas por regla de negocio.
	 */
	private Forma forma;
	private static final Integer DIMENSION = 5;
	private Resultado[][] matrizDePosiblesCombinaciones = new Resultado[DIMENSION][DIMENSION];
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
	 * Inicializamos la matriz, primero con los empates, luego con las jugadas ganadores y luego
	 * las perdedoras, finalmente retornamos el valor que contiene el casillero jugado.
	 */
	public Resultado jugarCon(final Mano otra) {
		//throw new RuntimeException("No implementado aún");
		matrizDePosiblesCombinaciones[Forma.PIEDRA.getValor()][Forma.PIEDRA.getValor()] = Resultado.EMPATA;
		matrizDePosiblesCombinaciones[Forma.SPOCK.getValor()][Forma.SPOCK.getValor()] = Resultado.EMPATA;
		matrizDePosiblesCombinaciones[Forma.PAPEL.getValor()][Forma.PAPEL.getValor()] = Resultado.EMPATA;
		matrizDePosiblesCombinaciones[Forma.LAGARTO.getValor()][Forma.LAGARTO.getValor()] = Resultado.EMPATA;
		matrizDePosiblesCombinaciones[Forma.TIJERA.getValor()][Forma.TIJERA.getValor()] = Resultado.EMPATA;
		matrizDePosiblesCombinaciones[Forma.PIEDRA.getValor()][Forma.LAGARTO.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.PIEDRA.getValor()][Forma.TIJERA.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.SPOCK.getValor()][Forma.PIEDRA.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.SPOCK.getValor()][Forma.TIJERA.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.PAPEL.getValor()][Forma.PIEDRA.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.PAPEL.getValor()][Forma.SPOCK.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.LAGARTO.getValor()][Forma.SPOCK.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.LAGARTO.getValor()][Forma.PAPEL.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.TIJERA.getValor()][Forma.PAPEL.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.TIJERA.getValor()][Forma.LAGARTO.getValor()] = Resultado.GANA;
		matrizDePosiblesCombinaciones[Forma.PIEDRA.getValor()][Forma.SPOCK.getValor()] = Resultado.PIERDE;
		matrizDePosiblesCombinaciones[Forma.PIEDRA.getValor()][Forma.PAPEL.getValor()] = Resultado.PIERDE;
		matrizDePosiblesCombinaciones[Forma.SPOCK.getValor()][Forma.PAPEL.getValor()] = Resultado.PIERDE;
		matrizDePosiblesCombinaciones[Forma.SPOCK.getValor()][Forma.LAGARTO.getValor()] = Resultado.PIERDE;
		matrizDePosiblesCombinaciones[Forma.PAPEL.getValor()][Forma.LAGARTO.getValor()] = Resultado.PIERDE;
		matrizDePosiblesCombinaciones[Forma.PAPEL.getValor()][Forma.TIJERA.getValor()] = Resultado.PIERDE;
		matrizDePosiblesCombinaciones[Forma.LAGARTO.getValor()][Forma.PIEDRA.getValor()] = Resultado.PIERDE;
		matrizDePosiblesCombinaciones[Forma.LAGARTO.getValor()][Forma.TIJERA.getValor()] = Resultado.PIERDE;
		matrizDePosiblesCombinaciones[Forma.TIJERA.getValor()][Forma.PIEDRA.getValor()] = Resultado.PIERDE;
		matrizDePosiblesCombinaciones[Forma.TIJERA.getValor()][Forma.SPOCK.getValor()] = Resultado.PIERDE;
	    return matrizDePosiblesCombinaciones[this.forma.getValor()][otra.forma.getValor()];
	}

}

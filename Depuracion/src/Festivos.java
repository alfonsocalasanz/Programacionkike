
public class Festivos {

	// Array de 365 posiciones donde se indicar� si un d�a del a�o es festivo o no
	private boolean[] festivos;
	// Array de 365 posiciones donde se incluir� el motivo por el que un d�a es
	// festivo.
	// En caso de no ser festivo la posici�n se mantendr� a ""
	private String[] motivos;

	public Festivos() {
		
		festivos = new boolean[365];
		motivos = new String[365];
		
		for (int i = 0; i < festivos.length; i++) {
			festivos[i] = false;
			motivos[i] = "";
		}
	}

	/**
	 * M�todo que establece que un d�ia es festivo y almacena el motivo por el que lo es
	 * @param dia
	 * @param motivo
	 * @throws FestivosException 
	 */
	public void incluirDiaFestivo(int dia, String motivo) throws FestivosException{
		
		comprobarDia(dia);
		
		festivos[dia] = true;
		motivos[dia] = motivo;
	}

	/**
	 * M�todo que devuelve si un d�a es festivo o no
	 * @param dia
	 * @return
	 * @throws FestivosException 
	 */
	public boolean consultarFestividad(int dia) throws FestivosException{
		
		comprobarDia(dia);
		return festivos[dia];
	}

	/**
	 * M�todo que devuelve:
	 * 	 	el motivo por el que un d�a es festivo en caso de que lo sea.
	 * 		El texto "No es festivo" en caso contrario.
	 * @param dia
	 * @return
	 * @throws FestivosException 
	 */
	public String consultarMotivoFestividad(int dia) throws FestivosException{
		
		comprobarDia(dia);
		
		if(festivos[dia]) {
			return motivos[dia];
		} else {
			return "No es festivo";
		}
	}

	/**
	 * M�todo que devuelve el n�mero de d�as del a�o que son festivos
	 * @return
	 */
	public int contarDiasFestivos() {
		
		int dias = 0;
		for (boolean festivo : festivos) {
			if (festivo == true) {
				dias++;
			}
		}
		
		return dias;
	}

	/**
	 * M�todo que devuelve el n�mero de mes con mas festivos
	 * @return
	 */
	public int consultarMesConMasFestivos() {
		
		int mesMasFestivo = 0;
		int meses[] = new int[12];
		int i = 1;
		
		meses[0] = diasFestivos(0, 30);
		meses[1] = diasFestivos(31, 58);
		meses[2] = diasFestivos(59, 89);
		meses[3] = diasFestivos(90, 119);
		meses[4] = diasFestivos(120, 150);
		meses[5] = diasFestivos(151, 180);
		meses[6] = diasFestivos(181, 211);
		meses[7] = diasFestivos(212, 242);
		meses[8] = diasFestivos(243, 272);
		meses[9] = diasFestivos(273, 303);
		meses[10] = diasFestivos(304, 333);
		meses[11] = diasFestivos(334, 364);

		
		while (i < 12) {
			if(meses[i] > meses[mesMasFestivo]) {
				mesMasFestivo = i;
			}
		}
		
		return mesMasFestivo+1;
	}

	/**
	 * M�todo que devuelve el primer festivo registrado
	 * @return
	 */
	public int consultarPrimerFestivo() {

		boolean festivoNoEncontrado = true;
		int primerFestivo = 0;

		for (int i = 0; i < festivos.length && festivoNoEncontrado; i++) {
			if (festivos[i] == true) {
				festivoNoEncontrado = false;
				primerFestivo = i;
			}
		}

		return primerFestivo;
	}

	/**
	 * M�todo privado que devuelve el n�mero total de festivo en un rango que se le pasa
	 * @param inicio  Indica la posic�n del array de festivos a partir de la cual hay que buscar los festivos
	 * @param fin 	  Indica la posici�n del array de festivos hasta la que hay que buscar los festivos
	 * @return
	 */
	private int diasFestivos(int inicio, int fin) {

		int total = 0;
		for (int i = inicio; i <= fin; i++) {
			if (festivos[i]) {
				total++;
			}
		}

		return total;
	}
	
	/**
	 * M�todo que lanza una excepci�n en caso de que el par�metro pasado sea mayor que 364
	 * @param dia
	 * @throws FestivosException
	 */
	private void comprobarDia(int dia) throws FestivosException {
		if(dia>364) {
			FestivosException exception = new FestivosException("El a�o no tiene tantos d�as");
			throw exception;
		}
	}

	void testConsultarPrimerFestivo() {
		// TODO Auto-generated method stub
		
	}
}

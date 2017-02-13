import static java.lang.System.out;

public class Desencriptador {

	public static void main(String[] args) {
		String mensaje = "";
		String mensajeCodificado = "ME LA PONE TIESAPACO ";
		String temporal;
		int saltos = 4;
		
		temporal = mensajeCodificado;
		for (int i = 0; i <= saltos; i++){
			mensaje = temporal.substring(temporal.length()-1, temporal.length()) + temporal;
			temporal = mensaje.substring(0, mensaje.length()-1);
		}
		mensaje = mensaje.substring(0, mensaje.length()-1);
		out.println(mensaje);		
	}

}

/* Matias Ruiz
 * 1º DAM
 */

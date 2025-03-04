
public class Principal {

	public static void main(String[] args) {
		System.out.println("Estamos haciendo una prueba, aprendiendo Git");

		ComoQuieras.pintarMensaje("Otro mensaje");
		
		Rama1 miRama = new Rama1();
		miRama.EscribirMensaje("Practicando con la primera rama");
		

		ComoQuierasSecuela cqs = new ComoQuierasSecuela();
		cqs.escribirMensaje("Mensaje de Como quieras Secuela");

		Rama2 miRama2 = new Rama2();
		miRama2.escribirMensaje("Practicando el Merge con conflictos");
		
		//Comentario para commit.
		//Comentario para pull.

		//Comentario para probar Fetch

		//Alguien lleva una semana trabajando.

		//Comentario desde la rama4
	}

}

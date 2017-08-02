import modelo.Entrenador;
import modelo.Futbolista;
import modelo.Masajista;

public class Equipo {

	public static void main(String[] args) {
		
		Masajista masajista  = new Masajista();
		masajista.setNombre("Grecia");
		masajista.setApellido("Castro");
		
		
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre("Jesus");
		entrenador.setApellido("Reyes");
		
		Futbolista futbolista = new Futbolista();
		futbolista.setNombre("Diego");
		futbolista.setApellido("Ortiz");
		futbolista.setNumero(33);
		
		System.out.println("Grandes de Salta\n");
		System.out.println("Masajista: " + masajista.getNombre() + " " + masajista.getApellido());
		System.out.println("Entrenador: " + entrenador.getNombre()+ " " + entrenador.getApellido());
		System.out.println("Jugador: " + futbolista.getNombre() + " " + futbolista.getApellido());
		
		System.out.println("\n");
		System.out.print(entrenador.getNombre()+ " " + entrenador.getApellido() + " ");
		entrenador.dialogar();
		System.out.print(futbolista.getNombre() + " " + futbolista.getApellido() + " " + futbolista.getNumero() + " ");
		futbolista.dialogar();
		System.out.print(masajista.getNombre() + " " + masajista.getApellido() + " ");
		masajista.dialogar();
		
	}
	
	
	
	
	
	
}

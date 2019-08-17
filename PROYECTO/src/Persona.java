
public class Persona extends Thread implements Acciones{
	
	String nombre;
	String apellido;
	double kilometros = 0;
	Mascota mascota;
	public Persona(String nombre, String apellido, double kilimetros) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.kilometros = kilimetros;
	}

	@Override
	public void caminar() {
		kilometros ++;
	}

	@Override
	public void corre() {
		kilometros = kilometros +2;
	}

	@Override
	public void parar() {
		System.out.println("Te cansastes "+nombre+"\n");
	}
	
	public void Imprimir() {
		
		System.out.println(nombre+" "+apellido+" Empieza a Correr");
		
		while(kilometros <= 10) {
			System.out.println("Corre "+nombre);
			System.out.println(kilometros+" Kilometros");
			corre();
			System.out.println(" ");
		}
		
		while(kilometros <= 50) {
			System.out.println("Camina "+nombre);
			System.out.println(kilometros+" Kilometros");
			caminar();
			System.out.println(" ");
		}
		
		if(kilometros == 51) {
			parar();
		}
	}
	public void run() {
		Imprimir();
	}
}







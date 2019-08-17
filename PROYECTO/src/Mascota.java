
public class Mascota extends Thread implements Acciones {

	String nombre;
	double kilometros = 0;

	public Mascota(String nombre, double kilimetros) {
		this.nombre = nombre;
		this.kilometros = kilimetros;
	}

	@Override
	public void caminar() {
		kilometros++;
	}

	@Override
	public void corre() {
		kilometros = kilometros + 2;
	}

	@Override
	public void parar() {
		System.out.println("Te cansastes "+nombre+"\n");
	}

	public void Imprimir() {
		System.out.println(nombre+"Empieza a correr");

		while (kilometros <= 10) {
			System.out.println("Corre "+nombre);
			System.out.println(kilometros + " Kilometros");
			corre();
			System.out.println(" ");
		}

		while (kilometros <= 40) {
			System.out.println("Camina "+nombre);
			System.out.println(kilometros + " Kilometros");
			caminar();
			System.out.println(" ");
		}

		if (kilometros == 41) {
			parar();
		}
	}
	
	public void run() {
		Imprimir();
	}
}

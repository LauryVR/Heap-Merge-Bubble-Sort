import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		System.out.println("Hola");
		System.out.println("Con que cantidad de datos deseas que se implementen las estructuras de datos?");
		System.out.print("Opcion: ");
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		int [] array = new int [n];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * n);
		}
		System.out.print("Arreglo: ");
		if(array.length > 15) {
			for(int i = 0; i < 15; i++) {
				System.out.print(array[i]+", ");
			}
		} else {
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i]+", ");
			}
		}
		int [] array1 = array;
		int [] array2 = array1;
		int [] array3 = array2;
		System.out.println();
		System.out.println("Bubble Sort...");
		BubbleSort nuevo1 = new BubbleSort();
		double tiempoInicio1 = System.currentTimeMillis();
		nuevo1.doBubble(array1);
		double tiempoFinal1 = System.currentTimeMillis() - tiempoInicio1;
		System.out.println("Tiempo: "+ tiempoFinal1 +" milisegundos");
		System.out.println("------------------------------------------------");
		System.out.println("Merge Sort...");
		MergeSort nuevo2 = new MergeSort();
		double tiempoInicio2 = System.currentTimeMillis() ;
		nuevo2.sort(array2);
		double tiempoFinal2 = System.currentTimeMillis() - tiempoInicio2;
		System.out.println("Tiempo: "+ tiempoFinal2 +" milisegundos");
		System.out.println("------------------------------------------------");
		System.out.println("Heap Sort...");
		HeapSort nuevo3 = new HeapSort();
		double tiempoInicio3 = System.currentTimeMillis();
		nuevo3.sort(array3);
		double tiempoFinal3 = System.currentTimeMillis() - tiempoInicio3 ;
		System.out.println("Tiempo: "+ tiempoFinal3 +" milisegundos");
	}
}

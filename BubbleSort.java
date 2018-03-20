
public class BubbleSort {
	private int[] array;

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	public int [] doBubble(int [] array) {
		int temp = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j= 1; j < array.length; j++) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
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
		return array;
	}
}

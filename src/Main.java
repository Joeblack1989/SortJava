
public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {
                4,2,5,8,1,9,0,3,6,7
        };
/*      bubbleSort.bubbleSort(array);

        for (int i=0; i <array.length; i++) {
            System.out.print(array[i] + " ");
*/
        HeapSort.sort(array);

        for (int i=0; i <array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

}
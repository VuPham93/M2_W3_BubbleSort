import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] list = new int[random.nextInt(10)+10];

        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(20);
        }

        System.out.print("List: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }

        System.out.println("\nBegin sort processing...");
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}

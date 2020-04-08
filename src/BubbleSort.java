public class BubbleSort {
    public static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        boolean swapped;
        int temp;
        int length = list.length;
        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void display(int[] list) {
        for (int values : list) {
            System.out.print(values + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Original: ");
        display(list);
        System.out.println("After arrangement: ");
        bubbleSort(list);
        display(list);
    }
}

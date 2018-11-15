public class Runner {
    public static void main(String[] args)
    {
        String[] arr = new String[]{"apple","banana","Cat","d","archer"};
        BubbleSort(arr);
        printArr(arr);
    }
    public static void BubbleSort(String[] arr)
    {
        int swaps = 0;
        boolean swapped = true;
        while(swapped)
        {
            for(int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) < 0) {
                    swap(arr, i, i + 1);
                    swaps++;
                }
            }
            if(swaps > 0)
            {
                swaps = 0;
            }
            else
            {
                if(swaps == 0)
                {
                    swapped = false;
                }
            }
        }
    }
    public static void selectionSort(double[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int b = i;
            for(int a = i; a < arr.length; a++)
            {
                if(arr[b] > arr[a])
                {
                    b = a;
                }
            }
            for(int c = b; c > i; c--) {
                double temp = arr[c];
                arr[c] = arr[c - 1];
                arr[c - 1] = temp;
            }
        }
    }
    public static void insertionSort(int[] arr)
    {
        int[] temparr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int b = i;
            for (int a = 0; a < arr.length; a++) {
                if (arr[b] > arr[a]) {
                    b = a;
                }
            }
            temparr[i] = arr[b];
            arr[b] = 999999999;
        }
    }
    public static void swap(String[] arr, int a, int b)
    {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] getRndIntArr(int min, int max, int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) Math.floor(Math.random() * (max - min + 1)) + min;
        }
        return arr;
    }
    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i] + " | ");
        }
        System.out.println();
    }
}

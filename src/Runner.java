public class Runner {
    public static void main(String[] args)
    {
        InPlaceSorts i = new InPlaceSorts();
        MergeSortLab m = new MergeSortLab();
        String[] str = i.getRndStringArr(1000,10);
        int[] ints = i.getRndIntArr(1,100,1000000);
        double[] doub = i.getRndDoubleArr(1,100,50000);
        int[] ints2 = i.getRndIntArr(1,100,50000);
        String[] strings = i.getRndStringArr(100000,10);

        System.out.print("Bubble Sort with String Array(Unsorted) : ");
        i.printStrArr(str);

        System.out.print("Insertion Sort with Int Array(Unsorted) : ");
        i.printIntArr(ints);

        System.out.print("Selection Sort with Double Array(Unsorted) : ");
        i.printDoubleArr(doub);

        System.out.print("Merge Sort with Int Array(Unsorted) : ");
        i.printIntArr(ints2);

        System.out.print("Merge Sort with String Array(Unsorted) : ");
        i.printStrArr(strings);

        long s = System.nanoTime();
        i.BubbleSort(str);
        long e = System.nanoTime();
        System.out.println("Bubble Sort(String) took " + (e-s)/1000000 + " milliseconds.");

        s = System.nanoTime();
        i.insertionSort(ints);
        e = System.nanoTime();
        System.out.println("Insertion Sort(Int) took " + (e-s)/1000000 + " milliseconds.");

        s = System.nanoTime();
        i.selectionSort(doub);
        e = System.nanoTime();
        System.out.println("Selection Sort(Doubles) took " + (e-s)/1000000 + " milliseconds.");

        s = System.nanoTime();
        m.mergeSortInt(ints2);
        e = System.nanoTime();
        System.out.println("Merge Sort(Int) took " + (e-s)/1000000 + " milliseconds.");

        s = System.nanoTime();
        m.mergeSortStr(strings);
        e = System.nanoTime();
        System.out.println("Merge Sort(String) took " + (e-s)/1000000 + " milliseconds.");

        System.out.print("Bubble Sort with String Array : ");
        i.printStrArr(str);

        System.out.print("Insertion Sort with Int Array : ");
        i.printIntArr(ints);

        System.out.print("Selection Sort with Double Array : ");
        i.printDoubleArr(doub);

        System.out.print("Merge Sort with Int Array : ");
        i.printIntArr(ints2);

        System.out.print("Merge Sort with String Array : ");
        i.printStrArr(strings);
    }
}

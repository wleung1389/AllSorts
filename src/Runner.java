public class Runner {
    public static void main(String[] args)
    {
        InPlaceSorts i = new InPlaceSorts();
        RecursiveSort m = new RecursiveSort();
        String[] str = i.getRndStringArr(10000,10);
        int[] ints = i.getRndIntArr(1,100,1000000);
        double[] doub = i.getRndDoubleArr(1,100,10000);

        //System.out.print("Bubble Sort with String Array(Unsorted) : ");
        //i.printStrArr(str);

        //System.out.print("Insertion Sort with Int Array(Unsorted) : ");
        //i.printIntArr(ints);

        //System.out.print("Selection Sort with Double Array(Unsorted) : ");
        //i.printDoubleArr(doub);

        //System.out.print("Merge Sort with Int Array(Unsorted) : ");
        //i.printIntArr(ints2);

        //System.out.print("Merge Sort with String Array(Unsorted) : ");
        //i.printStrArr(strings);

        long s = System.nanoTime();
        //i.BubbleSort(str);
        long e = System.nanoTime();
        System.out.println("Bubble Sort(String) took " + (e-s)/1000000 + " milliseconds.");

        s = System.nanoTime();
        //i.insertionSort(ints);
        e = System.nanoTime();
        System.out.println("Insertion Sort(Int) took " + (e-s)/1000000 + " milliseconds.");

        s = System.nanoTime();
        //i.selectionSort(doub);
        e = System.nanoTime();
        System.out.println("Selection Sort(Doubles) took " + (e-s)/1000000 + " milliseconds.");

        s = System.nanoTime();
        //m.mergeSortInt(ints);
        e = System.nanoTime();
        System.out.println("Merge Sort(Int) took " + (e-s)/1000000 + " milliseconds.");

        s = System.nanoTime();
        //m.mergeSortStr(str);
        e = System.nanoTime();
        System.out.println("Merge Sort(String) took " + (e-s)/1000000 + " milliseconds.");

        s = System.nanoTime();
        m.quickSort(ints,0,ints.length-1);
        e = System.nanoTime();
        System.out.println("Quick Sort(Ints) took " + (e-s)/1000000 + " milliseconds.");

        //System.out.print("Bubble Sort with String Array : ");
        //i.printStrArr(str);

        //System.out.print("Insertion Sort with Int Array : ");
        //i.printIntArr(ints);

        //System.out.print("Selection Sort with Double Array : ");
        //i.printDoubleArr(doub);

        //System.out.print("Merge Sort with Int Array : ");
        //i.printIntArr(ints2);

        //System.out.print("Merge Sort with String Array : ");
        //i.printStrArr(strings);
    }
}

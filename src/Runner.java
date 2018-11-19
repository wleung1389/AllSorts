public class Runner {
    public static void main(String[] args)
    {
        InPlaceSorts i = new InPlaceSorts();
        String[] str = i.getRndStringArr(10,10);
        int[] ints = i.getRndIntArr(1,100,10);
        double[] doub = i.getRndDoubleArr(1,100,10);
        i.printStrArr(str);
        i.printIntArr(ints);
        i.printDoubleArr(doub);
        i.BubbleSort(str);
        i.insertionSort(ints);
        i.selectionSort(doub);
        i.printStrArr(str);
        i.printIntArr(ints);
        i.printDoubleArr(doub);
    }
}

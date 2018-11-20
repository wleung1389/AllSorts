public class InPlaceSorts {
    public void BubbleSort(String[] arr)
    {
        System.out.println(arr[0].substring(0,1).compareTo(arr[1].substring(0,1)));
        int swaps = 0;
        boolean swapped = true;
        while(swapped)
        {
            for(int i = 0; i < arr.length - 1; i++) {
                if (arr[i].substring(0,1).compareTo(arr[i + 1].substring(0,1)) > 0) {
                    swap(arr, i, i + 1);
                    swaps++;
                }
                else
                {
                    if(arr[i].substring(0,1).compareTo(arr[i + 1].substring(0,1)) == 0) {
                        int c = 0;
                        int length = 0;
                        if(arr[i].length() < arr[i+1].length())
                        {
                            length = arr[i].length();
                        }
                        else
                        {
                            length = arr[i+1].length();
                        }
                        while (arr[i].substring(c, c + 1).compareTo(arr[i + 1].substring(c, c + 1)) == 0 && c < length) {
                            c++;
                        }
                        if (arr[i].substring(c, c).compareTo(arr[i + 1].substring(c, c)) < 0) {
                            swap(arr, i, i + 1);
                            swaps++;
                        }
                    }
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
    public void selectionSort(double[] arr)
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
    public void insertionSort(int[] arr)
    {
        int smallest = arr[0];
        int place = 0;
        for(int z = 0; z < arr.length; z++)
        {
            if(smallest > arr[z])
            {
                smallest = arr[z];
                place = z;
            }
        }
        arr[place] = arr[0];
        arr[0] = smallest;
        for(int i = 0; i < arr.length; i++) {
            int currentPos = i;
            int a = i - 1;
            while(a > 0 && arr[currentPos] < arr[a])
            {
                a--;
            }
            for(int c = currentPos; c > a + 1; c--) {
                int temp = arr[c];
                arr[c] = arr[c - 1];
                arr[c - 1] = temp;
            }
        }
    }
    public void swap(String[] arr, int a, int b)
    {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int[] getRndIntArr(int min, int max, int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int) Math.floor(Math.random() * (max - min + 1)) + min;
        }
        return arr;
    }
    public String[] getRndStringArr(int num, int length)
    {
        String[] arr = new String[num];
        while(num > 0) {
            int i = 0;
            String s = "";
            while(i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
    public double[] getRndDoubleArr(int min, int max, int length)
    {
        double[] arr1 = new double[length];
        for(int i = 0; i < length; i++)
        {
            arr1[i] = Math.floor(Math.random() * (max - min + 1)) + min;
        }
        return arr1;
    }
    public void printStrArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i] + " | ");
        }
        System.out.println();
    }
    public void printIntArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i] + " | ");
        }
        System.out.println();
    }
    public void printDoubleArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i] + " | ");
        }
        System.out.println();
    }
}

public class MergeSortLab {
    public void mergeSortInt(int[] arr) {
        int n = arr.length;
        int [] temp = new int[n];
        mergeSortHelperInt(arr,0,n - 1, temp);
    }
    public void mergeSortHelperInt(int[] arr, int left, int right, int[] temp)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelperInt(arr, left, mid, temp);
            mergeSortHelperInt(arr,mid + 1, right, temp);
            mergeInt(arr,left,mid,right,temp);
        }
    }
    public void mergeInt(int[] arr, int left, int mid, int right, int[] temp)
    {
        for(int x = 0; x < arr.length; x++)
        {
            temp[x] = arr[x];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while(i <= mid && j <= right)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int z = 0; z < arr.length; z++)
        {
            arr[z] = temp[z];
        }
    }
    public void mergeSortStr(String[] arr) {
        int n = arr.length;
        String [] temp = new String[n];
        mergeSortHelperStr(arr,0,n - 1, temp);
    }
    public void mergeSortHelperStr(String[] arr, int left, int right, String[] temp)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelperStr(arr, left, mid, temp);
            mergeSortHelperStr(arr,mid + 1, right, temp);
            mergeStringStr(arr,left,mid,right,temp);
        }
    }
    public void mergeStringStr(String[] arr, int left, int mid, int right, String[] temp)
    {
        for(int x = 0; x < arr.length; x++)
        {
            temp[x] = arr[x];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while(i <= mid && j <= right)
        {
            int length = 0;
            if(arr[i].length() > arr[j].length())
            {
                length = arr[j].length();
            }
            else
            {
                length = arr[i].length();
            }
            if(arr[i].compareTo(arr[j]) < 0)
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int z = 0; z < arr.length; z++)
        {
            arr[z] = temp[z];
        }
    }
}

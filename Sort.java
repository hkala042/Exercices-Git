/*
 * Simple sort algorithms 
 *
 * CSI2510 Algortihmes et Structures de Donnees
 * www.uottawa.ca
 *
 * Robert Laganiere, 2017
 *
*/
public class Sort {
//            for (int j = i + 1; j < data.length; j++) {
 
    public static void selection(int[] data){
         
        for (int i = 0; i < data.length - 1; i++)
        {
            int index = i;
            for (int j = 0; j < data.length; j++) {
                if (data[j] < data[index])
                    index = j;
			}
      
			swap(data, i, index);
        }
    }
	
    public static void insertion(int[] data){
         
        int temp;
        for (int i = 1; i < data.length; i++) {
		    temp= data[i];
			int j;
            for (j= i-1; j>=0 && temp < data[j]; j--)  {
                data[j+1]= data[j];
            }
            data[j+1]= temp;
        }
    }
     
    public static void bubble(int[] data) {
	
        int k;
        for (int m = 0; m < data.length - 1; m++) {
            for (int i = data.length-1; i > m; i--) {
                if (data[i] < data[i-1]) {
                    swap(data,i, i-1);
                }
            }
        }
    }
	
	private static void swap(int[] data, int i, int j) {
	
		int tmp= data[i];
		data[i]= data[j];
		data[j]= tmp;
	}
	
    public static void mergeSort(int[] data) {
	
		int[] buffer= new int[data.length];
		
		Sort.doMergeSort(data, buffer, 0, data.length-1);	
	}
	
    private static void doMergeSort(int[] data, int[] buffer, int low, int high) {
         
        if (low < high) {
            int mid = low + (high - low) / 2;
			
            Sort.doMergeSort(data, buffer, low, mid);
            Sort.doMergeSort(data, buffer, mid + 1, high);
			
            Sort.merge(data, buffer, low, mid, high);
        }
    }
	
	// merge the array [low, mid] with array [mid+1, high]
	private static void merge(int[] data, int[] buffer, int low, int mid, int high) {

		for (int i = low; i <= high; i++) {
            buffer[i] = data[i];
        }		
		
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (buffer[i] <= buffer[j]) {
                data[k] = buffer[i++];
            } else {
                data[k] = buffer[j++];
            }
            k++;
        }
        while (i <= mid) {
            data[k++] = buffer[i++];
        }		
	}	
	
    public static void quickSort(int[] data) {
		
		Sort.doQuickSort(data, 0, data.length-1);	
	}

    private static void doQuickSort(int[] data, int low, int high) {
         
        int i = low;
        int j = high;
        int pivot = data[low];
		
        while (i <= j) {
            while (data[i] < pivot) {
                i++;
            }
            while (data[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(data, i, j);
                i++;
                j--;
            }
        }
		
        if (low < j)
            Sort.doQuickSort(data, low, j);
        if (i < high)
            Sort.doQuickSort(data, i, high);
    }
	
    public static void main(String a[]){
         
		System.out.println("Selection: ");
        int[] data1 = {10,34,2,56,7,67,88,42};
		System.out.println("before: ");
        for(int i:data1){
            System.out.print(i);
            System.out.print(", ");
        }
		System.out.println("after: ");
        Sort.selection(data1);
        for(int i:data1){
            System.out.print(i);
            System.out.print(", ");
        }
		
		System.out.println("\nInsertion: ");
		
        int[] data2 = {10,34,2,56,7,67,88,42};
		System.out.println("before: ");
        for(int i:data2){
            System.out.print(i);
            System.out.print(", ");
        }
		System.out.println("\nafter: ");
        Sort.insertion(data2);
        for(int i:data2){
            System.out.print(i);
            System.out.print(", ");
        }

		System.out.println("\nBubble: ");
		
        int[] data3 = {10,34,2,56,7,67,88,42};
		System.out.println("before: ");
        for(int i:data3){
            System.out.print(i);
            System.out.print(", ");
        }
		System.out.println("\nafter: ");
        Sort.bubble(data3);
        for(int i:data3){
            System.out.print(i);
            System.out.print(", ");
        }
		
        int[] data4 = {10,34,56,67,88,6,39,56,57,99};
		System.out.println("before (mid=4): ");
        for(int i:data4){
            System.out.print(i);
            System.out.print(", ");
        }
		
		int[] buffer= new int[10];
		Sort.merge(data4,buffer,0,4,9);
		
		System.out.println("\nafter merge: ");
        for(int i:data4){
            System.out.print(i);
            System.out.print(", ");
        }
		
        int[] data5 = {10,34,2,56,7,67,88,42,8,17,56,99,15};
		System.out.println("\nmergesort before: ");
        for(int i:data5){
            System.out.print(i);
            System.out.print(", ");
        }
		System.out.println("\nafter: ");
        Sort.mergeSort(data5);
        for(int i:data5){
            System.out.print(i);
            System.out.print(", ");
        }
		
        int[] data6 = {10,34,2,56,7,67,88,42,8,17,56,99,15};
		System.out.println("\nquicksort before: ");
        for(int i:data6){
            System.out.print(i);
            System.out.print(", ");
        }
		System.out.println("\nafter: ");
        Sort.quickSort(data6);
        for(int i:data6){
            System.out.print(i);
            System.out.print(", ");
        }
		
    }
}
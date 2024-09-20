package Activities;

public class Activity4 {
	  static void insertionSort(int array[]) {
	        //int size = array.length;
	        
	        for (int i = 1; i < array.length; i++) {
	            int key = array[i];
	            int j = i - 1;
	            
	            while (j >= 0 && key < array[j]) {
	                array[j + 1] = array[j];
	                --j;
	            }
	            array[j + 1] = key;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = { 4, 3, 2, 10, 12, 1, 5, 6 };
		System.out.println("Before Insertion Sort");
		for(int Arr:Array){    
            System.out.print(Arr+" ");  
        } 
		insertionSort(Array);
		System.out.println();
		System.out.println("After Insertion Sort");
		for(int Arr:Array){    
            System.out.print(Arr+" ");    
        } 
		
		
	}

}

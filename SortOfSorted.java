class SortOfSorted{
  
  // takes in an array, and sort of sorts it. 
  public static void sortOfSort(int[] in) {
    
    //maintains the range of unsorted values, 
    //we know we're done when there is only one location left
    int start = 0;
    int end = in.length-1;
    
    //keeps track of how many things we have sorted, 
    // if count %4 is 0 or 1 we add things to the back of the range, 
    // if count %4 is 2 or 3 add them to the front
    int count = 0;
    
    // base is when only one element is left to sort 
    while(start<end) {
      
      //find the max left
      int maxIndex = start;
      for(int i=start;i<=end;i++) {
        if(in[i] > in[maxIndex]) maxIndex = i;
      }
      
      // swap the max with the correct location, 
      // move the associated pointer in by one
      if(count%4 < 2) {
        int temp = in[end];
        in[end] = in[maxIndex];
        in[maxIndex] = temp;
        end--;
      }else {
        int temp = in[start];
        in[start] = in[maxIndex];
        in[maxIndex] = temp;
        start++;
      }
      
      // sorted one more, update the counter
      count++;
    }
  }
}
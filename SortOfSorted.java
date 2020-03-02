class SortOfSorted{
  public static void SortOfSort(int[] in) {
    int start = 0;
    int end = in.length-1;
    int count = 0;
    while(start<end) {
      int maxIndex = start;
      for(int i=start;i<=end;i++) {
        if(in[i] > in[maxIndex]) maxIndex = i;
      }
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
      count++;
    }
  }
}
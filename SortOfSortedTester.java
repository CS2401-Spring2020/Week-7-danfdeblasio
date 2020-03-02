import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class SortOfSortedTester {

  
  @Test
  public void startSorted() {
    int[] in1 = {1,2,3,4,5,6,7,8};
    SortOfSorted.SortOfSort(in1);
    assertArrayEquals(new int[]{6,5,2,1,3,4,7,8},in1);
  }
  
  @Test
  public void startRevSorted() {
    int[] in1 = {8,7,6,5,4,3,2,1};
    SortOfSorted.SortOfSort(in1);
    assertArrayEquals(new int[]{6,5,2,1,3,4,7,8},in1);
  }
  
  @Test
  public void startNegSorted() {
    int[] in1 = {-8,-7,-6,-5,-4,-3,-2,-1};
    SortOfSorted.SortOfSort(in1);
    assertArrayEquals(new int[]{-3,-4,-7,-8,-6,-5,-2,-1},in1);
  }
  
  @Test
  public void startNegRevSorted() {
    int[] in1 = {-1,-2,-3,-4,-5,-6,-7,-8};
    SortOfSorted.SortOfSort(in1);
    assertArrayEquals(new int[]{-3,-4,-7,-8,-6,-5,-2,-1},in1);
  }
  
  @Test
  public void allSame() {
    int[] in1 = {1,1,1,1,1,1,1,1,1,1,1};
    SortOfSorted.SortOfSort(in1);
    assertArrayEquals(new int[]{1,1,1,1,1,1,1,1,1,1,1},in1);
  }
  
  @Test
  public void doubles() {
    int[] in1 = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12};
    SortOfSorted.SortOfSort(in1);
    assertArrayEquals(new int[]{11,11,9,9,7,7,5,5,3,3,1,1,2,2,4,4,6,6,8,8,10,10,12,12},in1);
  }
}
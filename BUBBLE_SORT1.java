import java.util.Arrays;
public class BubbleSort {
  public static void main(String[] args) {
    
    // Bubble Sort
    
    int[] arr={43,6,8,5,2,4,1};
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
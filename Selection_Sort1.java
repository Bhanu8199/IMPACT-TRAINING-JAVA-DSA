import java.util.Arrays;
public class SelectionSort1 {
  public static void main(String[] args) {
    int[] arr={3,6,8,87,5,43,5,7};
    for(int i=0;i<arr.length;i++){
      int min_index=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[min_index]>arr[j]){
          min_index=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[min_index];
      arr[min_index]=temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}




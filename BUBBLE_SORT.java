import java.util.Arrays;
public class May8 {
  public static void main(String[] args) {
      
    // Bubble Short
      
    int arr[] = {6,5,2,9,2,0,1,9,2};
    for(int i=0;i<=arr.length;i++){
      //arr[i]
      for(int j=i+1;j<arr.length;j++){
        //arr[j]
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
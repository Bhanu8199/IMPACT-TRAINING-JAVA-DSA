import java.util.Arrays;
public class May8 {
  public static void main(String[] args) {
    
    // MERGING TWO ARRAYS
    int arr1[]={1,2,3,4,5};
    int arr2[]={9,10,11,12};
    int arr3[]=new int[arr1.length+arr2.length];
    for(int i=0;i<arr3.length;i++){
      if(i<arr1.length){
        arr3[i]=arr1[i];
      }else{
        arr3[i]=arr2[i-arr1.length];
      }
    }
    System.out.println(Arrays.toString(arr3));
  } 
}
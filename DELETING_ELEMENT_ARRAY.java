import java.util.Arrays;
public class May8 {
  public static void main(String[] args) {
    // DELETING AN ELEMENT FROM ARRAY 
    int arr[]={12,14,15,78,6745,78,9,5};
    int index=3;
    int count=0;
    int newArr[]=new int[arr.length-1];
    for(int i=0;i<arr.length;i++){
      if(i!=index){
        newArr[count]=arr[i];
        count++;
      }
    }
    System.out.println(Arrays.toString(newArr));
  } 
}
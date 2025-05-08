public class May8 {
    public static void main(String[] args) {
      
      // check if the element is inside a array or not using linear search
      int arr[]={45,567,7,434,6,8,5,3};
      int e=7;
      int flag=0;
      
      for(int i=0;i<arr.length;i++){
        if(arr[i]==e){
          flag=1;
          break;
        }
      }
      if(flag==1){
        System.out.println("Element Found");
      }else{
        System.out.println("Element not Found");
      }
  }
}
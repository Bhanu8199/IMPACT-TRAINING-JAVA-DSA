// import java.util.Stack;
// public class StackProgram {
//   public static void main (String[] args) {
    
//     Stack<Integer> st=new Stack<Integer>();
//     st.push(12);
//     st.push(9);
//     st.push(1);
//     st.push(2);
//     System.out.println(st);
//     st.pop();
//     System.out.println(st);
//     st.pop();
//     System.out.println(st);
//     System.out.println(st.peek());
//   }
// }

// Another method of StackProgram
public class StackProgram{
  public static void main (String[] args) {
    MyStack st=new MyStack(5);
    st.push(10);
    st.push(12);
    st.print();
  }
}
class MyStack{
  int maxSize;
  int[] arr;
  int top;
  
  MyStack(int maxSize){
    this.maxSize=maxSize;
    this.arr=new int[maxSize];
    this.top=-1;
  }
  void push(int ele){
    arr[++top] = ele;
  }
  int pop(){
    return arr[--top];
  }
  void print(){
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}


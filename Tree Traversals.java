public class TreeTraversals {
  public static void main (String[] args) {
    
    // tree problem
    
    Node root=new Node(12);
    root.left=new Node(11);
    root.right=new Node(12);
    root.left.left=new Node(5);
    root.left.right=new Node(6);
    // root.left=11;
    // root.right=12;
    // root.left.left=5;
    // root.left.right=6;
    
    // root.inOrder(root);
    // root.preOrder(root);
    root.postOrder(root);
    
    // tree traversals
    // 3 ways of traversing
    // inorder (left,root,right)
    // preorder (root,left,right
    // postorder (left,right,root)
  }
}


class Node{
  int data;
  Node left;
  Node right;
  
  Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
  }
  void inOrder(Node root){ //printing //travrrs 
    if (root==null){
      return;
    }
    //left //root //right
    inOrder(root.left);
    System.out.println(root.data);
    inOrder(root.right);
  }
  
  void preOrder(Node root){
    if(root==null){
      return;
    }
    //root //left //right
    System.out.println(root.data);
    preOrder(root.left);
    preOrder(root.right);
  }
  
  void postOrder(Node root){
    if (root==null){
      return;
    }
    //left //right //root
    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.data);
  }
}
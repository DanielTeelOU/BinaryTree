/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;
import java.util.Scanner;
/**
 *
 * @author teel6
 */
public class BinaryTreeTest {
    public static void main(String[] args){
        BinaryTree binaryTree=new BinaryTree();
    /*Scanner scan =new Scanner(System.in);
    
    System.out.println("Enter 10 integers to insert");
  */
        int[] a={50, 76,21, 4, 32, 64, 15, 52, 14, 100, 83, 2, 3, 70, 87,80};
        for(int i=0;i<16;i++){
            binaryTree.insert(a[i]); 
        }
    
      /*  Display tree  */ 
        System.out.print("\nPostorder : \n");
        binaryTree.postorder();
        System.out.print("\nPreorder : \n");
        binaryTree.preorder();
        System.out.print("\nInorder : \n");
        binaryTree.inorder();
            
           /*  test search method */  
        int searchKey=50;
        System.out.println("\nSearch result : "+ binaryTree.search(searchKey)); 
      
      /*  display the node number in a tree */  
        System.out.println("Nodes = "+ binaryTree.countNodes());
      
      /*  test the tree is empty or not*/  
        System.out.println("Empty status = "+ binaryTree.isEmpty());
    
    }

}

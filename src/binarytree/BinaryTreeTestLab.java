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
public class BinaryTreeTestLab {
    public static void main(String[] args){
        BinaryTree binaryTree=new BinaryTree();
        System.out.println("Unsorted: ");
        int number = 15;
        int[] input = new int[number];
        for(int i = 0; i < number; i++){
            int Random = (int)(Math.random()*100);
            input[i] = Random;
        }
        System.out.println(java.util.Arrays.toString(input));
        for(int i=0;i<15;i++){
            binaryTree.insert(input[i]); 
        }
        
        //searchFor is the redesigned method for this lab.
        System.out.println("\nEnter a number to search for: ");
        Scanner scan =new Scanner(System.in);
        String num=scan.next();
        int term = Integer.parseInt(num);
        System.out.println("Is the value " + term + " in this set? " + binaryTree.searchFor(term));
        
        System.out.println("\nEnter a number to search for: ");
        Scanner sc =new Scanner(System.in);
        String num2=scan.next();
        int term2 = Integer.parseInt(num2);
        System.out.println("Is the value " + term2 + " in this set? " + binaryTree.searchFor(term2));
        
        System.out.print("\nInorder : \n");
        binaryTree.inorder();
    }
}

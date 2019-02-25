/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author teel6
 */
public class BinaryTreeNode {

    /**
     * @param args the command line arguments
     */
    BinaryTreeNode left;
    BinaryTreeNode right;
    int data;
    
    public BinaryTreeNode(){
        left=null;
        right=null;
        data=0;
        }
    
    public BinaryTreeNode(int value){
        left=null;
        right=null;
        data=value;
        }
    
    public void setLeft(BinaryTreeNode node){
        left=node;
        }
      
    public void setRight(BinaryTreeNode node){
        right=node;
        }
        
    public void setData(int value){
        data=value;
        }
         
    public BinaryTreeNode getLeft(){
        return left;
        }
     
    public BinaryTreeNode getRight(){
        return right;
        }
   
    public int getData(){
        return data;
        }  

}

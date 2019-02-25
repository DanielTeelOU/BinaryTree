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
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    private BinaryTreeNode root;
    
        public BinaryTree(){
            root=null;
        }
    
        public boolean isEmpty(){
            return root==null;
        }
    
        public BinaryTreeNode insert(BinaryTreeNode node, int data){
            if(node==null){
                node=new BinaryTreeNode(data);
            }
            else{
                if(node.getLeft()==null)
                node.left=insert(node.left,data);
            else
                node.right=insert(node.right,data);
            }
            return node;
        }
     
        public void insert(int data){
            root=insert(root, data);
        }
        
        private int countNodes(BinaryTreeNode r){
            if(r==null)
                return 0;
            else{
                int number=1;
                number+=countNodes(r.getLeft());
                number+=countNodes(r.getRight());
                return number;
            }
        }
    
        public int countNodes(){
            return countNodes(root);
        }
    
        public boolean search(BinaryTreeNode r, int data){
            if(r.getData()==data)
                return true;
            if(r.getLeft()!=null) 
            if(search(r.getLeft(),data))
                return true;
            if(r.getRight()!=null) 
            if(search(r.getRight(),data))
                return true;
                return false;
        }
        
        public void postorder(BinaryTreeNode node){
            if(node == null){
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.printf("%s ", node.data);
        }
        
        public void inorder(BinaryTreeNode node){
            if (node == null){
                return;
            }
            inorder(node.left);
            System.out.printf("%s ", node.data);
            inorder(node.right);
        }
 
        public void preorder(BinaryTreeNode node){
            if (node == null) {
                return; 
            }
            System.out.printf("%s ", node.data);
            preorder(node.left);
            preorder(node.right);
        }
        
        void postorder(){
            postorder(root);
        }
        void inorder(){
            inorder(root);
        }
        void preorder(){     
            preorder(root);
        }
 
        
        public boolean search(int val){
            return search(root, val);
        }
        
        //My Binary Tree Search class for Lab 11
        public boolean searchFor(int key){
            BinaryTreeNode current = root;
            while(current!=null){
		if(current.data==key){
                    return true;
		}
                else if(current.data>key){
                    current = current.left;
		}
                else{
                    current = current.right;
		}
		}
		return false;
	}
    
}

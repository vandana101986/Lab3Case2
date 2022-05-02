package com.gl.bst;
import java.util.ArrayList;

public class SumOfNodes {
	
	public static class Node{
		int key;
		Node left;
		Node right;
	}
	
	public Node createNode(int key) {
		Node temp=new Node();
		temp.key=key;
		temp.left=null;
		temp.right=null;
		
		return temp;
	}
	
	public Node insertNode(Node root, int key) {
		Node newnode = createNode(key);
		Node x = root;
		Node current_parent = null;
		while (x != null) {
		current_parent = x;
		if (key < x.key)
		x = x.left;
		else if (key > x.key)
		x = x.right;
		else {
		System.out.println("Value already exists!!!");
		return newnode;
		}
		}
		// If the root is null, the tree is empty.
		if (current_parent == null)
		current_parent = newnode;
		// assign new node node to the left child
		else if (key < current_parent.key)
		current_parent.left = newnode;
		// assign the new node to the right child
		else
		current_parent.right = newnode;
		// return pointer to new node
		return current_parent;
		}
	
	public static void displayInorder(Node root) {
		if(root==null) {
			return;
		}
		else {
			displayInorder(root.left);
			System.out.println(root.key+" ");
			displayInorder(root.right);
		}
	}
	
	public void checkForPair(Node root,ArrayList<Integer> list,int sum) {
		
				Node x = root;
				Node currentNode = null;
				
				if(x != null) {
				currentNode = x;
					if(list.contains(sum-currentNode.key)) {
						System.out.println("Pair is Found..!!");
						System.out.println("Pair is ("+(sum-currentNode.key)+","+root.key+")");
					}
					else {
						System.out.println("Pair not found");
					}
					
				}
			}
				
		
	}



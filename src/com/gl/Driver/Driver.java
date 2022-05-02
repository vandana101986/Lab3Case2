package com.gl.Driver;
import java.util.ArrayList;
import java.util.Scanner;
import com.gl.bst.SumOfNodes;

public class Driver {	
	
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			SumOfNodes obj=new SumOfNodes();
			ArrayList<Integer> list=new ArrayList<Integer>();
			System.out.println("Enter the number of nodes :");
			int num=sc.nextInt();
			SumOfNodes.Node root=null;
			
			for(int i=0;i<num;i++) {
				System.out.println("Enter the Node "+(i+1)+"value : ");
				int value=sc.nextInt();
				list.add(value);
				if(root==null) 
						root=obj.insertNode(root,value);				
				else 
					obj.insertNode(root, value);
				
			}
			System.out.println("The node values of the tree are :\n");
			SumOfNodes.displayInorder(root);
			
			System.out.println("Enter the Sum you want to check : ");
			int sum=sc.nextInt();
			obj.checkForPair(root,list,sum);	
			sc.close();	
		}
		
	
	
	}




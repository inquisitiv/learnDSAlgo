package com.nidhi.test;

import java.util.Scanner;

import com.nidhi.solutions.AVLTree;

public class AVLTreeTest {
	
	public static void main(String args[])
	{
	   Scanner scan = new Scanner(System.in);
	   AVLTree avlt = new AVLTree();
	   
	   //String array = "10 11 14 7 6 82 40 23 13 23 43 33 65 45 87 63 10 11 14 7 6 82 40 23 15 25 45 35 65 45 87 1 10 11 14 17 6 82 40 23 22 32";
	   String array = "10 11 14 17 6 82 40 23 22 32";
	   String[] theArray = array.split(" ");
	   System.out.println(array);
	   System.out.println("AVL Tree Testing");
	   
	   char ch;
	   
	   /* Perform tree operations */
	   do
	   {
		   System.out.println("\nAVLTree Operations");
		   System.out.println("1. insert");
		   System.out.println("2. search");
		   System.out.println("3. count nodes");
		   System.out.println("4. check empty");
		   System.out.println("5. clear tree");
		   
		   int choice = scan.nextInt();
		   switch(choice)
		   {
		   case 1:
			   System.out.println("Integer elements to inserted");
			   for(String ele:theArray)
				   avlt.insert(Integer.parseInt(ele));
			   break;
		   case 2: 
			   System.out.println("Enter element to search");
			   int element = scan.nextInt();
			   System.out.println("Search result :"+avlt.search(element));
               break;
		   case 3: 
			   System.out.println("nodes = "+avlt.countNodes());
               break;
		   case 4: 
			   System.out.println("Empty Status :"+avlt.isEmpty());
               break;
		   case 5: 
			   System.out.println("Tree Cleared");
			   avlt.makeEmpty();
               break;
           default : 
        	   System.out.println("wrong entry \n");
		   }
		   
		   System.out.println("Do you want to continue (y/n) ?\n");
		   ch=scan.next().charAt(0);
		   
	   }while(ch == 'Y'|| ch == 'y');
	   
	   
		scan.close();
	}

}

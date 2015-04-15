package com.nidhi.test;

import java.util.Scanner;

import com.nidhi.solutions.BinarySearchTree;

public class BinarySearchTreeTest {
	
	public static void main(String args[])
	{
		String array = "10 11 14 17 6 82 40 23 22 32";
		String[] theArray = array.split(" ");
		int arraySize = theArray.length;
		
		
		
		Scanner scan = new Scanner(System.in);
        /* Creating object of BST */
		BinarySearchTree bst = new BinarySearchTree(); 
        System.out.println("Binary Search Tree Test\n");          
        char ch;
        /*  Perform tree operations  */
        do    
        {
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty"); 
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter array elements to insert");
                for(int i=0;i<arraySize;i++){
                bst.insert(Integer.parseInt(theArray[i])); 
                }
                break;                          
            case 2 : 
                System.out.println("Enter integer element to delete");
                bst.delete( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bst.search( scan.nextInt() ));
                break;                                          
            case 4 : 
                System.out.println("Nodes = "+ bst.countNodes());
                break;     
            case 5 :  
                System.out.println("Empty status = "+ bst.isEmpty());
                break;            
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display tree  */ 
            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();

 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y'); 
        
        scan.close();
	}

}

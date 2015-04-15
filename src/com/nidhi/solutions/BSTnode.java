package com.nidhi.solutions;

public class BSTnode {
	
	int data;
	BSTnode left;
	BSTnode right;
	
	/* Constructor */
    public BSTnode()
    {
        left = null;
        right = null;
        data = 0;
    }
    /* Constructor */
    public BSTnode(int n)
    {
        left = null;
        right = null;
        data = n;
    }

    /* Function to set left node */
    public void setLeft(BSTnode n)
    {
        left = n;
    }
    /* Function to set right node */ 
    public void setRight(BSTnode n)
    {
        right = n;
    }
    /* Function to get left node */
    public BSTnode getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public BSTnode getRight()
    {
        return right;
    }
    /* Function to set data to node */
    public void setData(int d)
    {
        data = d;
    }
    /* Function to get data from node */
    public int getData()
    {
        return data;
    }     
}

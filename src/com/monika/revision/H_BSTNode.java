package com.monika.revision;

public class H_BSTNode {
	
	int data;
	H_BSTNode left;
	H_BSTNode right;
	
	/* Constructor */
    public H_BSTNode()
    {
        left = null;
        right = null;
        data = 0;
    }
    /* Constructor */
    public H_BSTNode(int n)
    {
        left = null;
        right = null;
        data = n;
    }

    /* Function to set left node */
    public void setLeft(H_BSTNode n)
    {
        left = n;
    }
    /* Function to set right node */ 
    public void setRight(H_BSTNode n)
    {
        right = n;
    }
    /* Function to get left node */
    public H_BSTNode getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public H_BSTNode getRight()
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


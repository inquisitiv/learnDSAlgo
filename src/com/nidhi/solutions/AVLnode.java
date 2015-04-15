package com.nidhi.solutions;

public class AVLnode {
	
	private
	AVLnode left, right;
	
	int data;
    int height;
    
    /* Constructor */
    public AVLnode()
    {
        left = null;
        right = null;
        data = 0;
        height = 0;
    }
    /* Constructor */
    public AVLnode(int n)
    {
        left = null;
        right = null;
        data = n;
        height = 0;
    }     
    
    public AVLnode getLeft() {
		return left;
	}
	public void setLeft(AVLnode left) {
		this.left = left;
	}
	public AVLnode getRight() {
		return right;
	}
	public void setRight(AVLnode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}

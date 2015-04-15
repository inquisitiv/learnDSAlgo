package com.learning.binarytrees;

public class BinaryTreeOperation {

	public void insertElement(Node root, int element) {
		Queue Q = new Queue();
		Node temp;
		Node newNode = new Node(element);
		if (root == null) {
			root = newNode;
			return;
		}
		Q.enQueue(root);
		while (!Q.isEmpty()) {
			temp = Q.deQueue();
			if (temp.left != null)
				Q.enQueue(temp.left);
			else {
				temp.left = newNode;
				Q.delete();
				return;
			}
			if (temp.right != null)
				Q.enQueue(temp.right);
			else {
				temp.right = newNode;
				Q.delete();
				return;
			}
		}

	}

	public void inOrderRecur(Node root) {

		if (root == null)
			return;
		inOrderRecur(root.left);
		System.out.print(root.data + " ");
		inOrderRecur(root.right);

	}

	public void preOrderRecur(Node root) {

		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrderRecur(root.left);
		preOrderRecur(root.right);
	}

	public void postOrderRecur(Node root) {
		if (root == null)
			return;
		postOrderRecur(root.left);
		postOrderRecur(root.right);
		System.out.print(root.data + " ");
	}

	public void inOrderNonRecur(Node root) {

		Stack stack = new Stack();
		while (true) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				if (stack.isEmpty()) {
					stack.delete();
					return;
				} else {
					root = stack.pop();
					System.out.print(root.data + " ");
					root = root.right;
				}
			}
		}
	}

	public void preOrderNonRecur(Node root) {
		Stack stack = new Stack();
		if (root == null)
			return;
		while (true) {
			if (root != null) {
				stack.push(root);
				System.out.print(root.data + " ");
				root = root.left;
			} else {
				if (stack.isEmpty())
					return;
				else
					root = stack.pop().right;
			}

		}
	}

	public void inOrderNonRecurEasy(Node root) {
		if (root == null)
			return;
		Stack stack = new Stack();
		while (true) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			if (stack.isEmpty())
				return;
			root = stack.pop();
			System.out.print(root.data + " ");
			root = root.right;
		}
	}

	public void preOrderNonRecurEasy(Node root) {
		if (root == null)
			return;
		Stack stack = new Stack();
		while (true) {
			while (root != null) {
				System.out.print(root.data + " ");
				stack.push(root);
				root = root.left;
			}
			if (stack.isEmpty())
				return;
			root = stack.pop();
			root = root.right;
		}
	}

	public void postOrderNonRecur(Node root) {
		Stack stack = new Stack();
		while (true) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				if (stack.isEmpty()) {
					// System.out.println("Stack is Empty");
					stack.delete();
					return;
				} else if (stack.top().right == null) {
					root = stack.pop();
					System.out.print(root.data + " ");
					if (root == stack.top().right) {

						System.out.print(stack.top().data + " ");
						root = stack.pop();
						if (!stack.isEmpty() && root == stack.top().right)
							System.out.print(stack.pop().data + " ");
					}
				}

				if (!stack.isEmpty())
					root = stack.top().right;
				else
					root = null;
			}
		}
	}

	public void postOrderNonRecurEasy(Node root) {
		Stack stack = new Stack();
		while (true) {
			while(root!=null) {
				stack.push(root);
				root=root.left;
			}
			if(stack.isEmpty()) {
				return;
			}
			root=stack.pop();
			System.out.print(root.data+" ");
			if(!stack.isEmpty()&&root==stack.top().left)
				root=stack.top().right;
			else if(!stack.isEmpty()&&root==stack.top().right)
			{
				root=stack.pop();
				System.out.print(root.data+" ");
				if(!stack.isEmpty()&&root==stack.top().right)
				{
					root=stack.pop();
					System.out.print(root.data+" ");
				}
				if(!stack.isEmpty())
					root=stack.top().right;
				else
					return;
					
			}
		}
	}
	
	public void levelOrderTraversal(Node root) {
		if (root == null)
			return;
		Node temp;
		Queue Q = new Queue();
		Q.enQueue(root);
		while (!Q.isEmpty()) {
			temp = Q.deQueue();
			System.out.print(temp.data + " ");
			if (temp.left != null)
				Q.enQueue(temp.left);
			if (temp.right != null)
				Q.enQueue(temp.right);
		}
		Q.delete();
	}
	
	public int size(Node root) {
		if(root==null)
			return 0;
		return size(root.left) + 1 + size(root.right);
		
	}
	
	public int max(int a, int b)
	{
	   return a>b?a:b;
	}

	public int maxHeight(Node root) {
		if(root==null)
			return 0;
		return max( maxHeight(root.left), maxHeight(root.right))+1;
		
	}
	
	public Node delete(Node root) {
		if(root==null)
		     return null;
		root.left = delete(root.left);
		root.right = delete(root.right);
		
		return null;
	}
	
	public Node mirror(Node root) {
		if(root==null)
			return null;
		Node newNode = new Node(root.data);
		newNode.right = mirror(root.left);
		newNode.left = mirror(root.right);
		return newNode;		
	}
	
	/*
	public Node constructFromInPre(int inorder[], int preorder[]) {
		int inorderLen = inorder.length;
		int preorderLen = preorder.length;
		return constructFromInPre(inorder, inorderLen-1, preorder, 0);
	}
	
	
	public Node constructFromInPre(int inorder[], int inorderLen, int preorder[], int preorderIndex) {
		int data = preorder[preorderIndex];
		preorderIndex++;
		int index;
		for(int i=0;i<=inorderLen;i++)
		{
			if(inorder[i]==data)
			{
				index=i;
				break;
			}
		}
		Node newNode = new Node(data);
		newNode.left = constructFromInPre(inorder,inorderLen-1, preorder,preorderIndex);
		Integer[] inArray = new Integer[inorderLen-index];
		int k = 0;
		for(int i=index+1;i<=inorderLen;i++)
			inArray[k++] = inorder[i];
		return constructFromInPre(inArray,inorderLen-index, preorder,preorderLen);
	}
	*/
	
	public void leafNodePaths(Node root) {
		
		StringBuilder path = new StringBuilder();
		leafNodePaths(root,path);		
	}
	
   public void leafNodePaths(Node root, StringBuilder path) {
		
	   if(root==null)
		   System.out.println(path.toString());
	   else
	   {
			path.append("->"+root.data);
			leafNodePaths(root.left,path);
			if(root.right!=null)
			leafNodePaths(root.right,path);
	   }
	
	}

   public int noOfleafNodes(Node root) {
		
	   if(root==null)
		   return 0;
	   if(root.left==null&&root.right==null)
		   return 1;
	   else
		   return noOfleafNodes(root.left)+noOfleafNodes(root.right);	
	}
   
    public int noOfHalfNodes(Node root) {
		
 	   if(root==null)
 		   return 0;
 	   if(root.left==null&&root.right!=null)
 		   return 1;
 	  if(root.left!=null&&root.right==null)
		   return 1;
 	   else
 		   return noOfHalfNodes(root.left)+noOfHalfNodes(root.right);	
 	}
	
    public void levelOrderSpiral(Node root) {
    	
    	Node temp;
    	Stack stack1 = new Stack();
    	Stack stack2 = new Stack();
    	stack1.push(root);
    	while(!stack1.isEmpty()||!stack2.isEmpty())
    	{
    		while(!stack1.isEmpty())
    		{
    			temp = stack1.pop();
    	    	System.out.print(temp.data+" ");
    	    	if(temp.right!=null)
    	    	stack2.push(temp.right);
    	    	if(temp.left!=null)
        	    stack2.push(temp.left);
    	    	
    		}
    		while(!stack2.isEmpty())
    		{
    			temp = stack2.pop();
    	    	System.out.print(temp.data+" ");
    	    	if(temp.left!=null)
    	    	stack1.push(temp.left);
    	    	if(temp.right!=null)
        		stack1.push(temp.right);
    	    	
    		}
    		
    	}
    }
    
    public boolean isLeaf(Node root)
    {
    	if(root == null)
    		return false;
    	else if(root.left==null && root.right==null)
    		return true;
    	else
    		return false;
    }
    
    public boolean isSumTree(Node root)
    {
    	if(root==null || isLeaf(root))
    		return true;
    	if(isSumTree(root.left)&&isSumTree(root.right))
    	{
    		int ls=0,rs=0;
    		if(root.left==null)
    			ls=0;
    		else if(isLeaf(root.left))
    			ls=root.left.data;
    		else
    			ls=2*root.left.data;
    		
    		if(root.right==null)
    			rs=0;
    		else if(isLeaf(root.right))
    			rs=root.right.data;
    		else
    			rs=2*root.right.data;
    		
    		if(root.data == ls + rs)
    			return true;
    		else
    			return false;
    	}
    	else 
    		return false;
    }
    
    public int maxWidthUsingLevelOrder(Node root)
    {
    	if(root==null)
    		return 0;
    	Node temp;
    	Queue Q = new Queue();
    	Q.enQueue(root);
    	int size;
    	int tempSize;
    	int maxWidth = 0;
    	while(!Q.isEmpty())
    	{
        size = Q.size();
        tempSize = size;
    	while(size!=0)
    	{
    		temp = Q.deQueue();
    		if(temp.left!=null)
    		Q.enQueue(temp.left);
    		if(temp.right!=null)
    		Q.enQueue(temp.right);
    		size--;
    	}
    	if(tempSize>maxWidth)
    		maxWidth=tempSize;
    	}
		return maxWidth;
    	
    }
    
    public int maxWidth(Node root)
    {
    	int height  = maxHeight(root);
    	if(height<1)
    		return 0;
    	int[] count = new int[height];
        int maxWidth = 0;
    	for(int i=0;i<height;i++)
    		count[i]=0;
    	maxWidthUsingPreOrder(root, count, height-1);
    	for(int i=0;i<height;i++)
    	{
    		if(count[i]>maxWidth)
    			maxWidth = count[i];
    	}
    	return maxWidth;
    }
    
    public void maxWidthUsingPreOrder(Node root, int[] count, int level)
    {
    	if(root!=null)
    	{
    	count[level]=count[level]+1;
    	maxWidthUsingPreOrder(root.left, count, level-1);
    	maxWidthUsingPreOrder(root.right, count, level-1);
    	}
    }
    
    public void printAncestors(Node root, int key) {

    	if(root == null)
    		return;
    	Stack stack = new Stack();
    	while(true)
    	{
    		if(root!=null && root.data!=key)
    		{
    			stack.push(root);
    			root = root.left;
    		}
    		
    		if(root!=null && root.data==key)
    		{
    			stack.push(root);
    			break;
    		}
    			
    		
    		if(stack.top().right==null)
    		{
    			root = stack.pop();
    			
    			if(!stack.isEmpty() && stack.top().right == root)
    				root = stack.pop();
    		}
    		
    		root = stack.isEmpty()? null : stack.top().right;
    		
    	}
    	if(stack.isEmpty())
    	{
    		System.out.print(" -- Key not present -- ");
    		return;
    	}
    	while(!stack.isEmpty())
    	{
    		System.out.print("->"+stack.pop().data);
    	}
    	
    	
    }
    
    public Node lca(Node root, int n1, int n2) {
    	 	
    	if(root==null)
    		return null;
    	if(root.data == n1 || root.data == n2)
    		return root;
    	Node leftlca = lca(root.left, n1, n2);
    	Node rightlca = lca(root.right,n1, n2);
    	if(leftlca!=null && rightlca!=null)
    	{
    		return root;
    	}
    	
    	else if(leftlca==null)
    	{
    		return lca(root.right, n1, n2);
    	}
    	else
        return lca(root.left, n1, n2);
    	
    }
    
}


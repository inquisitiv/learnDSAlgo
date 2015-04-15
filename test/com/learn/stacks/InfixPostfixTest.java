package com.learn.stacks;

public class InfixPostfixTest {

	public static void main(String args[])
	{
		InfixToPostfix object = new InfixToPostfix();
        object.infixToPostfix("A*B-(C+D)");
        System.out.println();
        object.infixToPostfix("d/e*(c+2)");
	}
}

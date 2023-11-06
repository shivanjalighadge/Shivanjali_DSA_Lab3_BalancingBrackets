package BalancingBrackets;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		String expression;
	      int i, length;
	      char ch;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the String Input: ");
	      expression = s.next();
	      
	      Stack<Character> stack = new Stack<Character>();
	      length = expression.length();
	      
	      for(i=0; i<length; i++)
	      {
	         ch = expression.charAt(i);
	         if(ch=='(' || ch=='{' || ch=='[')
	         {
	            stack.push(ch);
	         }
	         else if(ch==')')
	         {
	            if(stack.isEmpty() || stack.pop() != '(')
	            {
	               System.out.println("Unbalanced Bracket String!");
	               return;
	            }
	         }
	         else if(ch=='}')
	         {
	            if(stack.isEmpty() || stack.pop() != '{')
	            {
	               System.out.println("Unbalanced Bracket String!");
	               return;
	            }
	         }
	         else if(ch==']')
	         {
	            if(stack.isEmpty() || stack.pop() != '[')
	            {
	               System.out.println("Unbalanced Bracket String!");
	               return;
	            }
	         }
	      }
	      if(stack.isEmpty())
	         System.out.println("Balanced Bracket String.");
	   }
	
	}


import  java.util.Stack;


//STACK ALGORITHM

public class stack {


    
    public static void main(String[] args) throws Exception {
      
    

//push to add to the top
//pop to remove from the top 
//stacl is a lifo data structure last in first out


    Stack<int> stack = new Stack<int>();
          stack.push(3);
          stack.push(4);
          stack.push(5);
     //     System.out.println(stack.empty()); // checks if the stack is empty outputs true or false
       int firstpop = stack.pop();
       int secondpop =       // removes first element in he stack
      //   System.out.println(stack.peek()); // peeks on the first element in the stack
        System.out.println(stack);
      
     
  
 

    }
}

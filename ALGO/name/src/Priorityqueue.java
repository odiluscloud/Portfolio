import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Collections;



public class Priorityqueue {

    public static void main (String argp[]){

     //Prirority queue a Fifo data structures that serves elements
      // with the highest priorities
      //before elements with lower priority
      //LinkedList just displays the queue in order
      //PriorityQueue displays the list in order of string eg: ABC or int eg:
      
    //PriorityQueue<>(Collections.reverseOrder()) reverse the list FROM ABC TO CABs

      Queue<String> queue  = new  PriorityQueue<>(Collections.reverseOrder());
        
      queue.offer("B");
      queue.offer("A");
      queue.offer("C");

      while(queue.isEmpty()){ // checks first if the queue is empty 
System.out.println(queue.poll()); // if it is empty itll remove all the items in the queue from firstto last and displays it

      }
      
System.out.println(queue.add( "e"));
      System.out.println(queue);





    }
}

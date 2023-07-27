import java.util.Queue;
import java.util.LinkedList;
//queue is fifo data structures // linear data structures 

//to enqueue  = offer()
//to dequeue = poll()
public class QUEUE {
    public static void main(String[] args){

 Queue<Integer> queue = new LinkedList<Integer>();
    queue.offer(10);
    queue.offer(100);
    queue.offer(200);

    int newpol = queue.poll();
    int i;
    //System.out.println(queue.peek()); peek() view the first in the line of queue
   //String firstq =  queue.poll(); // removes a element in the queue
   for(i = 5; i < newpol; i++){
    queue.add(10);
System.out.println(queue);


   }
    //  String secondq =  queue.poll(); 
     // String appended = firstq + " and " +  secondq + "is the first two in the queue";
    //  System.out.println(appended);
   // System.out.println(queue.isEmpty()); // checks is the queue is Empty
//System.out.println(queue.size());  //prints size of queue
//System.out.println(queue.contains("Mark")); //prints true or falls

   // System.out.println(queue); 
    

}
}
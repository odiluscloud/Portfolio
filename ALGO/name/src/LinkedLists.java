import java.util.Collections;
import java.util.LinkedList;


public class LinkedLists {
    public static void main(String args[]){
//you can treat Linkedlist as a stack using pop and push
//also you can treat is as a queue
             
LinkedList<Double> linkedList = new LinkedList<>();
linkedList.offer(4.5);
linkedList.offer(8.2);
linkedList.offer(9.9);
linkedList.offer(8.2);


linkedList.add(3, 1.1 );//add an item from the List by linkedList.add(3,"E") putting the index before the element that you want to palce it with

//linkedList.remove("d"); //remove and item from the List
//System.out.println(linkedList.indexOf("d")); //reveals the location of the item using index
//System.out.println(linkedList.getLast());
//System.out.println(linkedList.getFirst());
Double Myfirtlink =  linkedList.poll();
for(int i = 1; i< Myfirtlink; i--){
    linkedList.add(0, 4.5);
   System.out.println(linkedList);
   if(linkedList.size() == 4){
    


   }

 


}


System.out.println(linkedList);





    }
}



//LinkedList = stores Nodes in 2 parts (data + adress)
   //Nodes are in non-consecutive memory locations 
   //Elements are linked using pointers

     /*
      * 
                                      Single Linked List

                    Node                    Node                  Node
                [data|adress] ->       [data|adress] ->     [data|adress]    

                                      Doubly Linked List

                    Node                    Node                  Node
                [adress| data |adress] ->       [adress| data |adress] ->     [adress| data |adress]    
   
                advantages of linkedlist:
                1.Dynamic  Data Structures(allocates needed memory while running)
                2.Insertion and Deletuon of Nodes is easy. 0(1)
                3. Low to No memory Waste
                disadvatages:
                1.Greater memory usage(additional pointer)
                2.No random Access of elements (no index {i} means you cant use for loop only while loop)
                3.Accessign and searching of elements is more time consuming

                Uses:
                1.Implement Stacks/Queues
                2.Gps Navigation
                3.Music Playlist








      */

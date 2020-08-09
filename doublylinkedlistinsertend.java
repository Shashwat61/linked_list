import java.util.*;
class doublylinkedlist_endinsert
{   class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int m)
        {
            data=m;
            next=null;
            prev=null;
        }
    }
    Node head;
    public void insert(int ab)
    {   Node m =new Node(ab);
         if(head==null)
         {
             head=m;
             m.previous=null;
         }
         else{
               Node current=head;
               while(current.next!=null)
               {
                   curr=curr.next;
               }
               current.next=m;
               m.previous=current;
         }
    }
    public void disp()
    {
        Node current =head;
        if(current==null)
        {
            System.out.print("empty");
        }
        else
{
System.out.println("elements are:");
            while(current !=null)
            {
                System.out.print(current.data+ " ");
                current=current.next;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
 {
   Scanner sc= new Scanner(System.in);
   int n =sc.nextInt();
   doublelinkedlistendinsert in =new doublelinkedlistendinsert();
   for(int i=0;i<n;i++)
   {
           int b=sc.nextInt();
           in.insert(b);
   }
   sc.close();
   in.display();
 }
}
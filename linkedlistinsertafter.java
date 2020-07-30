import java.util.*;
class linkedlistinsertafter
{
    class Node
    {
        Node next;
        int dat;
        Node(int c)
        {
            dat=c;
            next=null;
        }
    }
    Node head;
    public void insert(int c)
    {
         Node element=new Node(c);
         if(head==null)
         {
           head=element;
         }
         else{
            Node last =head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=element;
         }
    }
    public void display()
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
   public void insertafter(int l,int position)
   {  Node element=new Node(l);
       Node current=head;
       int i=1;
       while(i<position)
       {
           current=current.next;
           i++;
       }
      element.next=curr.next;
      currrent.next=element;
   }
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        linkedlistinsertafter ob= new linkedlistinsertafter();
        for(int i=0;i<m;i++)
        {
            int element=sc.nextInt();
            ob.insert(element);
        }
        ob.display();
        System.out.println("enter element");
        int l=sc.nextInt();
        System.out.println("enter postion");
        int position=sc.nextInt();
        ob.insertafter(l,position);
        ob.display();
        sc.close();
    }
}

import java.util.*;
class linkedlistmerge
{   class Node
    {
      Node next;
      int dat;
      Node(int c)
      {
       
          dat=c;
        
          next=null;
      }
    
    }
    Node head1;
    Node head2;
    public void insert(int c)
    { 
      Node element =new Node(c);
      if(head1==null)
      head1=element;
      else{
        Node current=head1;
        while(current.next!=null)
        {
          current=current.next;
        }
        current.next=element;
      }
    }
    public void insert2(int c)
    { 
      Node element =new Node(c);
      if(head2==null)
      head2=element;
      else{
        Node current=head2;
        while(current.next!=null)
        {
          current=current.next;
        }
        current.next=element;
      }
    }
    public void merge()
    {
      Node current =head1;
      while(current.next!=null)
      {
        current=current.next;
      }
      current.next=head2;
    }
    public void display()
    {   
        System.out.println("elements after merging:-");
        Node current=head1;
        while(current.next!=null)
        {
            System.out.print(current.data +" ");
            current=current.next;
        }
        System.out.println(current.data);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      linkedlistmerge in=new linkedlistmerge();
      System.out.println("Enter the size of list1:-");
      int m=sc.nextInt();
      for(int i=0;i<m;i++)
      {
        int element=sc.nextInt();
        in.insert(element);
      }
      System.out.println("Enter size of list2:");
      int n2=sc.nextInt();
      for(int p=0;p<n2;p++)
      {
        int e=sc.nextInt();
        in.insert2(e);
      }
      in.merge();
      in.disp();
      sc.close();
    }
}

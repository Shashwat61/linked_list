import java.util.*;
class doublelinkedlistbegininsert
{   
    class Node
    {
        int dat;
        Node next;
        Node prev;
        Node(int c)
        {
            dat=c;
            next=null;
            prev=null;
        }
    }
    Node head;
    public void beginsert(int c)
    {   Node  element=new Node(c);
        
        if(head==null)
        {
            head=element;
            element.prev=null;
        }
        else{
            element.next=head;
            element.prev=null;
            head=element;
        }
    }
    public void display()
    {
        Node current=head;
        if(current==null)
        {
            System.out.print(" it is empty");
        }
        else{System.out.println("elements ");
            while(current !=null)
            {
                System.out.print(current.dat+ " ");
                current=current.next;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        doublelinkedlistbegininsert on=new doublelinkedlistbegininsert();
        for(int i=0;i<n;i++)
        {
            int l=sc.nextInt();
            on.beginsert(l);
        }
        sc.close();
        on.disp();
    }
}






class reverse_linked_list{
node head;
static class node{

int data;
node next;
node(int n){

data=n;
next=null;

}
}
boolean isEmpty(){

if(head==null)
{
return true;

}
else
{
return false;
}

}
   void insert(int data){
   
   node newnode= new node(data);
   if(head==null){
   head=newnode;
   return;
   
   }else{
   node temp=head;
   while(temp.next!=null){
   temp=temp.next;
   
   
   }
   temp.next=newnode;
   newnode.next=null;
   }
   }
   void display( ){
   
   if(head==null){
   System.out.println("it is empty");
   return;
    node temp=head;
   while(head!=null){
   
   System.out.println(temp.data);
   temp=temp.next;
   
   }
   }
   
   
   }
 void reverse(node n){
 
 if(n!=null)
{

reverse(n.next);
System.out.println(n.data+" ");

} 
 }
}

class reverselink{


public static void main(String [] args){
reverse_linked_list l1=new reverse_linked_list();
reverse_linked_list l2=new reverse_linked_list();
System.out.println("case 1");
l1.insert(1);
l1.insert(2);
l1.insert(3);
l1.insert(4);
l1.insert(5);
l1.reverse(l1.head);
System.out.println("case 1 completed");
System.out.println("case 2");
l2.insert(3);
l2.insert(4);
l2.insert(2);
l2.insert(5);
l1.reverse(l2.head);
}



}
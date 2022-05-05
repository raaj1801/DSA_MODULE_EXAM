import java.util.*;
class twostacks{
int arr[];
int size;
int top1;
int top2;


     twostacks(int n){
	 
	 size=n;
	 arr=new int[n];
	 top1=n/2+1;
	 top2=n/2;
	 }
	   void push1(int x)
	   {
	   if(top1>0)
	   {
	   top1--;
	   arr[top1]=x;
	   }
	   else
	   {
	   //System.out.println("stack overflow"+"by element:"+x+"\n");
	   return;
	   }
	   
	   }
	   void push2(int x){
	   
	   if(top2<size-1){
	   
	   top2++;
	   arr[top2]=x;
	   
	   }
	   else
	   {
	   //System.out.println("stack overflow"+"by element:"+x+"\n");
	   return;
	   }
	   
	   }
	   
	   int pop1()
	   {
	   if(top1<=size/2)
	   {
	   int x=arr[top1];
	   top1++;
	   return x;
	   }
	   else
	   {
	   System.out.println("stack overflow");
	   System.exit(1);
	   
	   
	   }
	   return 0;
	   }
	   int pop2(){
	   
	   if(top2>=size/2+1)
	   {
	   
	   int x=arr[top2];
	   top2--;
	   return x;
	   
	   }
	   else
	   {
	   System.out.println("stack overflow");
	  System.exit(1);
	   
	   
	   
	   }
	   return 1;
	   }
	   
	   
}
class ques3{

public static void main(String [] args){

twostacks t=new twostacks(6);
       t.push1(5);
       t.push2(10);
	   t.push2(15);
	   t.push1(11);
	   t.push2(7);
	   t.push2(40);
	   
	   System.out.println("popped element from stack1 is"+":"+t.pop1()+"\n");
	   
	   
	   System.out.println("popped element from stack2 is"+":"+t.pop2()+"\n");
	   
   }

}
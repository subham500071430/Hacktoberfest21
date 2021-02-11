class Stacks
{
    // sq is the object of class TwoStack

    /* The method push to push element into the stack 2 */
    void push1(int x, TwoStack sq)
    {
        sq.top1+=1;
        sq.arr[sq.top1]=x;
    }

    /* The method push to push element into the stack 2*/
    void push2(int x, TwoStack sq)
    {
        sq.top2-=1;
        sq.arr[sq.top2]=x;
    }

    /* The method pop to pop element from the stack 1 */
    //Return the popped element
    int pop1(TwoStack sq)
    {
        if(sq.top1==-1){
            return -1;
        }
        int data1=sq.arr[sq.top1];
        sq.arr[sq.top1]=0;
        sq.top1-=1;
        return data1;
    }

    /* The method pop to pop element from the stack 2 */
    //Return the popper element
    int pop2(TwoStack sq)
    { 
        if(sq.top2==sq.size){
            return -1;
        }
        int data2=sq.arr[sq.top2];
        sq.arr[sq.top2]=0;
        sq.top2+=1;   
        return data2;
    }
}

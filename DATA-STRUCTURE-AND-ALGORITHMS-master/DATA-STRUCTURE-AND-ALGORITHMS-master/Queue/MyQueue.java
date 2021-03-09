public class MyQueue {
    Person arr[];
    int Size;
    int Capacity;
    int front;
    int rear;
    public MyQueue(int Capacity){
        this.Capacity=Capacity;
        arr = new Person[Capacity];
        Size=0;
        front=-1;
        rear=-1;
    }
    public void EnQueue(Person item){
        if(Size != Capacity){
            rear++;
            arr[rear]=item;
            if(front==-1){
                front=0;
            }
            Size++;
        }
    }
    public void DeQueue(){
        if(Size !=0){
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            Size--;
        }
    }
    
}


public class CircularQueue {
    Person arr[];
    int Size;
    int Capacity;
    int front;
    int rear;
    public CircularQueue(int Capacity){
        this.Capacity=Capacity;
        arr = new Person[Capacity];
        Size=0;
        front=-1;
        rear=-1;
    }
    public void EnQueue(Person item){
        if(Size==Capacity){
            System.out.println("OVERFLOW");
        }else{
            if(rear==front-1 && Size==0){
                front=-1;
                rear=-1;
              
                }
                rear=(rear=1)%Capacity;
                arr[rear]=item;
                Size++;
                if(front==-1){
                    front++;
            }
        }
       
    }
    public void DeQueue(){
        if(Size==0){
            System.out.println("UNDERFLOW");

        }else{
            arr[front]=null;
            front=(front+1)%Capacity;
            Size--;

        }
    }

    
}
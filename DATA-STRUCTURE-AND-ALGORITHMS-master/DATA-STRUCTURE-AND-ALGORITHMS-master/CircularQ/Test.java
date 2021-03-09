public class Test {
    public static void main(String[]args){
        Person P1= new Person("Urmi",10);
        Person P2= new Person("Shalini",20);
        Person P3= new Person("Sweta",30);
        Person P4= new Person("Baby",41);
        Person P5= new Person("Tara",53);
        CircularQueue obj=new CircularQueue(4);
        obj.EnQueue(P1);
        obj.EnQueue(P2);
        obj.DeQueue();
        obj.DeQueue();
        obj.DeQueue();
        obj.EnQueue(P3);
        obj.EnQueue(P4);
        obj.EnQueue(P5);
        obj.DeQueue();
        obj.EnQueue(P1);
    }
    
}
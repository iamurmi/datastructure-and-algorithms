public class Test {
    public static void main(String[] args) {
        Person p1=new Person("Urmi", 10);
        Person p2 = new Person("Shalini", 20);
        Person p3=new Person("Sweta", 33);
        Person p4=new Person("Baby", 44);
        Person p5=new Person("Tara", 51);
    
        MyStack obj=new MyStack(8);
        obj.push(p1);
        obj.show();
        obj.push(p2);
        obj.show();
        obj.pop();
        obj.show();
        obj.push(p3);
        obj.show();
        obj.push(p4);
        obj.show();
        obj.push(p5);
        obj.show();
        obj.pop();
        obj.show();
    }
    }
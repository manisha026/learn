import java.util.*;
class Variable{
    int id;
    String name;
    int street;
    Variable(int id, String name, int street){
        id=id;
       this.name=name;
        street=street;
    }
    void display(){
        System.out.println(" "+id+ "  "+name+"  "+street);
    }
    public static void main(String args[]){
        Variable vr1=new Variable(20,"manisha",32);
        Variable vr2=new Variable(26,"thakur",30);
        vr1.display();
        vr2.display();
    }
}
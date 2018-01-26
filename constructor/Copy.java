import java.util.*;
class Copy{
    int id;
    String name;
    Copy(int i, String n){
        id=i;
        name=n;
    }
    Copy(Copy c){
        id=c.id;
        name=c.name;
    }
    void display(){
        System.out.println("id is "+id+ " name " +name);
    }
    public static void main(String args[]){
        Copy c1=new Copy(12,"manisha");
        Copy c2=new Copy(c1);
        c1.display();
        c2.display();
    }
}
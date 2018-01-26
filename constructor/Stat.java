import java.util.*;
class Stat{
    int id;
    String name;
   static String coll="CGC";
    Stat(int i, String n, String c){
    id=i;
    name=n;
}
void display(){
    System.out.println(" "+id+ " "+name+" "+coll);
}
public static void main(String args[]){
    Stat obj=new Stat(20,"manisha");
    Stat obj1=new Stat(26,"thakur");
    obj.display();
    obj1.display();
}
}
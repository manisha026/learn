import java.util.*;
class Static_Method{
    int id;
    String name;
   static String coll="CGC";

     Static_Method(int i,String n){
        id=i;
        name=n;
    }
    static void change(){
        coll="CEC";
    }
    void display(){
        System.out.println(" "+id+ " "+name+ " "+coll);
    }
    public static void main(String args[]){
        Static_Method obj=new Static_Method(26,"manisha");
        Static_Method obj1=new Static_Method(9,"kavita");
        Static_Method obj2=new Static_Method(1,"mahima");
        Static_Method.change();
        obj.display();
        obj1.display();
        obj2.display();
    }
}
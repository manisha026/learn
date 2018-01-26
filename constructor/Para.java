import java.util.*;
class Para{
    int id;
    String name;
    int age;
         Para(int i, String n){
        id=i;
        name=n;
   }
     Para(int i, String n, int a){
        id=i;
        age=a;
        name=n;}
        void display(){
        System.out.println("id "+id+ " name "+name+ " age "+age);
    }
    public static void main(String args[]){
        Para p=new Para(20,"manu");
        Para p1=new Para(26,"manisha",21);
        p.display();
        p1.display();
    }
}
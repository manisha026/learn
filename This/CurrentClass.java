import java.util.*;
class CurrentClass{
    CurrentClass(){
    this(26);
        System.out.println("hello");
    }
    CurrentClass(int x){
    System.out.println(x);
}
public static void main (String args[]) {
 CurrentClass c=new CurrentClass();   
}
}
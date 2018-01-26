import java.util.*;
class Method{
    void first(){
        System.out.println("this is first method");
    }
    void second(){
        third();
        System.out.println("this is second method");
    }
    void third(){
        System.out.println("this is third method");
    }
    public static void main(String args[]){
        Method m=new Method();
        m.second();
    }
}
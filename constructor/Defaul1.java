import java.util.*;
class Defaul1{
    int id;
    String name;
    void entry(){
        System.out.println(id+ "  " +name);
    }
    public static void main(String args[]){
        Defaul1 c1=new Defaul1();
        Defaul1 c2=new Defaul1();
        c1.entry();
        c2.entry();
    }
}
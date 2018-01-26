import java.util.*;
class AsArgu{
    void m(AsArgu aa){
        System.out.println("m is invoked");
    }
    void n(){
        m(this);
    }
    public static void main(String args[]){
        AsArgu a=new AsArgu();
        a.n();
    }
}
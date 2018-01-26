import java.util.*;
interface Bank{
    public void cash();
    
}
class Frame{
    public void fly(){
        System.out.println("it is a  parent class");
    }
}
class Child extends Frame implements Bank {
    public void fly(){
        System.out.println("extend the features of frame parent class");
    }

    public void cash(){
        System.out.println("extends the features of Bank");
    }
}
class Test extends Child{
    public void cash(){
        System.out.println("test function");
        System.out.println("child function");
    }
    public static void main(String args[]){
      /*  Bank obj=new Test();
        Frame obj1=new Child();*/
       // Bank obj2=new Child();
        Test t=new Test();
        t.cash();
        t.fly();

      /* obj.cash();
       obj1.fly();*/
       //obj2.cash();
    }
}
import java.util.*;
class Single{
    int id, height;
   public void getdata(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the id and height of person:");
        id=s.nextInt();
        height=s.nextInt();
    }
   public void showdata(){
        System.out.println("id is "+ id + " height " + height);
    }
}
class Singl extends Single{
    String name, loc;
    public void enterdata(){
        Scanner c=new Scanner(System.in);
        System.out.println("enter the name and location of person:");
        name=c.nextLine();
        loc=c.nextLine();
    } 
    public void display(){
        System.out.println("name is " + name + " location " + loc);
    }
    public static void main(String args[]){
        Singl obj=new Singl();
        obj.getdata();
        obj.enterdata();
        obj.showdata();
        obj.display();
    }
}
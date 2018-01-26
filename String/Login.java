import java.util.*;
class Login{
    void getdata(){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the user name and password: ");
    String name=s.next();
    String password=s.next();
    if(name.equals("Manisha")&& password.equals(myfamily123)){
        System.out.println("successfully login");
    }
}
public static void main(String args[]){
    Login l=new Login();
    l.getdata();
}
}
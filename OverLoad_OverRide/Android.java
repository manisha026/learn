import java.util.*;
interface Basic{
    public void first();
    
}
class Cplus{
    public void second(){
        System.out.println("it is enhanced version of c language");
    }
}
class Javaa extends Cplus implements Basic{
    public void third(){
        System.out.println("it is object oriented based language");
    }
    public void first(){
        System.out.println("it is a method of basic class");
    }
}
class Android extends Javaa{
    public void fourth(){
        System.out.println("android is linux based operating system");}
    public void third(){
        System.out.println("method of javaa");
    }
    public static void main(String args[]) {
        //Cplus c=new Javaa();
        //Basic a=new Javaa();
        //Cplus j=new Javaa();
        //Cplus c=new Android();
        Android a=new Android();
        a.first();
        //c.second();
        //j.second();
        //c.second();
        //a.fourth();       
    }
}

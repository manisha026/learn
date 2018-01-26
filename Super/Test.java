import java.util.*;
class Graduation{
    int cse;
    Graduation(int x){
        System.out.println("this is a graduation constructor "+x);
    }
    void btech(){
        System.out.println("its a technical degree");
    }
}
class PostGraduation extends Graduation{
    PostGraduation(){
        super(4);
        System.out.println("this is a post graduation degree");
        System.out.println(super.cse);
    }
    public void btech() {
        System.out.println("technical degree");
    }
}
class Test{
    public static void main(String args[]) {
        PostGraduation p=new PostGraduation();
        p.btech();
       
    }
}
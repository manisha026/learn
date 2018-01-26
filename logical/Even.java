import java.util.*;
class Even{
    void odd(){
        Scanner sc=new Scanner(System.in);
                for(int i=1;i<=10;i++){
             if(i%2==0){
                System.out.println("even numbers are: "  +i);
             }
        }
    }
    public static void main(String args[]){
        Even obj=new Even();
        obj.odd();
    }
}

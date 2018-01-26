import java.util.*;
class Pattern{
    void run(){
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>i;j--){
                System.out.println(j+1);
            }
            System.out.print(" ");
        }
    }
    public static void main(String args[]){
        Pattern obj=new Pattern();
        obj.run();
    }
}
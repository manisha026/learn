import java.util.*;
class One{
    void show(){
    for(int i=1;i<=5;i++){
        for(int j=5;j>=i;j--){
            System.out.print(" 8 ");
        }
        System.out.println();
    }
}
    public static void main(String args[]){
        One obj=new One();
        obj.show();
    }
}
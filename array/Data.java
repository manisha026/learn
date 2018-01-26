import java.util.*;
class Data{
    void getdata(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size=s.nextInt();
        int a[]=new int[size];
        System.out.println("enter the elements: ");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.println("here is ur array: ");
        for(int i=0;i<size;i++){
        System.out.print("  "+a[i]+"  ");
        }
        System.out.println( );
        System.out.println("your odd index value is: ");
        for(int i=0;i<size;i++){
            if(i%2!=0){
                System.out.print("  "+a[i]+"  ");
            }
        }
        System.out.println( );
        System.out.println("your odd index is: ");
        for(int i=0;i<size;i++){
            if(i%2!=0){
                System.out.print("  "+i+"  ");
            }
        }
        System.out.println(  );
        System.out.println("your value: ");
        for(int i=0;i<size;i++){
            if(a[i]==3){
                System.out.println("  "+a[i]+"  ");
            }
        }
        System.out.println(  );
        System.out.println("which value you want to search from array: ");
        int search_value=s.nextInt();
        int b[]=new int[50];
        for(int i=0;i<size;i++){
            if(a[i]==search_value){
                b[i]=a[i];
                System.out.println("your search value is "+a[i]+"  ");
            }
        }
        System.out.println(  );
        System.out.println("multiple of 2 are: ");
        for(int i=0;i<size;i++){
            if(a[i]%2==0){
                System.out.print("  "+a[i]+"  ");
            }
        }
        System.out.println(  );
        System.out.println("which multiple you want to show");
        int c=s.nextInt();
        for(int i=0;i<size;i++){
            if(a[i]%c==0){
                System.out.print("   "+a[i]+"   ");
            }
        }
    }
    public static void main(String args[]){
        Data d=new Data();
        d.getdata();
    }
}
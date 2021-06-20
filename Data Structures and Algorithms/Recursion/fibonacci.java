package Practice;

 class fibo {
  static int n1=0;
   static int n2=1;
   static int sum=0;

    static void  series(int a){
        if(a>0){
        sum=n1+n2;  //0+1=1 
        n1=n2;     //n1=1 
        n2=sum;   // n2=1
        System.out.print(" "+sum);
        series(a-1);
        }
    }
}
public class fibonacci{
    public static void main(String[] args) {
        System.out.print(fibo.n1+ " "+fibo.n2);
        fibo.series(10);

    }
}

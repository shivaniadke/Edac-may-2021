package Array;

public class Insertion {
    
    public static void main(String[] args) {
        int []a={10,20,30,40,50};             
        int ele=66;
        int pos=2;//i=2

        for(int i=a.length-2;i>=2;i--)          
        {
            a[i+1]=a[i];
    
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);    
        }
        
    }
    
}

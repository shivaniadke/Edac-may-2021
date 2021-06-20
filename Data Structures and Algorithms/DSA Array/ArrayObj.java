package Array;
public class ArrayObj {
    static int count=0;
    String name;
    int id;
  static ArrayObj arr[]=new ArrayObj[5];

    static void insert(){
        ArrayObj obj1 = new ArrayObj();
        obj1.id=5;
        obj1.name="Shivani";
        arr[count]=obj1;
        count++;
        
    }

    //from this block we have executed string comparision by search method
    static void search(String s){
        boolean b=false;

        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i].name.equals(s))  //string comparision
           // System.out.println("FOUND");
           b = true;
        }if (b)
        System.out.println("FOUND");
        else
        System.out.println("NOT FOUND");
    }
    public static void main(String[] args) {
    for(int i=0;i<5;i++)
    {
        ArrayObj obj1 = new ArrayObj();
        obj1.id=5;
        obj1.name="Shivani";
        arr[i]=obj1;
    }
    search("Shivani");
    search("Shabaz");
}
}


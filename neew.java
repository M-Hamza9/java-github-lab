import java.util.ArrayList;
class A{
    public int arr(int[] array){
        int l = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i]>l){
                l=array[i];
            }
        }
        return l;

    }
}
public class neew {
    static void main(String[] args) {
        int[] array = {1,3,2,4,7};
        A a1 = new A();
        System.out.println(a1.arr(array));

        String a = "hamza";
        String b = new String("hamza");
        System.out.println(a==b);
        System.out.println(a.equals(b));

        int[] n = {12,56,15,18,55};
        int[] m = new int[3];
        m[0]=12;
        m[1]=23;
        m[2]=45;



        
        int l = n[0];
        for(int i=0; i<n.length-1; i++ ){
            if(n[i]>l){
                l=n[i];
            }
        }
        System.out.println(l);
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(13);
        System.out.println(number);
    }
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        if(b== 0) {
            System.out.println("Cannot Divide by 0");
            }else{
            int c = a/b;
            System.out.println(c);
        }

        ArrayList <Exception> wrongThings = new ArrayList<Exception>();

        try {
            int d = -31;
            int e = 0;
            int f = d / e;

            System.out.println(f);
        }catch(Exception e){
            wrongThings.add(e);

        }

        int[] ints = new int[](3, 2 ,1);

        try {
            int g = ints[90];
        }catch(Exception e) {

            System.out.println("Does not exist in array");
        }finally{
            System.out.println("Catch Block is Done");

        }

    }
}

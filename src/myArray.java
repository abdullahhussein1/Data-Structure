import java.util.Scanner;

public class myArray {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] setA = {1,2,3,4};
        int[] setB = {6,5,2,1};

        int min =setA.length+setB.length;
//        ArrayList<Integer> interSection = new ArrayList<>();
        int[] uni = new int[min];
        int count=setA.length;
        for (int i=0 ; i<setA.length ; i++) {
            uni[i]=setA[i];
        }
        for(int i=0 ; i<setA.length ; i++){
            for (int j = 0; j <setB.length ; j++) {
                if (setA[i]==setB[j]) {
                   break;
                }
                uni[++count] = setB[j];
            }
        }



        for (int i: uni)
            if (i!=0)
                System.out.print(i+" ");

//        System.out.println(interSection);




    }




}

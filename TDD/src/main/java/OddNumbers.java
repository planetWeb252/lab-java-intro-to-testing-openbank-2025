import java.util.ArrayList;
import java.util.Arrays;

public class OddNumbers {
    public static ArrayList<Integer> getOddNumbers(int number){
        // create array whit size number
        ArrayList<Integer> oddNumbers=new ArrayList<>();

        for (int i=0; i<number;i++){
            if (i%2!=0){
                oddNumbers.add(i);

            }
        }
        return oddNumbers;
    }


    public static void main(String[] args) {
        ArrayList<Integer>myarr=getOddNumbers(10);
        System.out.println(myarr);
    }




}

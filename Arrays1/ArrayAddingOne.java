
import java.util.ArrayList;
import java.util.Collections;

public class ArrayAddingOne {
    public static void main(String[] args) {

        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);

        for (int i = arr.size()-1; i>=0;i--) {
            if (arr.get(i)+carry<=9) {
                ans.add(arr.get(i)+carry);
                carry = 0;
            }
            else  {
                ans.add(0);
                carry = 1;

            }            
        }
        if (carry==1) ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);

    }

}

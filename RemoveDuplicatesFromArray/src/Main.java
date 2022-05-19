import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int[] removeDuplicates(int[] num) {
        List<Integer> uniqueList = new ArrayList<Integer>();

        for (int j = 0; j < num.length; j++) {
            if (!uniqueList.contains(num[j]))
                uniqueList.add(num[j]);
        }
        System.out.println("unique list size : " + uniqueList.size());

        return uniqueList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void printArray(int[] num) {
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        printArray(removeDuplicates(new int[] {1,1,1,1,2,2,4,5,6,5,4,2,8,3,4,1}));
    }
}

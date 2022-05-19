public class Main {

    public static String modifiedString(String str) {
        int firstIndexOfNum = -9999, lastIndexOfNum = -9999;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (firstIndexOfNum < 0)
                    firstIndexOfNum = i;
                else if (firstIndexOfNum >= 0)
                    lastIndexOfNum = i;
            }
        }

        String intStr = str.substring(firstIndexOfNum, lastIndexOfNum + 1);
        System.out.println("integer string : " + intStr);
        intStr = String.valueOf(Integer.parseInt(intStr) + (Integer.parseInt(intStr) * 0.1));
        System.out.println("integer string after adding : " + intStr);

        return str.substring(0, firstIndexOfNum) + intStr + str.substring(lastIndexOfNum + 1);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(modifiedString("abc560mop"));
        System.out.println(modifiedString("abc560"));
        System.out.println(modifiedString("560abc"));
    }
}

package fluffy.cat;
public class Main {
    public static void main(String[] args) {
        String[] array= {"abc", "abd", "def", "acf", "afx", "abc"};
        Integer[] arrayInt = {34, 56, 78, 34, 3, 34, 34};

        ArrayAndElements search = ((arr, str) -> {
            int count =0;
            for (int i =0; i < arr.length; i++) {
                if(arr[i] == str) {
                    count++;
                }
            }
            return count;
        });
        
        int count = search.findCountEntryElement(array, "abc");
        int count2 = search.findCountEntryElement(arrayInt, 34);

        System.out.println(count);
        System.out.println(count2);
    }
}
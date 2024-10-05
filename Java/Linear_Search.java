public class Linear_Search {
    public static void main(String[] args) {
        
        // linear search = iterative through collection one element at a time .. time complexity is O(N)
        int [] array = {5, 1, 9, 2, 6, 4, 3, 0};

        int index = linearSearch(array, 1);

        if (index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found at index");

        }
    }

    private static int linearSearch(int[] array, int value){

        for (int i = 0; i < array.length; i++){
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
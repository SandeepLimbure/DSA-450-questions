import java.util.Arrays;

// SORTING AN ARRAY WITHOUT USING ANY SORTING ALGORITHM.
public class ARRAYSORTING {
    public void sort(int []array){
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int []numbers = {2,0,1};
        var sorter = new ARRAYSORTING();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        }
    }


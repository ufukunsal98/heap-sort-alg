import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ufuk Remzi Ünsal
 */
public class HeapSort {



    public static   void main(String[] args) {
        HeapSortUtil heapSortAlg = new HeapSortUtil();
        int[] array = {};
        List<Integer> arrayInput  = new ArrayList<>();
        int input = 0;
//        while (input != -1) {
//            System.out.print("Bir sayı giriniz (Çıkmak için -1 tuşuna basınız) : ");
//            Scanner scanner = new Scanner(System.in);
//            input = scanner.nextInt();
//            if(input != -1) arrayInput.add(input);
//            System.out.println(" ");
//        }
//        array = new int[arrayInput.size()];
//        for(int i = 0; i< arrayInput.size(); i++) {
//            array[i] = arrayInput.get(i);
//        }// 70 60 10  50 40 80
        array = new int[]{5, 60, 24, 48, 98, 80,38,44};
        System.out.println(5/2);
        System.out.println("Dizinin Sıralanmamış hali : " + Arrays.toString(array));
        System.out.println("-------------------------------------\n");
        heapSortAlg.heapSort(array , array.length);
    }
}

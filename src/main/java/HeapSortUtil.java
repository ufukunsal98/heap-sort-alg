import java.util.Arrays;

/**
 * @author Ufuk Remzi Ünsal
 */
public class HeapSortUtil {
    int largest = 0;

    public  void heapRebuild(int root ,  int[] items , int itemCount) {
        if(((2 * root) + 1) <= itemCount && items[((2 * root) + 1)] > items[root]) { // sol çocuk için kıyaslama
            largest = ((2 * root) + 1);
        }
        else {
            largest = root;
        }
        if (((2 * root) + 2) <= itemCount && items[((2 * root) + 2)] > items[largest]) {
            largest = ((2 * root) + 2);
        }
        if(largest != root) {
            int temp = items[root]; // geçici deger //swap
            items[root] = items[largest]; //swap
            items[largest] = temp; // swap
            heapRebuild(largest , items , itemCount);
        }
        else {
            return;
        }
    }

    public   void heapSort (int[] anArray ,int n) {
        int realSize = n;
        for(int index = n / 2; n >= 0; n--) {
            index = n / 2;
            heapRebuild(index , anArray , realSize - 1);
        }
        int temp = anArray[0];
        int size = anArray.length;
        anArray[0] = anArray[size - 1];
        anArray[size-1] = temp;
        int heapSize = size-1;
        while (heapSize > 1 ) {
            heapRebuild(0 , anArray , heapSize - 1);
            temp = anArray[0];
            anArray[0] = anArray[heapSize - 1];
            anArray[heapSize -1] = temp;
            heapSize--;
        } // 70 60 10  50 40 80

        System.out.println("Dizinin Sıralanmış hali :");
        System.out.println("-------------------------------------\n");
        System.out.println(Arrays.toString(anArray));
    }
}

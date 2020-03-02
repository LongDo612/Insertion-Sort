public class main {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=0; i<a.length;i++){
            a[i] = (int) Math.floor(Math.random()*40);
        }

        for (int i:a) {
            System.out.print(i+ "\t");
        }

        System.out.println("\n\n");

        insertionSort(a);

        for (int i: a) {
            System.out.print(i+ "\t");
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }
}

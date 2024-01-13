public class P40 {
    public static void main(String[] args) {

        int[] a = {10, 23, 34, 45, 61, 75, 25, 17};
        int l = 0;
        int h = a.length - 1;
        int key = 55;
        boolean flag = false;

        while (l <= h) {
            int m = (l + h) / 2;

            if (a[m] == key) {
                System.out.println("Element Found ");
                flag = true;
                break;
            }

            if (a[m] < key) {
                l = m + 1;
            }

            if (a[m] > key) {
                h = m - 1;
            }
        }

    if(!flag){
        System.out.println("Element Not found");
    }
    }
}

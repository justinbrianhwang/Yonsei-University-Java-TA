public class QuickSortOverload {

    // 기본 퀵소트 메서드 (오버로딩)
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1); // 전체 배열을 정렬
    }

    // 부분 배열에 대해 퀵소트를 수행하는 메서드
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1); // 왼쪽 부분 정렬
            quickSort(arr, pi + 1, high); // 오른쪽 부분 정렬
        }
    }

    // 파티션 메서드
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // 배열을 출력하는 메서드 (오버로딩)
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 오버로딩된 printArray (배열의 일부분만 출력)
    public static void printArray(int[] arr, int low, int high) {
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("주어진 배열:");
        printArray(arr);  // 전체 배열 출력

        quickSort(arr);  // 전체 배열 정렬

        System.out.println("정렬된 배열:");
        printArray(arr);  // 전체 배열 출력

        System.out.println("일부 배열(1번 인덱스부터 4번 인덱스까지) 출력:");
        printArray(arr, 1, 4);  // 배열의 일부 출력
    }
}

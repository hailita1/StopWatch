public class Main {
    public static void selectionSort(double[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            if (min != i) {
                double temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        double arr[] = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100000;
        }
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Thoi gian thuat toan chay: " + stopWatch.getElapsedTime());

    }
}
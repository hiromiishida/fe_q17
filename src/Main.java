public class Main {
    public static void main(String[] args) {
        int[] data = {45, 20, 10, 30, 5, 50, 15, 25, 35, 40, 0};

        search(data, 30);
    }

    private static void search(int[] data, int value){
        Util util = new Util();
        data = util.sort(data);

        int left = 0;
        int right = data.length - 1;

        while (left < right) {
            int middle = (left+right)/2;
            if (data[middle] == value) {
                System.out.println(value+"は"+(middle+1)+"番目です");
                break;
            } else if (data[middle] > value) {
                right = middle - 1;
            } else if (data[middle] < value) {
                left = middle + 1;
            }
        }
    }
}
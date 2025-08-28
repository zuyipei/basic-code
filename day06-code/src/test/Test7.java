package test;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArr = copyOfRaneg(arr, 2, 6);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    //⚠️是int[]
    public static int[] copyOfRaneg(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        //⚠️伪造索引思想
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}

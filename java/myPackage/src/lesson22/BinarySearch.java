package lesson22;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,6,8,23,46,65};
        int length= arr.length;
        int step=0;
        int mid=(arr.length)/2;
        int find=23;
        for (int i = 0; i < length; i++) {
            if (find > arr[mid]) {
                step++;
                i=mid+1;
                mid=(mid+length)/2;
            } else if (find<arr[mid]) {
                step++;
                length=mid-1;
                mid=length/2;
            }else{
                step++;
                System.out.println(i);
            }

        }System.out.println(step);

    }

}

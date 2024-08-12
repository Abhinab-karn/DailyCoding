//Check the array is shorted
public class ShortedArray {

    public  String ArrayShort(){
        int arr[] ={2,1,2,4,5,67,8};
        for (int i=1;i<arr.length;i++) {
            if (arr[i] >= arr[i - 1]) {
                return "Not Sorted Array";
            }
        }

            return "Shorted Array";
        }



    public static void main(String[] args) {
        ShortedArray sa=new ShortedArray();
        sa.ArrayShort();
        System.out.println(sa.ArrayShort());
    }
}

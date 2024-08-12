public class SecondLargElementInArray {
    public void SecLargest(){
        int arr[]={2,5,9,1,5,8};
        int largestElem=arr[0];
        int smallElement=-1;
        for(int i=1;i<arr.length;i++){
            if (arr[i]>largestElem){
                largestElem=arr[i];
                smallElement=largestElem;
            }
        }
        System.out.println(smallElement);
    }

    public static void main(String[] args) {
        SecondLargElementInArray sl = new SecondLargElementInArray();
        sl.SecLargest();
    }
}

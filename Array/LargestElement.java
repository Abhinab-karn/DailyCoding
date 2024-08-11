public class LargestElement {
    int arr[] ={22,33,44,555,66,77,88};
    int largest=arr[0];
   public void LargElem(){
       for (int i=1; i<arr.length; i++) {
           if (largest<arr[i]){
               largest=arr[i];
           }
       }
       System.out.println(largest);

    }

    public static void main(String[] args) {
        LargestElement le = new LargestElement();
   le.LargElem();
   }
}

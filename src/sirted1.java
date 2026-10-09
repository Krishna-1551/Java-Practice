public class sirted1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i+1]+    " index "+(i+1));

            }
        }
    }
}

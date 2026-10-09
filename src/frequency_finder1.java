public class frequency_finder1 {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,1,1};
        int[] freq=new int[101];

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>freq[max]){
                max=i;
            }
        }
        System.out.println("Index : "+ freq[max]+" "+ max);
    }
}

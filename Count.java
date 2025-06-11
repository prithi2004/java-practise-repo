public  class Count{
    public static void main(String[] args){
        int[] arr={1,3,4,4,5,6,7};
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==4){
                count++;
            }
            System.out.print(count);
        }
    }
}
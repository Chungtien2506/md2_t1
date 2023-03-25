public class Bai2 {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i= 0;i< array.length;i++){
            sum += array[i];
        }
        System.out.println( "tong cac phan tu trong mang la:"+sum);
        int max = 0;
        for (int i = 0;i<array.length;i++){
            if(array[i]>max)
                max = array[i] ;
        }
        System.out.println("phan tu lon nhat trong mang la:"+max);
    }

}

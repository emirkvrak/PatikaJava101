package dizidekielemandanbuyukkucuk;

import java.lang.reflect.Array;
import java.util.Arrays;


public class DizidekiElemandanBuyukKucuk {

    
    public static void main(String[] args) {

    int dizi[]={15,13,788,1,-1,778,4,0};
        sayidanBuyukKucuk(5,dizi);

    }

    static void sayidanBuyukKucuk(int num,int[] dizi){
        
        int arr[] = dizi;
        Arrays.sort(arr);
        
        int max=0,min = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (num<arr[i]) {
                max = arr[i];
                break;
            }else
                max=num;
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if (num>arr[i]) {
                min=arr[i];
                break;
            }else
                min=num;
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
        System.out.println(min+"<"+num+"<"+max);
        

    }
    
}

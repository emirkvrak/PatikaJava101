package dizidekielemanlarinfrekansi;

import java.util.Arrays;


public class DizidekiElemanlarinFrekansi {

    
    public static void main(String[] args) {
        
        int sayac,hafiza;
        
        
        int[] list = {1,2,-2,6,3,4,7,7,2,3,8,-2,8,4,3,4,6,4,5};
        Arrays.sort(list);
        
        
        for (int i = 0; i < list.length; i = i + hafiza) {
            sayac=1;
            hafiza=1;
            for (int j = i+1; j < list.length; j++) {
                
                if ((list[i] == list[j])) {
                    sayac++;
                }else{
                    break;
                }
                hafiza = hafiza + 1 ;
            }
            System.out.println(list[i] + " sayısı " + sayac + " kere tekrar edildi.");
        }

        
        
    }
    
}

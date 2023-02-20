package tekraredenciftsayilar;


public class TekrarEdenCiftSayilar {

    
    public static void main(String[] args) {
        
        int[] list = {3,8,2,4,2,9,10,4,1,33,8,1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                
                if ((i != j) && (list[i] == list[j] && (list[i]%2==0))) {
                    if (!isFind(duplicate,list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
        
    }
    
    public static boolean isFind(int[] arr, int value){
        
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
        
}

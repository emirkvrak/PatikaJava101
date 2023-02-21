
package mayintarlasioyunu;

import java.util.Random;
import java.util.Scanner;


public class MineSweeper {
    
    
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
     
    int rowNumber;
    int colNumber;
    int[][] map;
    int[][] board;
    int size;
    int bomb;
    boolean isWin = true;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        
        this.size = rowNumber*colNumber;
        this.bomb = this.size / 4;
    }
    
    public void run(){
        int row,col;
        bomb();
        //printAnswer(map);//Cevap anahtarını cağırır
        System.out.println("***Oyun Basladi***");
        
        while (isWin) {            
            int success=0;
            print(board);
            System.out.println("Lutfen 1 ile " + (rowNumber)+ " arasi satir numarasini gir");
            row = input.nextInt();
            row--;
            System.out.println("Lütfen 1 ile " + (colNumber)+ " arasi sutun numarasini gir");
            col = input.nextInt();
            col--;
            if(row<0 || row>=rowNumber || col<0 || col>=colNumber){
                System.out.println("Lütfen geçerli bir satır girin!");
                continue;
            }
            
            if(map[row][col]!=-1){
                System.out.println("girdi 1");
                mayinKotrol(row,col);
                System.out.println("girdi 2");
                success++;
                if(success==size-bomb){
                    System.out.println("Tebrikler!");
                }
            }else{
                isWin = false;
                System.out.println("Mayina Bastın BOOOMMM :(");
                print(map);
            }
        }
    }
    
    public void bomb(){
        int rowRand,colRand;
        int count=0;
        while(count!=bomb){
            rowRand= rand.nextInt(rowNumber);
            colRand= rand.nextInt(colNumber);
            if(map[rowRand][colRand]!=-1){
                map[rowRand][colRand]=-1;
                count++;
            }
        }
    }
    //Cevap anahtarı
    public void printAnswer(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 0) {
                   System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
           System.out.println();
        }
    }
    
    //çizim
    public void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                
                if (arr[i][j] > 0) {
                    System.out.print(arr[i][j]+" ");
                }else if (arr[i][j]==0) {
                    System.out.print("_ ");
                }else if (arr[i][j]==-2) {
                    System.out.print("0 ");
                }
                
                if (!isWin) {
                    if (arr[i][j]==-1) {
                        System.out.print("* ");
                    }
                }
            }
           System.out.println();
        }
    }

    public void mayinKotrol(int row, int col) {
        
            //Solu kontrol ediyor
        if ( col>0 ) {
            if (map[row][col - 1] == -1) {
                board[row][col]++;
                map[row][col]++;
            }
        }
        
            //sağı kontrol ediyor
        if ( col+1<colNumber ) {
            if (map[row][col + 1] == -1) {
                board[row][col]++;
                map[row][col]++;
            }
        }
            //üstü kontrol ediyor
        if ( row>0 ) {
            if (map[row - 1][col] == -1) {
                board[row][col]++;
                map[row][col]++;
            }
        }
            //altı kontrol ediyor
        if (row+1<rowNumber ) {
            if (map[row + 1][col] ==-1) {
                board[row][col]++;
                map[row][col]++;
            }
        }
            //sol üst çaprazı kontrol ediyor
        if (row-1>0 && col-1>0) {
            if (map[row - 1][col - 1] == -1) {
                board[row][col]++;
                map[row][col]++;
            }
        }
            //sol alt çaprazı kontrol ediyor
        if (row+1<rowNumber && col-1>0) {
            if (map[row + 1][col - 1] == -1) {
                board[row][col]++;
                map[row][col]++;
            }
        }
            //sağ üst çaprazı kontrol ediyor
        if (row-1>0 && col+1<colNumber) {
            if (map[row - 1][col + 1] == -1) {
                board[row][col]++;
                map[row][col]++;
            }
        }
            //sağ alt çaprazı kontrol ediyor
        if (row+1<rowNumber && col+1<colNumber) {
            if (map[row + 1][col + 1] == -1) {
                board[row][col]++;
                map[row][col]++;
            }
        }
            /*haritada etrafında bir bomba yok ise çizimde o yeri 
            0 yazacak print() fonksiyonunda görebilirsiniz*/
        if (map[row][col]==0)
        {
            board[row][col]=-2;
            map[row][col]=-2;
        }
    }
    
}
package MineSweeper;
import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    int rowNumber,colNumber,size;
    int [][] map;
    int [][] board;
    boolean game = true;
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    MineSweeper(int rowNumber,int colNumber){
        this.colNumber=colNumber;
        this.rowNumber=rowNumber;
        this.map= new int [rowNumber][colNumber];
        this.board= new int [rowNumber][colNumber];
        this.size=rowNumber*colNumber;
    }
    public void run(){
        int row,col,succses=0;
        prepareGame();
        print(map);
        System.out.println("Oyun başladı  !");
        while(game){
            print(board);
            System.out.println("Satır sayısı : ");
            row = scan.nextInt();
            System.out.println("Sutun sayısı : ");
            col=scan.nextInt();
            if(row<0 || row>=rowNumber){
                System.out.println("Hatalı bir koordinat girdiniz !");
                continue;
            }
            if(col<0 || col>=colNumber){
                System.out.println("Hatalı bir koordinat girdiniz !");
                continue;
            }
            if(map[row][col] !=-1){
                checkMine(row,col);
                succses++;
                if(succses==size-(size/4)){
                    System.out.println("Başarılı bir şekilde oyun bitti ");
                }
            }else{
                game=false;
                System.out.println("GAME OVER HAHA");
            }

        }
    }
    //etrafındaki mayınları tespit etme
    public void checkMine(int ro,int co){
        if(board[ro][co] ==0){
         if((co<colNumber-1) &&map[ro][co+1] ==-1){
            board[ro][co]++;
         }
         if((ro<rowNumber-3)&&map[ro+1][co] ==-1){
            board[ro][co]++;
         }
         if((ro>0)&&map[ro-1][co] ==-1){
             board[ro][co]++;
         }
         if((co>0)&&map[ro][co-1] ==-1){
             board[ro][co]++;
         }
         if(board[ro][co]==0){
             board[ro][co]=-2;
         }
        }
    }
    //mayınların sayısı ayarlandı ve mayın atama işlemi yapıldı
    public void prepareGame(){
        int randRow,randCol,count=0;
        while(count!= (size/4)){
            randRow=rand.nextInt(rowNumber);
            randCol=rand.nextInt(colNumber);
            if(map[randRow][randCol] !=-1){
                map[randRow][randCol] =-1;
                count++;
            }
        }
    }
    // map'i ekrana yazdırdık
    public void print(int[][] arr){
        for(int i = 0 ; i<arr.length;i++){
            for (int j = 0 ; j<arr[0].length;j++){
                if(arr[i][j] >=0){
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

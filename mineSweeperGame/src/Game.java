import java.util.Scanner;
import java.util.Random;

public class Game {
    int rowNumber,colNumber,size;
    int[][] map;
    int[][] board;
    boolean game = true;

    Random rand = new Random(); // mayın için random sayılar aldım.
    Scanner sc = new Scanner(System.in);
    Game(int rowNumber, int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber*colNumber;
    }
    public void run(){
        int row,col,check=0;
        prepareGame();
        print(map);
        //starting
        System.out.println("******START******");
        while (game){
            print(board);
            System.out.print("Enter a row number: ");
            row=sc.nextInt();
            System.out.print("Enter a column number: ");
            col= sc.nextInt();
            if(row<0 ||row>rowNumber){
                System.out.println("invalid number");
                continue;
            }
            if(col<0 ||col>colNumber){
                System.out.println("invalid number");
                continue;
            }


            if(map[row][col]!=-1){
                check(row,col);
                check++;
                if(check==size-(size/4)){
                    System.out.println("Congratulations");
                    System.out.println("WON");
                    break;
                }
            }else{
                System.out.println("!Game Over!");
                break;
            }
            System.out.println(check);

        }

    }
    public void check(int r,int c){
        if(map[r][c]==0){
            if((c<colNumber-1)&&(map[r][c+1]==-1)){ //check the map
                board[r][c]++;
            }
            if((r<rowNumber-1)&&(map[r+1][c]==-1)){ //maximum value
                board[r][c]++;
            }
            if((r>0)&&(map[r-1][c]==-1)){
                board[r][c]++;
            }
            if((c>0)&&(map[r][c-1]==-1)){
                board[r][c]++;
            }
            if(board[r][c]==0){
                board[r][c]=-2;
            }

        }



    }
    //creating board
    public void prepareGame(){ //mine
        int randRow,randCol,count=0;   //row and column
        while(count!=(size/4)){          //random numbers
            randRow=rand.nextInt(rowNumber);
            randCol=rand.nextInt(colNumber);
            if(map[randRow][randCol]!=-1){
                map[randRow][randCol]=-1;
                count++;
            }


        }

    }


    public void print(int[][] arr){
        for(int i =0;i< arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j]>=0){
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

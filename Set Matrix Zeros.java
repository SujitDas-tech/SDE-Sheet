import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int rowflag=0;
        int columnflag=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0 && matrix[i][j]==0){
                    rowflag=1;
                }
                if(j==0 && matrix[i][j]==0){
                    columnflag=1;
                }
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if((matrix[i][0]==0) || (matrix[0][j]==0)){
                    matrix[i][j]=0;
                }
            }
        }
        if(rowflag==1){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }
        if(columnflag==1){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }

}

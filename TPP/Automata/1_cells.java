import java.io.*;
import java.lang.*;

class cell {
    public int[] cellComplete(int[] arr, int days) {
        int []next = new int[10];

        for(int i = 0; i < arr.length; i++) {
            next[i] = arr[i];
        }

        for(int i = 0; i < days; i++) {
            for(int j = 1; j < arr.length -1; j++) {
                if((arr[j-1]==1 && arr[j+1]==0) || (arr[j-1]==0 && arr[j+1]==1)) {
                    next[j] = 1;
                }
                else {
                    next[j] = 0;
                }
            }
            for(int k = 0; k < arr.length; k++) {
                 arr[k] = next[k];
            }
        }

        return next;
    }
    public static void main(String la[]) {
        cell c = new cell();
        int[] arr = {0,1,0,0,0,0,1,0,0,0};  // elements at extreme places just respresent inative state and will be 0 always
        int days = 1;
        int []result = c.cellComplete(arr, days);

        for(int i = 1; i < result.length -1; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
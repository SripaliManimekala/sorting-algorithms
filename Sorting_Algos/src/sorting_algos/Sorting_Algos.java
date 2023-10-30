/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting_algos;

/**
 *
 * @author Manimekala
 */
public class Sorting_Algos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[]= {1,8,5,9,2,3,6,4,7};
        //selectionsort(array);\
        insertionsort(array);
        for(int i:array){
        System.out.print(i);
        }
        
    }

    private static void selectionsort(int[] array) {
        for(int i=0;i<=array.length-1;i++){
            int min = array[i];
            for(int j=i+1;j<array.length;j++){
                if(min>array[j]){
                    min = array[j];
                    int temp = array[i];
                    array[i] = min;
                    array[j] = temp;
                }
            }
        }
    }

    private static void insertionsort(int[] array) {
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int j=i-1;
            while(j>=0 &&temp<array[j] ){
                
                    array[j+1] = array[j];
                    j--;
                    
                  
            }
            array[j+1]= temp;
        }
    }
    
}

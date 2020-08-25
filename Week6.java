/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author DELL
 */
public class Week6 {

    /**
     * @param <T>
     * @param inputArray
     */
    public static <T> void printArr(T[] inputArray) { 
        for ( T element : inputArray ){ 
            System.out.printf( "%s ", element ); 
        } 
    } 
    public static void main(String[] args) {
        Integer[] intArr = { 10, 12, 3, -4, 5 }; 
        Double[] doubleArr = { 5.1, 2.5, 7.3, -4.5 }; 
        Character[] charArr = { 'U', 'E', 'T', 'V', 'N', 'U' }; 
 
        System.out.println("Mang intArr:"); 
        printArr(intArr);         
        System.out.println("Mang doubleArr:"); 
        printArr(doubleArr); 
        System.out.println("Mang charArr:"); 
        printArr(charArr);  
    }
    
}

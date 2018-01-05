/*
Escriba un programa que imprima los números del 1 al 100. Pero para los múltiplos de tres imprima "Fizz" en lugar del
número y para los múltiplos de cinco imprima "Buzz".
Para números que son múltiplos de tres y cinco, imprime "FizzBuzz".
 */

public class Main {

    public static void main(String[] args){

        // Imprimir los 100 primeros números
        // Imprimo en colores los divisibles entre 3 y 5
        for (int i = 1; i <101 ; i++) {

            if(i % 3 == 0 && i % 5 == 0 ){
                System.out.println(Paleta.RED + i + ". " + "FizzBuzz");
            }
            else if (i % 3 ==0 ){
                System.out.println(Paleta.BLUE + i + ". " + "Fizz");
            }else if(i % 5 == 0){
                System.out.println(Paleta.GREEN + i + ". " + "Buzz");
            }else{
                System.out.println(Paleta.BLACK + i + ". " + i);
            }
        }

    }
    /* Comentario para ver los Commit en GitHub */
    /* Nuevo comentario para nuev Commit */

}

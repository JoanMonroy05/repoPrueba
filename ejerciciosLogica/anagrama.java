import java.util.Scanner;

public class anagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] array_word;
        char[] array_word_c;

        System.out.print("Ingrese una palabra: ");
        String palabra1 = scanner.nextLine().toUpperCase();
        System.out.println();
        String palabra2 = scanner.nextLine().toUpperCase();
        System.out.println("Ingrese una segunda palabra:");

        int longitud_array_word = array_word.length; 
        int longitud_array_word_c = array_word_c.length;

        int contador = 0; 

        for(int i = 0; i < longitud_array_word; i++){
            for(int j= 0; j < longitud_array_word_c; j++){
                if(array_word[i] == array_word_c[j]){
                    contador ++;
                    array_word_c[j] = ' ';
                    break;
                }
            }
        }
        if (contador == longitud_array_word){
            System.out.println("Son anagramas");  
        }else{
            System.out.println("No son anagramas");
        }
    }
}
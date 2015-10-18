package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Pliki {
 
    public static void main(String[] args) {
      
        String nazwaPliku = "plik.csv";
        String odczytanyTekst = odczytajPlik(nazwaPliku);
        System.out.println("Lista studentów:\n" + odczytanyTekst);
    }
 

    public static String odczytajPlik(String nazwaPliku) {
       
        File plikDane = new File(nazwaPliku);
        String odczyt = "";
        try {
          
            Scanner skaner = new Scanner(plikDane);
          
            while (skaner.hasNextLine()) {
            	
              odczyt = odczyt + skaner.nextLine() + "\n"; 
            }
          
        } catch (FileNotFoundException e) {
            System.out.println("Brak Pliku do odczytania!");
        }
        
        
        return odczyt.replace(";", " ");
    }
}
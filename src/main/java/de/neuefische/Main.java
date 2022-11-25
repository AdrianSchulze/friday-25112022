package de.neuefische;
import java.util.Scanner;

// Ich habe extra in dieser Aufgabe nur die Sachen genommen, die wir bisher hatten.
// Ich weiss, dass man hier leichter vorgehen kann.

public class Main {
    public static void main(String[] args) {
        boolean bool = false;
        while(bool == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gib dein Passwort an");
            String input = scanner.nextLine();
            if (longEnoughPassword(input)) {
                System.out.println("Passwort hat die richtige länge");
                    if(containsNumbers(input))  {
                        System.out.println("Dein Passwort enthält Zahlen, gut so!");
                        if(badPasswords(input)) {
                            System.out.println("Sicheres Passwort");
                            if(isUpperCase(input)) {
                                System.out.println("Dein Passwort enthält Großbuchstaben, juhu!");
                                if(isLowerCase(input)) {
                                    System.out.println("Dein Passwort enthält kleine Buchstaben. Damit hast du ein sicheres Passwort :)))");
                                    bool = true;
                                }
                                else {
                                    System.out.println("Dein Passwort enthält keine kleingeschrieben Zeichen, bitte erneut eingeben");
                                }
                            }
                            else {
                                System.out.println("Dein Passwort enthält keine großgeschrieben Zeichen, bitte erneut eingeben");
                            }
                        }
                        else {
                            System.out.println("Unsicheres Passwort, bitte erneut eingeben");
                        }
                    }
                    else {
                        System.out.println("Dein Passwort enthält keine Zahlen, bitte erneut eingeben");
                    }

            }
            else {
                System.out.println("Passwort ist zu kurz, bitte 8 Stellen verwenden");
            }
        }
    }

    public static boolean longEnoughPassword(String str) {
        int pwLetters = 8;
        if(str.length() >= pwLetters) {
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean containsNumbers(String str) {
        char[] charArray = str.toCharArray();
        boolean result = false;
        for(int i=0;i < str.length(); i++) {
            if(Character.isDigit(charArray[i])) {
                result = true;
            }
        }
        return result;
    }

    public static boolean badPasswords(String str) {
        switch(str) {
            case "passwort":
            case "qwert123":
            case "123456":
                return false;
            default:
                return true;
        }
    }

    public static boolean isUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean result = false;
        for(int i=0;i < str.length(); i++) {
            if(Character.isUpperCase(charArray[i])) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean result = false;
        for(int i=0;i < str.length(); i++) {
            if(Character.isLowerCase(charArray[i])) {
                result = true;
            }
        }
        return result;
    }
}
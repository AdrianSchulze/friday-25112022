package de.neuefische;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isNumberLongEnoughForPassword(){
        //GIVEN
        String passwordLength = "HalloPasswort";
        //WHEN
        boolean actual = Main.longEnoughPassword(passwordLength);
        //THEN
        assertEquals(true, actual);
    }

    @Test
    void isNumberNotLongEnoughForPassword(){
        //GIVEN
        String passwordLength = "hehe";
        //WHEN
        boolean actual = Main.longEnoughPassword(passwordLength);
        //THEN
        assertEquals(false, actual);
    }

    @Test
    void containsNumberInString() {
        //GIVEN
        String str = "Jabadabadu12";
        //WHEN
        boolean actual = Main.containsNumbers(str);
        //THEN
        assertEquals(true, actual);
    }

    @Test
    void areBadPasswordsAllowed(){
        //GIVEN
        String str = "passwort";
        //WHEN
        boolean actual = Main.badPasswords(str);
        //THEN
        assertEquals(true, actual);
    }

    @Test
    void includesUpperCase(){
        //GIVEN
        String str = "Jabaduuu";
        //WHEN
        boolean actual = Main.isUpperCase(str);
        //THEN
        assertEquals(true, actual);
    }

    @Test
    void includesLowerCase(){
        //GIVEN
        String str = "Jabaduuu";
        //WHEN
        boolean actual = Main.isLowerCase(str);
        //THEN
        assertEquals(true, actual);
    }

    @Test
    void includesNoLowerCase(){
        //GIVEN
        String str = "JABADUUUU";
        //WHEN
        boolean actual = Main.isLowerCase(str);
        //THEN
        assertEquals(false, actual);
    }
}
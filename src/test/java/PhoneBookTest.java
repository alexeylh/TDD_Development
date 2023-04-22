import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    private PhoneBook phonebook;

    @BeforeEach
    public void init() {
        phonebook = new PhoneBook();
    }

    @Test
    void add() {
        String name = "Вася";
        String phone = "111111";
        int expected = 1;
        int result = phonebook.add(name, phone);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void addDuplicatedName() {
        String name = "Вася";
        String phone1 = "111111";
        String phone2 = "222222";
        int expected = 1;
        phonebook.add(name, phone1);
        int result = phonebook.add(name, phone2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNumber() {
        String expected = "Вася";
        String phone = "111111";
        phonebook.add(expected, phone);
        String result = phonebook.findByNumber(phone);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByName() {
        String name = "Вася";
        String expected = "111111";
        phonebook.add(name, expected);
        String result = phonebook.findByName(name);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void printAllNames() {
        phonebook.add("Петя", "11000");
        phonebook.add("Вася", "11111");
        phonebook.add("Маша", "55555");
        String expected = "Вася\nМаша\nПетя\n";
        String result = phonebook.printAllNames();
        Assertions.assertEquals(expected, result);
    }
}
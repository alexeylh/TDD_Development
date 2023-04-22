import java.util.*;

public class PhoneBook {
    private Map<String, String> namesAndPhones = new HashMap<>();  // ключ - имя
    private Map<String, String> PhonesAndNames = new HashMap<>();  // ключ - телефон
    private SortedSet<String> names = new TreeSet<>();  // сортированый список имён

    public int add(String name, String phone) {
        if (namesAndPhones.containsKey(name)) {
            System.out.println("Контакт " + name + " уже есть в телефонной книге.");
        } else {
            namesAndPhones.put(name, phone);
            PhonesAndNames.put(phone, name);
            names.add(name);
        }
        return namesAndPhones.size();
    }

    public String findByNumber(String phone) {
        return PhonesAndNames.get(phone);
    }
}

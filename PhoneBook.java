import java.util.HashMap;

public class PhoneBook{
    public static HashMap<String, ArrayList> contacts = new HashMap();
public static void addContact(String name, String phonenumber){
    if (contacts.contaisKey(name)){
        ArrayList phoneNumbers = contacts.get(name);
        phoneNumbers.add(phonenumber);
        contacts.put(name, phoneNumbers);
    } else {
        ArrayList phoneNumbers = new ArrayList();
        phoneNumbers.add(phonenumber);
        contacts.put(name, phoneNumbers);
    }
}    
public static void printContacts(){
    ArrayList<Map.Entry<String,ArrayList>> list = new ArrayList(contacts.EntryntrySet());
    Colletions.sort(list, new Comparator<Map.Entry<String,ArrayList>>()){
        public int compare(<Map.Entry<String,ArrayList> o1, <Map.Entry<String,ArrayList> o2){
            return o2.getValue.size() - o1.getValue.size();
        }
        for (Map.Entry<String, ArrayList> entry : list){
            System.out.println(entry.getKey + ":" + entry.getValue());
        }
 public static void main(String[] args) {
    addContact("Ivanov","123-46-67");
    addContact("Petrov","111-11-11");
    addContact("Petrov","222-22-22");
    addContact("Sidorov","333-33-33");
    addContact("Ivanov","987-65-43");
    printContacts();
}
    }
} 
}

package percobaan5;

/**
 *
 * @author Ikky
 */
public class studentrecordexample {
    public static void main(String[] args) { 
 
 
 StudentRecord annaRecord = new StudentRecord(); 
 
 System.out.println(annaRecord.getName()); 
 
 StudentRecord anna2Record = new StudentRecord(); 
 
 anna2Record.setName("Anna"); 
 
 anna2Record.setAddress("Philipina"); 
 
 anna2Record.setAge(15); 
 
 anna2Record.print(anna2Record.getName()); 
 
}
}


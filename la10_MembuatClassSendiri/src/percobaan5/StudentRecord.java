package percobaan5;

/**
 *
 * @author Ikky
 */
public class StudentRecord {
     private String name; 
 
 private String address; 
 
 private int age; 
 

 
 
 public StudentRecord(){ //constructor default 
 

 
 } 
 
 public StudentRecord(String temp){ 
 
 this.name = temp; 
 

 
 } 
 
 
 
 public StudentRecord(String name, String Address){ 
 
 this.name = name; 
 
 this.address = Address; 
 

}

 
 
 public String getName(){ 
 
 return name; 
 
 } 
 
 public void setName(String temp){ 
 
 name = temp; 
 
 } 
 
 public String getAddress(){ 
 
 return address; 
 
 } 
 
 public void setAddress(String temp){ 
 
 address = temp; 
 
 } 
 
 public int getAge(){ 
 
 return age;
  } 
 
 public void setAge(int temp){ 
 
 age = temp; 
 
 } 
  
 public void print(String temp){ 
 
 System.out.println("Name : "+name ); 
 
 System.out.println("Address : "+address); 
 
 System.out.println("Age : "+age); 
 
 } 
 

 
 } 
 


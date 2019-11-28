package percobaan1StatementIf;

/**
 *
 * @author Ikky
 */
public class Grade {
    public static void main( String[] args ) 
 
    {  
 
        double grade = 92.0;  
 
 
 
        if( grade >= 90 )
 
               System.out.println( "Excellent!" );  
        

   
else if ( (grade < 90) && (grade >= 80 )){

System.out.println("good job!" );

 if ( (grade < 80 ) && (grade >= 60 )) 
 
 System.out.println("study harder!" );
else 
    System.out.println("sorry, you failed." );
}
} 
}


package DSA_Lab_Task_1;


public class AnagramCheck
{
   
    private String str_1 , str_2;
    private byte count = 0 ;
    
    public void Anagram( String val_1 , String val_2)
    {
        
        this.str_1 = val_1 ;
        
        this.str_2 = val_2 ;
        
       if(val_1.length() != val_2.length())
       {
           System.out.println("Sorry Invalid String . Enter Same length of Strings");
           System.exit(0);
       }
        
        
        for(int i = 0 ; i <str_1.length() ; i++)
        {
            
            for(int j =0 ; j < str_1.length() ; j++)
            {
                
                if(str_1.charAt(i) == str_2.charAt(j))
                {
                   count++;
                   break;
                   
                }
                
            }//closing of inner loop
            
            
        }//closing of outer loop
        
       
        if(count == str_1.length())
        {
         
            System.out.println("The " + str_1 + " and " +str_2 + " have same Characters ");
       
        }else{
           
            System.out.println("sorry invalid there is no match of characters ");
        }
        
    }//closing of method 

    
    
}

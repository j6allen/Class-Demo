/****************
*@Author Jesse Allen
*@Created 9/26/2013
****************/


public class Person
{
   //Class fields
   private String name;
   private  int age;
   private  String address;
   private  String phone;
   private String info;
   
   //constructors
   /**
   *Creates an instance of the Person class
   *@param last The persons last name
   *@param first The persons first name
   *@param middle The persons middle initial
   */
   public Person(String last, String first, char middle)
   {
         name = first + " " + middle + " " + last;
   }
   /**
   *Creates an instance of the Person class
   *@param last The persons last name
   *@param first The persons first name
   */
   public Person(String last, String first)
   {
      name = first + " " + last;
   }
   //Mutators
   /**
   *Method to update name
   *@param last The persons last name
   *@param first The persons first name
   *@param middle The persons middle initial
   */
   public void changeName(String last, String first, char middle)
   {
      name = name = first + " " + middle + " " + last;
   }
    /**
   *Method to update name
   *@param last The persons last name
   *@param first The persons first name
   */
   public void changeName(String last, String first)
   {
      name = name = first + " " + last;
   }
   /**
   *Method to set address
   *@param addr The persons address
   */
   public void setAddress(String addr )
   {
      address = addr;
   }
   /**
   *Method to set age
   *@param a The persons age
   */

   public  void setAge(int a)
   {
      age = a;
   }
   /**
   *Method to set phone number
   *@param phn The persons phone number
   */

   public void setPhone(String phn)
   { 
      phone = phn;
   }
  
   //Accessors
   
   /**
   *Method to get name
   *@return The persons name
   */
   public String getName()
   {
      return name;
   }
    /**
   *Method to get address
   *@return The persons address
   */
   public String getAddress()
   {
      return address;
   }
    /**
   *Method to get age
   *@return The persons age
   */
   public int getAge()
   {
      return age;
   }
    /**
   *Method to get phone
   *@return The persons phone
   */
   public String getPhone()
   {
      return phone;
   }
   /**
   *Method overides toString of Object class to display all peronal info
   *@return The persons information
   */
   public String toString()
   {
     info = "Pesonal Information: \n" + "Name\t" + name +"\n"
     +"Address\t" + address +"\n"+"Phone\t" + phone +"\n"
     +"Age:\t" + age + "\n\n";
      
     return info;
   }
}
   
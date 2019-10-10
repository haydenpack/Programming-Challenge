/*Please see "StudentEntry UML.txt" located in the same directory of this class for usage instructions.*/

package student;

public class StudentEntry{

    //The student data we're storing
    private String name;
    private int idNumber;

    /*Constructors to initialize class with various amounts of data, or no data at all.*/
    public StudentEntry(){}

    public StudentEntry(String name){
        this.name = name;
    }

    public StudentEntry(int idNumber){
        this.idNumber = idNumber;
    }

    public StudentEntry(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
    } 

    /*Accessors for our private name and idNumber fields*/
    public String getName(){
        return name;
    }

    public int getIDNumber(){
        return idNumber;
    }
    
    /* Mutators to change our private name and idNumber fields */
    public void setName(String name){
        this.name = name;
    }

    public void setIDNumber(int idNumber){
        this.idNumber = idNumber;
    }

}
package app;

import student.StudentEntry;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*Store the data of eight students using our src.student.StudentEntry class.
        Please see its UML in src/student/ for details.*/
        StudentEntry[] students = {
            //Our two zero-argument students with no data
            new StudentEntry(),
            new StudentEntry(),

            //Our two students with only names, but no id.
            new StudentEntry("Luke"),
            new StudentEntry("John"),

            //Our two students with IDs, but no name.
            new StudentEntry(01234),
            new StudentEntry(55096),

            //Our two completed student entries,
            new StudentEntry("Paul", 17465),
            new StudentEntry("Samuel", 84560)
        };

        /* Display our stored data to the user! */
        for(var student : students){
            System.out.println(
                String.format( "Our student %s has the ID number %d", student.getName(), student.getIDNumber() )
            );
        }

    }
}
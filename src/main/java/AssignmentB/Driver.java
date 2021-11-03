/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentB;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import AssignmentA.Student;
import AssignmentA.Module;
import AssignmentA.Course;
/**
 *
 * @author jredd
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    // Main method for work done on ArrayLists 
    public static void main(String[] args){
        
        // Arraylists instanciated here 
        List<Student> students = new ArrayList<Student>();
        List<Module> modules = new ArrayList<Module>();
        List<Module>modulesEE = new ArrayList<Module>();
        
        // Student Objects instantiated here and given values
        Student studA = new Student("John","Reddington",32,"01/11/81",15104599);
        Student studB = new Student("Gerard","Smith",22,"02/11/91",1792051);
        Student studC = new Student("James","Murphy",25,"04/12/95",45901432);
        
        // Course Objects Instantiated here and given values
        Course courA = new Course("Computer Sciense",new DateTime("2021-02-01"),new DateTime("2022-06-20"));
        Course courB = new Course("Electronic Engineering",new DateTime("2021-02-01"),new DateTime("2022-06-20"));
        Course courC = new Course("Mechanical Engineering",new DateTime("2021-02-01"),new DateTime("2022-06-20"));
        
        // Module Objects Instantiated here and given values
        Module modA = new Module("Programming","CT3510");
        Module modB = new Module("Software Engineering","CT4101");
        Module modC = new Module("Machine Learning","CT407");
        Module modD = new Module("Advanced Professional Skills","CT1241");
        Module modE = new Module("Information Retrieval","CT2431");
        Module modF = new Module("Artificial Intelegence","CT1324");
        
        Module modG = new Module("Smart Devices","EE-2131");
        Module modH = new Module("Printed Circuit Boards","EE-4214");
        Module modI = new Module("C - Programming","CT 5142");
        Module modJ = new Module("System Tools","EE8924");
        Module modK = new Module("Monitor Repair","EE7821");
        
        // first Student added to the first position of the student ArrayList
        students.add(studA);
        
        // modules are added to the ArrayList modules 
        modules.add(modA);
        modules.add(modB);
        modules.add(modC);
        modules.add(modD);
        modules.add(modE);
        modules.add(modF);
        
        // setModules() method used here to add all these modules
        // using the method created in the Student class, same with setCourse
        studA.setModules(modules);
        studA.setCourse(courA);
        
        students.add(studB);
        
        // modules are added to the ArrayList modulesEE
        modulesEE.add(modG);
        modulesEE.add(modH);
        modulesEE.add(modI);
        modulesEE.add(modJ);
        modulesEE.add(modK);
        
        studB.setModules(modulesEE);
        studB.setCourse(courB);
        
        students.add(studC);
        modules.add(modC);
        modulesEE.add(modH);
        modules.add(modC);
        modulesEE.add(modK);
        modules.add(modA);
        
        studC.setCourse(courC);
        studC.setModules(modules);
        studC.setModules(modulesEE);
        
        // nested for loop used here for displaying student 
        // and then printing list of modules 
        // and courses created in displayStudent() from Student class
        for(Student st: students){
            System.out.println("\n");
            st.displayStudent();
            System.out.println("**********************************");
            for(Module m: st.getModules()){
                System.out.println(m.toString());
            }
            System.out.println("**********************************"); 
        }   
    }  
    
}

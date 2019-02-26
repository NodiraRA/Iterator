/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author nodira
 */
public class JavaDeveloperRunner {

   
    public static void main(String[] args) {
            String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};
            JavaDeveloper javaDeveloper = new JavaDeveloper("Nodira Rakhimjonova", skills);
            
            Iterator iterator = javaDeveloper.getIterator();
            
            System.out.println("Developer: " + javaDeveloper.getName());
            System.out.println("Skills: ");
            
            while(iterator.hasNext()){
                System.out.println(iterator.next().toString() + " ");
                
            }
    }
    
}

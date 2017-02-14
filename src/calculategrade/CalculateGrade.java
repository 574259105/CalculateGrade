
package th.ac.npru.se.calculategrade;



public class CalculateGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalGrade CG1 = new CalGrade();
        
        CG1.calGrade(77);
        
        System.out.println(CG1.Grade);
    }
    
}

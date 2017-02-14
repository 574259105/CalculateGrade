/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculategrade;

/**
 *
 * @author LENOVO
 */
public class SoftWareSubject implements ICalGrade {

    
    String grade;
    int gradeMax=100;
    int gradeA=80;
    int gradeB=70;
    int gradeC=60;
    int gradeD=50;
    int gradeBPlus=75;
    int gradeCPlus=65;
    int gradeDPlus=55;
    
                   
    
    public String CGrade(int point) {
        
      
        if(point > gradeMax){
            
            return grade="Grade ERROR";
            
        }else if(point >= gradeA){
             return grade="A";
             
        }else if(point >= gradeBPlus){
             return grade="B+";
             
        }else if(point >= gradeB){
             return grade="B";
            
        }else if(point >= cc){
             return grade="C+";
            
        }else if(point >= gradeC){
             return grade="C";
            
        }else if(point >= gradeDPlus){
             return grade="D+";
            
        }else if(point >= gradeD){
             return grade="D";
            
        }else{
            return grade="E";
            
        }
        
       
        
    }
    
    
    
}

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
public class CalGrade implements ICalGrade {

    
    String Grade;
    int aa=100;
    int a=80;
    int b=70;
    int c=60;
    int d=50;
    int bb=75;
    int cc=65;
    int dd=55;
    
                   
    
    public String CGrade(int grade) {
        
      
        if(grade > aa){
            
            return Grade="Grade ERROR";
            
        }else if(grade >= bb){
             return Grade="B+";
             
        }else if(grade >= bb){
             return Grade="B+";
             
        }else if(grade >= bb){
             return Grade="B";
        }else if(grade >= cc){
             return Grade="C+";
        }else if(grade >= c){
             return Grade="C";
        }else if(grade >= dd){
             return Grade="D+";
        }else if(grade >= d){
             return Grade="D";
        }else{
            return Grade="E";
        }
        
       
        
    }
    
    
    
}

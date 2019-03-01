/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo10;

/**
 *
 * @author evely
 */
public class TennisGame {
     protected String nameP1;
    protected String nameP2;
    private Integer fScoreP1;
    private Integer fScoreP2;
    private String fSP1;
    private String fSP2;    
    public void setNames(String n,String m){
        nameP1=n;
        nameP2=m;
    }
    public String getNameP1(){
        return nameP1;
    }
    public String getNameP2(){
        return nameP2;
    }    
    private void finalScore(){
        if(fScoreP1!=null && fScoreP2!=null){
            if((fScoreP1<0 || fScoreP1>4) || (fScoreP2<0 || fScoreP2>4) || (fScoreP1==4 && fScoreP2==4)){
                fScoreP1=0;
                fScoreP2=0;
                fSP1="error";
                fSP2="error";
            }
        }
    }
    private String stringFinal(Integer n){
        switch(n){
            case 0:
                return "love";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            case 4:
                return "game";
            default:
                return null;
        }
    }
    public void setFinalScore(Integer n,Integer m){
        fScoreP1=n;   
        fScoreP2=m; 
        fSP1=stringFinal(n);
        fSP2=stringFinal(m);
        finalScore();        
    }
    public Integer getFScoreP1(){
        return fScoreP1;
    }    
    public String getFSP1(){
        return fSP1;
    }
    public Integer getFScoreP2(){
        return fScoreP2;
    }    
    public String getFSP2(){
        return fSP2;
    }
    
}

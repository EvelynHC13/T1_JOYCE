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
public class DoublesTennisGame extends TennisGame {
    private String partnerP1;
    private String partnerP2;
    public void setPartnerNames(String n,String m){
        partnerP1=n;
        partnerP2=m;
    }
    public void setNames(String n,String m,String o,String p){
        nameP1=n;
        partnerP1=m;
        nameP2=o;
        partnerP2=p;
    }
    public String getPartnerP1(){
        return partnerP1;        
    }
    public String getPartnerP2(){
        return partnerP2;        
    }
}
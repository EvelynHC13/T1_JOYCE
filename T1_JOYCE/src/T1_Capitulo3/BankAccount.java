/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_Capitulo3;
import java.util.Scanner;
/**
 *
 * @author evelyn
 */
public class BankAccount {
    
    static final  int REDUCE_FEET=4;
    private long accountNumber;
    private String nameCustomer;
    private double balanceAccount;
	
    public BankAccount(){
	this.accountNumber=12345678;
	this.nameCustomer="Evelyn";
	this.balanceAccount=0.0;
	}
	
	public long getAccountNumber() {
            return accountNumber;
	}
	
        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
	}
        
	public String getNameCustomer() {
            return nameCustomer;
	}
        
	public void setNameCustomer(String nameCustomer) {
            this.nameCustomer = nameCustomer;
	}
        
	public double getBalanceAccount() {
            return balanceAccount;
	}
        
	public void setBalanceAccount(double balanceAccount) {
            this.balanceAccount = balanceAccount;
	}
        
        public static BankAccount getData(){
		
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresar numero de cuenta:");
            long accountNumber=scanner.nextLong();
            System.out.println("Ingresar nombre de cliente:");
            String nameCustomer=scanner.next();
            System.out.println("Ingresar balance de cuenta:");
            double balanceAccount = scanner.nextDouble();
		 
            BankAccount cuenta = new BankAccount();
            cuenta.setAccountNumber(accountNumber);
            cuenta.setNameCustomer(nameCustomer);
            cuenta.setBalanceAccount(balanceAccount);
            return cuenta;
	}
	
	
	
	public void deductMontlyFee(double balanceAccount){
            double balanceReduceFeet=balanceAccount-REDUCE_FEET;
            setBalanceAccount(balanceReduceFeet);
	}
	
	public  void explainAccountPolicy(){
            System.out.println("La cantidad de 4 dolares seran  cobrados cada mes por concepto de cuato de servicios");
	}
        
        public static void showValues(BankAccount cuenta){
		
            System.out.println("Numero de cuenta: "+cuenta.getAccountNumber());
            System.out.println("Balance de la cuenta: "+cuenta.getBalanceAccount());
            System.out.println("Nombre del cliente: "+cuenta.getNameCustomer());
            cuenta.deductMontlyFee(cuenta.getBalanceAccount());
            System.out.println("Balance menos cuota servicios: "+cuenta.getBalanceAccount());
            cuenta.explainAccountPolicy();	
	}
}

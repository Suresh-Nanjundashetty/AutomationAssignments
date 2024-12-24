package com.creatio.crm.language.basics;

public class EmpGroup extends Employee{

	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
    EmpGroup grp = new EmpGroup();
    int l = grp.empname.length;
    
    for (int i=0 ; i<l; i++) {
    {
    	System.out.println("Name of employee "+grp.empname[i] + " id of employee "+grp.empid[i]);
    }
}
}
}
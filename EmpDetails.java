class EmpDetails
{
	int eid;
	String ename;
	double esal;
	EmpDetails(int eid,String ename,double esal){
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	public static void main(String[] args) 
	{
		
        EmpDetails E=new EmpDetails(101,"Rohan",50000.90);
		System.out.println("Employee Id="+E.eid+"\nEmployee name="+E.ename+"\nEmployee salary is="+E.esal);
	}
}

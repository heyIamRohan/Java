abstract interface phone
{
  public abstract void vivo();
  public abstract void oppo();

}
class blackcolor implements  phone
{
  public void vivo()
	{
	  System.out.println("vivo is new phone");

    }
	public void oppo()
	{
     
    System.out.println("oppo is 5g phone");

	}

}
class Inter
{
   public static void main(String[] args) 
	{
	   blackcolor b=new blackcolor();
	              b.vivo();
				  b.oppo();
	}
}

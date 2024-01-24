class ajio_v1
{
	void buy_button()
	{  
          System.out.println("buy:  ");
      }
}
class ajio_v2 extends ajio_v1
{
	void buy_button()
	{  
          System.out.println("buy: geroceries");
      }
}
class cstd1
{
	public static void main(String[] args) 
	{
             ajio_v1 a2=new ajio_v2();
			 a2.buy_button();
		
	}
}

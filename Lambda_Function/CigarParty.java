interface CigarParty{

	public boolean cigarParty(int cigars, boolean isWeekend);

	public static void main(String[] args){
		CigarParty c1 = (int cigars, boolean isWeekend)->
		{
			if(cigars>=40 && cigars<=60 && isWeekend==false)
			  {
			    return true;
			  }
			  else if(cigars>=40 && isWeekend == true)
			  {
			    return true;
			  }
			  else 
			  {
			    return false;
			  }
		};
		System.out.println(c1.cigarParty(30, false));
		System.out.println(c1.cigarParty(50,false));
		System.out.println(c1.cigarParty(70,true));
	}

}


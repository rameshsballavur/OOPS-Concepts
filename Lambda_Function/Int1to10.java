interface  Int1to10{

public boolean int1to10(int n, boolean outsideMode);

public static void main(String[] args)
{
  Int1to10 i1 = (int n,boolean outsideMode)->
  {
    if((n>=1 &&n<=10)&& outsideMode==false)
      {
        return true;
      }
      else if((n<=1 || n>=10) && outsideMode==true)
      {
        return true; 
      }
      return false;
    };
    System.out.println(i1.int1to10(5,false));
    System.out.println(i1.int1to10(11,false));
    System.out.println(i1.int1to10(11,true));   
  }
}

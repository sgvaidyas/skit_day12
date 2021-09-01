package day12;

public class Pg8_Recursivefunctions {
	
	void print(int n)
	{
		if(n==0)
			return;
		System.out.println(n);
		print(n-1);
	}
	
	int sum(int n)
	{
	    if(n==0)
	    	return n;
		return n + sum(n-1);
	}
	int sumodd(int n)
	{
		if(n<=0)
			return 0;
		else if(n%2!=0)
			return n+sumodd(n-2);
		else
			return 0+sumodd(n-1);
	}
	/*n= 765  return 1+count(76)
                 return 1 + count(7)
                            1+ count(0)
                            
    */
	int count(int n)
	{
		if(n==0)
			return 0;
		return 1+count(n/10);
	}
	/*
	n= 765  return (n%10)+count(n/10)
		return  5+ count(76)
                 return 6 + count(7)
                            7+ count(0)
	 */
	int countdig(int n)
	{
		if(n==0)
			return 0;
		return n%10+countdig(n/10);
	}
	/*
1+count(s,1)
  0+ count(s,2)
     0+count(s,3)
     	0+count(s,4)
     	  1+count(s,5)
     	  if(ind==s.length)
     	  	return 0
     	  	*/
	int countVowels(String s,int ind)
	{
		if(ind==s.length())
			return 0;
		String vowel="aeiou";
		if(vowel.contains(s.substring(ind,ind+1)))
			return  1 + countVowels(s, ind+1);
		return 0 +	countVowels(s, ind+1);
	}
	int countStrdig(String s,int ind)
	{
		if(ind==s.length())
			return 0;
		if(Character.isDigit(s.charAt(ind) ))
			return 1+ countStrdig(s,ind+1);
		return 0+countStrdig(s,ind+1);
	}

}

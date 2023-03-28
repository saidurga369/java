package team_wolf.rest;

import java.util.Random;

public class OtpCheck
{
	public String otpCheck(long num)
	{
		Random r = new Random();
		if(num==9010841407l)
		{
			int otp = r.nextInt(10000);
			if(otp<1000)
			{
				otp+=1000;
			}
			return "sai your otp is: "+otp;			
		}
		else
		{
			return "It is not sai's number";
		}
	}
}

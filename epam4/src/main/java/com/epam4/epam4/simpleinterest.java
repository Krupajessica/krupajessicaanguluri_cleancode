package com.epam4.epam4;

public class simpleinterest {
		double principalamount;
		double years;
		double rateofinterestpyear;
		simpleinterest(double principalamount, double  years, double rateofinterestpyear){
			this.principalamount = principalamount;
			this.years = years;
			this.rateofinterestpyear = rateofinterestpyear;
			}	
		public double findsimpleinterest(){
			double result = (principalamount * years * rateofinterestpyear);
			result /= 100;
			return result;
		}
	}
		


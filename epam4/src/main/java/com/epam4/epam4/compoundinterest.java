package com.epam4.epam4;
import java.io.*;
import java.lang.*;
import java.util.*;


class compoundinterest{
	double principalamount;
	double years;
	double rateofinterestpyear;
	compoundinterest(double p, double y, double r){
		this.principalamount = p;
		this.years = y;
		this.rateofinterestpyear = r;
		}	
	public double findcompoundinterest(){
		double result = principalamount * Math.pow((1 + rateofinterestpyear/100), years);
		return result;
	}
}


	

package com.akhil.service;

import java.util.function.*; 

import com.akhil.pojo.Medium;

public class SamplePredicate <t> implements Predicate<t> {
	Medium varc1; 

	@Override
	public boolean test(t varc) {
		  if(varc1.equals(varc)){  
			   return true;  
			  }  
			  return false; 
	}


}

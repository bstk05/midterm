package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.*;
import java.util.Date;


public class Staff_Test {
	static ArrayList<Staff> stafflist = new ArrayList<Staff>();

	
	@BeforeClass
	public static void setup() throws Exception {
		
		stafflist.add(new Staff("Peter","Tim", "Lemmons", new Date(1976, 10, 19), "21 sdfwe way","(302)-231-2342","Peter@gmail.com","Monday-Friday 12am-5pm",7,80000, new Date(2016, 5, 5), com.cisc181.eNums.eTitle.PRO));
		stafflist.add(new Staff("Maybe","Rose", "Wade", new Date(1995, 3, 28), "24 dsfwf way","(423)-671-3456","Maybe@gmail.com","Monday-Friday 9am-3pm",6,100000, new Date(2016, 5, 5), com.cisc181.eNums.eTitle.SIR));
		stafflist.add(new Staff("Fear","Puppy", "Jhonson", new Date(1989, 11, 1),"43 wlerfs way", "(234)-576-5456","Fear@gmail.com"," Monday-Friday 10am-6pm",6,110000, new Date(2016, 5, 5), com.cisc181.eNums.eTitle.DOC));
		stafflist.add(new Staff("Tai","Lai","Yang", new Date(1958, 7, 12),"1213 wersd way", "(564)-232-4557","Tai@gmail.com","Monday-Friday 12am-4pm",4,60000, new Date(2016, 5, 5), com.cisc181.eNums.eTitle.SIR));
		stafflist.add(new Staff("Sumail","Allen", "James",new Date(1969, 6, 16),"453 sdfsd way", "(212)-456-1243", "Sumail@gmail.com","Monday-Friday 12am-8pm",8,120000, new Date(2016, 5, 5), com.cisc181.eNums.eTitle.DOC));
		
	}
	
	@Test
	public void avgSals() {
		double sum = 0;
		for (Staff i : stafflist){
			sum += i.getSalary();
		}
		double average = sum / 5;
		assertEquals(average,1,1);
	}	

}

package com.khadri.dp;

public class TestProxyDesignPattern {

	public static void main(String[] args) {
		
		JobOffer jobOffer = new ClientProxyConsultancy();
		jobOffer.job(1000000.01);
	}
}

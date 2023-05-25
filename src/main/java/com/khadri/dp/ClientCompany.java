package com.khadri.dp;

public class ClientCompany implements JobOffer {

	@Override
	public void job(Double offerSalary) {
		System.out.println("Working at client location "+offerSalary);
	}

}

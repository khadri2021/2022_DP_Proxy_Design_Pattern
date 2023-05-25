package com.khadri.dp;

public class ClientProxyConsultancy implements JobOffer{

	private ClientCompany clientCompany;
	public ClientProxyConsultancy() {
		clientCompany = new ClientCompany();
	}
	
	@Override
	public void job(Double offerSalary) {
	 
		//controlling offered salary by proxy mechanism
		Double modifyOffer = offerSalary - 100000.00;
		
		clientCompany.job(modifyOffer);
		
	}

}

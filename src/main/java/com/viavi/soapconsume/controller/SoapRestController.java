//package com.viavi.soapconsume.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.viavi.soapconsume.client.SoapClinet;
//import com.viavi.soapconsume.loaneligibility.Acknowledgement;
//import com.viavi.soapconsume.loaneligibility.CustomerRequest;
//
//@RestController
//public class SoapRestController {
//
//	@Autowired
//	private SoapClinet clinet;
//	
//	@PostMapping("/getLoanStatus")
//	public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
//		return clinet.getLoanStatus(request);
//	}
//	
//}

package com.viavi.soapconsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.viavi.soapconsume.client.SoapClinet;
import com.viavi.soapconsume.loaneligibility.Acknowledgement;
import com.viavi.soapconsume.loaneligibility.CustomerRequest;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App {
	
	@Autowired
	private SoapClinet clinet;
	
	@PostMapping("/getLoanStatus")
	public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
		return clinet.getLoanStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
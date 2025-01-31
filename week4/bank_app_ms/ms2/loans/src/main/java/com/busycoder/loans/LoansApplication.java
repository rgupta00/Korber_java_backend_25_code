package com.busycoder.loans;

import com.busycoder.loans.dto.InfoDto;
import com.busycoder.loans.entities.Loan;
import com.busycoder.loans.repositories.LoanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Random;

@SpringBootApplication
@EnableConfigurationProperties(value = {InfoDto.class})
public class LoansApplication implements CommandLineRunner {

	@Autowired
	private LoanRepo loanRepo;

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//String mobile, String loanNumber, String loanType,
		//                int totalLoan, int amountPaid, int outstandingAmount
		loanRepo.save(new Loan("7088993300",
				getLoanNumber(),"Personal",52000,
				12000,40000 ));

		loanRepo.save(new Loan("7988223300",
				getLoanNumber(),"Car",52000,
				12000,40000 ));
	}

	private String getLoanNumber(){
		long val=new Random().nextLong(1000_0000_0000_000L);
		Long value=1000_0000_0000_0000L+val;
		return value.toString();
	}
}

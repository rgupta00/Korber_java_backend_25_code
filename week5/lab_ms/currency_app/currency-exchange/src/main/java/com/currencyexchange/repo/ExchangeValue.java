package com.currencyexchange.repo;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeValue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal conversionMultiple;

	private int port;

	public ExchangeValue(String from, String to, BigDecimal conversionMultiple) {
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
}
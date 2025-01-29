package com.currencyexchange.service;

import com.currencyexchange.repo.ExchangeValue;

public interface ExchangeService {
    ExchangeValue findByFromAndTo(String from, String to);
}
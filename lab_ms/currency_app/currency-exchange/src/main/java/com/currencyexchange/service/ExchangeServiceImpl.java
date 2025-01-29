package com.currencyexchange.service;

import com.currencyexchange.repo.ExchangeValue;
import com.currencyexchange.repo.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeServiceImpl implements ExchangeService{

    @Autowired
    private ExchangeValueRepository repository;

    @Override
    public ExchangeValue findByFromAndTo(String from, String to) {
        return repository.findByFromAndTo(from, to);
    }
}
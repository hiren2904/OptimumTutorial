package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Currency;

public interface CurrencyService {
	
     List<Currency>getAllCurrencies();
	
    Currency getCurrencyById(String id);
    
    Currency createCurrency(Currency currency);
    
    Currency updateCurrency( Currency currency,String id);
    
    void deleteCurrency(String id);

}

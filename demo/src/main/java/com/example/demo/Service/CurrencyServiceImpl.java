package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Currency;
import com.example.demo.Repo.CurrencyRespository;

@Service
public class CurrencyServiceImpl implements CurrencyService {

	@Autowired
	private CurrencyRespository repo;
	private List<Currency> all;
	private Optional<Currency> byId;
	private Currency save;
	private Currency existingCurrency;
	private Optional<Currency> byId2;
	private Currency currency;

	@Override
	public List<Currency> getAllCurrencies() {
		all = repo.findAll();
		return all;
	}

	@Override
	public Currency getCurrencyById(String id) {

		Optional<Currency> optionalcurr = repo.findById(Integer.parseInt(id));

		return optionalcurr.orElse(null);

	}

	@Override
	public Currency createCurrency(Currency currency) {
		
		save = repo.save(currency);
		
		return save;
	}

	@Override
	public Currency updateCurrency(Currency curr, String id) {
		
		Optional<Currency> existingcurr = repo.findById(Integer.parseInt(id));
		
		if(existingcurr.isPresent()) {
			existingCurrency = existingcurr.get();
			existingCurrency.setCountry(curr.getCountry());
			existingCurrency.setCurrencyCode(curr.getCurrencyCode());
			existingCurrency.setDate(curr.getDate());
			existingCurrency.setDescription(curr.getDescription());
			existingCurrency.setValue(curr.getValue());
			return repo.save(existingCurrency);
			
		}else {
			return null;
		}
		
	}

	@Override
	public void deleteCurrency(String id) {
		byId2 = repo.findById(Integer.parseInt(id));
		if(byId2.isPresent()) {
			currency = byId2.get();
			repo.delete(currency);
		}

	}

}

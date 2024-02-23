package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Currency;
import com.example.demo.Service.CurrencyService;

@RestController
@RequestMapping("/applications")
public class CurrencyController {

	@Autowired
    private CurrencyService currencyService;
	
    @GetMapping("/details")
    private List<Currency> getAllCurrency(){
        return currencyService.getAllCurrencies();
    }
    
    @GetMapping("/{id}")
    private Currency getById(@PathVariable String id) {
    	return currencyService.getCurrencyById(id);
    }
    
    @PostMapping("/save-currency")
    private Currency saveCurency(@RequestBody Currency curr) {
    	return currencyService.createCurrency(curr);
    	
    }
    
    @PutMapping("/update-currency")
    private Currency updateCurrency(@RequestBody Currency curr,@PathVariable String id) {
    	return currencyService.updateCurrency(curr,id);
    }
    
    @DeleteMapping("/{id}")
    private void deletebyID(@PathVariable String id)
    {
    	currencyService.deleteCurrency(id);
    }
    
}










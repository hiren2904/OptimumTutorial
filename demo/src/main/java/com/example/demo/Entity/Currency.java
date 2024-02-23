package com.example.demo.Entity;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Currency {
    @Id
	@GeneratedValue()
    private int id;
    private String currencyCode;
    private String country;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate  date;
    private double value;
    private String description;
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Currency(int id, String currencyCode, String country, LocalDate  date, double value, String description) {
		super();
		this.id = id;
		this.currencyCode = currencyCode;
		this.country = country;
		this.date = date;
		this.value = value;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LocalDate  getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Currency [id=" + id + ", currencyCode=" + currencyCode + ", country=" + country + ", date=" + date
				+ ", value=" + value + ", description=" + description + "]";
	}
    
}















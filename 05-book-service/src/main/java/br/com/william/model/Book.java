package br.com.william.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String author;
	private Date LaunchDate;
	private Double price;
	private String Title;
	private String currency;
	private String environment;
	
	public Book() {}

	public Book(Long id, String author, String title,
			Date launchDate, Double price,
			String environment) {
		super();
		this.id = id;
		this.author = author;
		LaunchDate = launchDate;
		this.price = price;
		Title = title;
		this.currency = currency;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getLaunchDate() {
		return LaunchDate;
	}

	public void setLaunchDate(Double launchDate) {
		LaunchDate = launchDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(LaunchDate, Title, author, currency, environment, id, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(LaunchDate, other.LaunchDate) && Objects.equals(Title, other.Title)
				&& Objects.equals(author, other.author) && Objects.equals(currency, other.currency)
				&& Objects.equals(environment, other.environment) && Objects.equals(id, other.id)
				&& Objects.equals(price, other.price);
	}
	
	
	
	
	
}

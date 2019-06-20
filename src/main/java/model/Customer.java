package model;

import java.util.ArrayList;

public class Customer
{
	private String companyName;
	private String salutation;
	private String name;
	private String insertion;
	private String lastName;

	private Address address;

	private String vatNumber;
	private String iban;
	private String bic;

	private int customerId;

	private ArrayList<Invoice> invoices = new ArrayList<Invoice>();

	public String getCompanyName()
	{
		return companyName;
	}

	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	public String getSalutation()
	{
		return salutation;
	}

	public void setSalutation(String salutation)
	{
		this.salutation = salutation;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getInsertion()
	{
		return insertion;
	}

	public void setInsertion(String insertion)
	{
		this.insertion = insertion;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public String getVatNumber()
	{
		return vatNumber;
	}

	public void setVatNumber(String vatNumber)
	{
		this.vatNumber = vatNumber;
	}

	public String getIban()
	{
		return iban;
	}

	public void setIban(String iban)
	{
		this.iban = iban;
	}

	public String getBic()
	{
		return bic;
	}

	public void setBic(String bic)
	{
		this.bic = bic;
	}

	public ArrayList<Invoice> getInvoices()
	{
		return invoices;
	}

	public void setInvoices(Invoice invoice)
	{
		this.invoices.add(invoice);
	}

	public int getCustomerId() {return customerId;}

	public void setCustomerId(int customerId) {this.customerId = customerId;}
}
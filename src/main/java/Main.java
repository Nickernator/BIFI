import model.Address;
import model.Company;
import model.Customer;
import model.InvoiceLine;
import parser.FileParser;

public class Main
{
    public static void main (String[] args)
    {
        var main = new Main();
        var model = main.GetCompany();

        //parse
        var parser = new FileParser(model);
        var iefFile = parser.Parse();

        System.out.println("== file ==");
        System.out.println(iefFile);
    }

    private Main()
    {
        //ignore
    }

    public Company GetCompany()
    {
        var companyAddress = new Address();
        companyAddress.setCity("Utrecht");
        companyAddress.setPostalCode("1234aa");
        companyAddress.setStreet("Street");
        companyAddress.setStreetNumber("21e");

        var company = new Company();
        company.setAddress(companyAddress);
        company.setName("Company name");
        company.setVatNumber("02349385");
        company.setIban("INGB03NL0001234435");
        company.setBic("ING");
        
        var customers = GetCustomers();
        company.setCustomers(customers);

        return company;
    }

    private Customer[] GetCustomers()
    {
        var customer1Address = new Address();
        customer1Address.setCity("Utrecht");
        customer1Address.setPostalCode("4321bb");
        customer1Address.setStreet("Street");
        customer1Address.setStreetNumber("21");
        
        var customer1 = new Customer();
        customer1.setCompanyName("A company");
        customer1.setSalutation("Dhr");
        customer1.setName("Piet");
        customer1.setInsertion("van");
        customer1.setLastName("Test persoon");
        customer1.setAddress(customer1Address);
        customer1.setVatNumber("jdfhkjgf");
        customer1.setIban("INGB03NL9874356iuh");
        customer1.setBic("lkfdg");
        
        var invoiceLines = GetInvoiceLineCustomer1();
        
        var customer2 = new Customer();
        
        return new Customer[]
        {
            customer1,
            customer2
        };
    }
    
    private InvoiceLine[] GetInvoiceLineCustomer1()
    {
        var invoiceLine = new InvoiceLine();
        
        return new InvoiceLine[]
        {
            invoiceLine      
        };
    }


}

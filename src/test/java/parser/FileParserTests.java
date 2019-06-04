package parser;

import model.Company;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileParserTests
{
    private FileParser<Company> _fileParser;
    
    @Before
    public void Before()
    {
        //reflection didn't catch inheritance
        var company = new TestCompany().GetCompany();
        _fileParser = new FileParser<>(company);
    }
    
    @Test
    public void FileParserTestParseValid()
    {
        var result = _fileParser.Parse();
        
        var expected = "B,Company name,Street,21e,1234aa,Utrecht,02349385,INGB03NL0001234435,ING\n" +
                "K,A company,Dhr,Piet,van,Test persoon,Street,21,4321bb,Utrecht,jdfhkjgf,INGB03NL9874356iuh,lkfdg\n" +
                "R,,00000,00000,0,,\n" +
                "K,,,,,,,,,,,,";
                
        assertEquals(expected, result);
    }
    
    
}
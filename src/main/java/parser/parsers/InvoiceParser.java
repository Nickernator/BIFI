package parser.parsers;

import model.Invoice;
import parser.IParser;
import parser.ParserUtils;
import parser.FileBuilder;

public class InvoiceParser extends ParserUtils implements IParser<Invoice> {

    @Override
    public void Parse(FileBuilder builder, Invoice model) {

        var items = new String[]
        {

        };
        builder.Add(items);
    }
}
package persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MongoReaderTester {
    private MongoReader mongoReader;

    @BeforeEach
    public void setupMongoReader() {
        mongoReader = new MongoReader();
    }

    @Test
    public void testInvoiceLoader() {
        assertEquals(mongoReader.getAllInvoices().size(), 5);
    }
}

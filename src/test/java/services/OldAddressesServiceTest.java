package services;

import model.Address;
import model.Customer;
import org.easymock.EasyMockSupport;
import org.easymock.TestSubject;
import org.junit.Test;
import services.generic.IOldAddressesService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class OldAddressesServiceTest extends EasyMockSupport {
    @TestSubject
    private IOldAddressesService testSubject = new OldAddressesService();

    private Customer customerStub = new Customer();

    private static Address getFakeAddressWithExistingOldAddressKey() {
        Address address = new Address();
        address.setStreet("-MOATA");
        return address;
    }

    private static Address getExpectedAddressForFakeAddressWithExistingOldAddressKey() {
        Address address = new Address();
        address.setStreet("Ajax");
        address.setStreetNumber("5");
        address.setCity("Rotterdam");
        address.setPostalCode("1901CD");
        return address;
    }

    private static Address getFakeAddressWithNonExistingOldAddressKey() {
        Address address = new Address();
        address.setStreet("-UNAVAILABLE");
        return address;
    }

    private static Address getFakeAddressWithInvalidOldAddressKey() {
        Address address = new Address();
        address.setStreet("Straatweg");
        address.setCity("Utrecht");
        return address;
    }

    @Test
    public void getByCustomerWithOldAddressTest() {
        customerStub.setAddress(getFakeAddressWithExistingOldAddressKey());

        Address expectedAddress = getExpectedAddressForFakeAddressWithExistingOldAddressKey();

        Address result = testSubject.getByCustomer(customerStub);

        assertEquals(expectedAddress.getStreet(), result.getStreet());
        assertEquals(expectedAddress.getStreetNumber(), result.getStreetNumber());
        assertEquals(expectedAddress.getCity(), result.getCity());
        assertEquals(expectedAddress.getPostalCode(), result.getPostalCode());
    }

    @Test
    public void getByCustomerWithInvalidAddressTest() {
        customerStub.setAddress(getFakeAddressWithNonExistingOldAddressKey());
        assertNull(testSubject.getByCustomer(customerStub));
    }

    @Test
    public void getByCustomerWithUnsupportedAddressTest() {
        customerStub.setAddress(getFakeAddressWithInvalidOldAddressKey());
        assertEquals(customerStub.getAddress(), testSubject.getByCustomer(customerStub));
    }
}
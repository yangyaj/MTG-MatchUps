package gov.weather;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by David on 10/12/16.
 */
public class NdfdXMLBindingStubTest {
    @Test
    public void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();

        String results = binding.latLonListZipCode("53711");

        assertEquals("Results dont match", "???", results);
    }

}
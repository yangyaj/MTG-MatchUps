package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by David on 10/12/16.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahranheitResults = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("the celsius conversion failed", celsiusToFahranheitResults, BigDecimal.valueOf(32));
    }

    @Test
    public void getNWindSpeed() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillResults = service.windChillInCelsius(BigDecimal.valueOf(32), BigDecimal.valueOf(12));
        assertEquals("the windchill conversions to celsius failed", windChillResults, BigDecimal.valueOf(27.7156));
    }

    @Test
    public void getNFahrenheit() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillFahrenheitResults = service.windChillInFahrenheit(BigDecimal.valueOf(23), BigDecimal.valueOf(10));
        assertEquals("the windchill fahranheit conversion failed", windChillFahrenheitResults, BigDecimal.valueOf(5.369));
    }

}
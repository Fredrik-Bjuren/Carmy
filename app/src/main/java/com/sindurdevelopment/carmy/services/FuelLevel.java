package com.sindurdevelopment.carmy.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FuelLevel extends EndPoint {
    public FuelLevel() throws MalformedURLException {
    }

    public com.sindurdevelopment.carmy.responsemodels.fuellevel.FuelLevel getFuelLevel() throws IOException, InterruptedException {
        return objectMapper.readValue(
                httpRequest.createRequest(VIN +"/fuel"), com.sindurdevelopment.carmy.responsemodels.fuellevel.FuelLevel.class);

    }
}

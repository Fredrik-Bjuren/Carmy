package com.sindurdevelopment.carmy.services;

import java.io.IOException;
import java.net.MalformedURLException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Statistic extends EndPoint {
    public Statistic() throws MalformedURLException {
    }

    public void getStatistics() throws IOException {
//        Temperature temperature = objectMapper.readValue(
//                httpRequest(new URL(httpBaseAdress +
//   check sedan fixa statics                    currentVehicle.getVIN() + "/statistics")), Temperature.class);
    }
}

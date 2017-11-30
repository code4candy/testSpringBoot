package com.example.demo.services;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.Assert.*;

public class DataServiceTest {

    @Autowired
    private DataService dataService;

    @Before
    public void setUp() throws IOException {
        dataService = new DataService();
        dataService.loadCarsFromJson();
    }

    @Test
    public void readValue() throws IOException {

        Assert.assertThat(dataService.getCarMap().size(), Is.is(2));
    }

}
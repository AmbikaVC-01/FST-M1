package com.example.fst_m1_Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "FEATURES",
	glue = {"Step_Definitions"},
    tags = "@SimpleAlert",
    plugin = {"html: test-reports"},
    monochrome = true
)


	public class Activity6Runner {
}

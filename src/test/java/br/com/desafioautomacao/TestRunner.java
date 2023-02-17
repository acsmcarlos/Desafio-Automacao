package br.com.desafioautomacao;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"junit:DesafioResults.xml"},
		monochrome = true,
//		tags = "@CT002",
		features = "src/test/resources/features",
		glue= {"br.com.desafioautomacao"})
public class TestRunner {

}

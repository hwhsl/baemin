package baemin.common;


import baemin.StoreOwnerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { StoreOwnerApplication.class })
public class CucumberSpingConfiguration {
    
}

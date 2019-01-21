package com.rajesh.checkoutmanagement.services;

import com.rajesh.checkoutmanagement.CheckoutmanagementApplication;
import com.rajesh.checkoutmanagement.services.BillGenerationService;
import com.rajesh.checkoutmanagement.services.DisplayBillService;
import com.rajesh.checkoutmanagement.beans.BillDetailsBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CheckoutmanagementApplication.class)
@Profile("test")
public class CheckoutmanagementApplicationTests {

    @Autowired
    BillGenerationService billGenerationService;
    @Autowired
    DisplayBillService displayBillService;

	@Test
	public void contextLoads() {
        billGenerationService.addToBill(null, new BillDetailsBean());
        assert true;
	}

    @Test
    public void displayService() {
        displayBillService.display(new BillDetailsBean());
        assert true;
    }

}


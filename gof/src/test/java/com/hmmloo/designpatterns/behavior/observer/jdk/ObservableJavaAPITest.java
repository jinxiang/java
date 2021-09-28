package com.hmmloo.designpatterns.behavior.observer.jdk;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ObservableJavaAPITest {
    @Test
    public void testObserver() throws Exception {
        Product product = new Product("L340 Digital Camera", new BigDecimal(325));
        Bidder bidder1 = new Bidder("Shally Ferguson");
        Bidder bidder2 = new Bidder("Dwayne Bravo");
        Bidder bidder3 = new Bidder("Craig Dawson");
        product.addObserver(bidder1);
        product.addObserver(bidder2);
        product.addObserver(bidder3);
        product.setBidAmount(bidder1, new BigDecimal(350));
        product.deleteObserver(bidder2);
        product.setBidAmount(bidder3, new BigDecimal(375));
    }
}
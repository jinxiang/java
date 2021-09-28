package com.hmmloo.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportGeneratorImplProxyTest {
    @Test
    public void testGenerateReport() throws Exception {
        Role accessRole = new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("Pdf", 150);
        proxy.generateComplexReport("Pdf", 150);
        proxy.generateSensitiveReport();
    }
}
package com.hmmloo.designpatterns.structural.proxy;

public class ReportGeneratorImplProxy implements ReportGenerator {
    private final Role accessRole;
    private ReportGenerator reportGenerator;

    public ReportGeneratorImplProxy(Role accessRole) {
        this.accessRole = accessRole;
    }

    @Override
    public void displayReportTemplate(String reportFormat, int reportEntries) {
        System.out.println("ReportGeneratorImplProxy: Displaying blank report template in " + reportFormat + " format with " + reportEntries + " entries");
    }

    @Override
    public void generateComplexReport(String reportFormat, int reportEntries) {
        if (reportGenerator == null)
            reportGenerator = new ReportGeneratorImpl();
        reportGenerator.generateComplexReport(reportFormat, reportEntries);
    }

    @Override
    public void generateSensitiveReport() {
        if (accessRole.getRole().equals("Manager")) {
            if (reportGenerator == null)
                reportGenerator = new ReportGeneratorImpl();
            reportGenerator.generateSensitiveReport();
        } else {
            System.out.println("You are not authorized to access sensitive reports.");
        }
    }
}

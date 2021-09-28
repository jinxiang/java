package com.hmmloo.designpatterns.structural.adapter;

public class CsvAdapterImpl implements TextFormattable{
    private final CsvFormattable csvFormattable;

    public CsvAdapterImpl(CsvFormattable csvFormattable) {
        this.csvFormattable = csvFormattable;
    }

    @Override
    public String formatText(String text) {
        String formattedText=csvFormattable.formatCsvText(text);
        return formattedText;
    }
}

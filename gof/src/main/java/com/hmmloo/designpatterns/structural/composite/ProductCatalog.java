package com.hmmloo.designpatterns.structural.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class ProductCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    private final String name;

    public ProductCatalog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        for (CatalogComponent comp : items) {
            comp.print();
        }
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }
}

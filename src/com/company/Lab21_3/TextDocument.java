package com.company.Lab21_3;

public  class TextDocument implements IDocument {
    private String document;

    public TextDocument() {
        this.document = "Text document!";
    }

    public String infoDocument() {
        return document;
    }
}
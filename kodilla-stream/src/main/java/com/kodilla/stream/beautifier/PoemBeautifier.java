package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String beautify = poemDecorator.decorate(text);
        System.out.println(beautify);
    }
}

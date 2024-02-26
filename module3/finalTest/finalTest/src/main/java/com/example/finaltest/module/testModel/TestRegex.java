package com.example.finaltest.module.testModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    private final Pattern pattern;

    public TestRegex(String regexPattern) {
        this.pattern = Pattern.compile(regexPattern);
    }

    public boolean matches(String input) {
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public String getMatchedText(String input) {
        Matcher matcher = pattern.matcher(input);
        return matcher.find() ? matcher.group() : null;
    }
}

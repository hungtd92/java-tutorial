package com.example.demo.passwordgenerator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.RandomStringUtils;

public final class PasswordGenerator {

  private final int minLength;
  private final int numberOfDigits;
  private final int numberOfSpecialChars;
  private final int numberOfUpperCaseChars;
  private final int numberOfLowerCaseChars;

  private PasswordGenerator() {
    throw new UnsupportedOperationException("Empty constructor is not supported.");
  }

  private PasswordGenerator(PasswordGeneratorBuilder builder) {
    this.minLength = builder.minLength;
    this.numberOfDigits = builder.numberOfDigits;
    this.numberOfSpecialChars = builder.numberOfSpecialChars;
    this.numberOfUpperCaseChars = builder.numberOfUpperCaseChars;
    this.numberOfLowerCaseChars = builder.numberOfLowerCaseChars;
  }

  public static class PasswordGeneratorBuilder {

    private int minLength;
    private int numberOfDigits;
    private int numberOfSpecialChars;
    private int numberOfUpperCaseChars;
    private int numberOfLowerCaseChars;

    public PasswordGeneratorBuilder() {
      this.minLength = 8;
      this.numberOfDigits = 1;
      this.numberOfSpecialChars = 1;
      this.numberOfUpperCaseChars = 1;
      this.numberOfLowerCaseChars = 1;
    }

    public PasswordGenerator.PasswordGeneratorBuilder minLength(int minLength) {
      this.minLength = minLength;
      return this;
    }

    public PasswordGenerator.PasswordGeneratorBuilder numberOfLowerCaseChars(
        int numberOfLowerCaseChars) {
      this.numberOfLowerCaseChars = numberOfLowerCaseChars;
      return this;
    }

    public PasswordGenerator.PasswordGeneratorBuilder numberOfUpperCaseChars(
        int numberOfUpperCaseChars) {
      this.numberOfUpperCaseChars = numberOfUpperCaseChars;
      return this;
    }

    public PasswordGenerator.PasswordGeneratorBuilder numberOfDigits(int numberOfDigits) {
      this.numberOfDigits = numberOfDigits;
      return this;
    }

    public PasswordGenerator.PasswordGeneratorBuilder numberOfSpecialChars(
        int numberOfSpecialChars) {
      this.numberOfSpecialChars = numberOfSpecialChars;
      return this;
    }

    public PasswordGenerator build() {
      return new PasswordGenerator(this);
    }
  }

  public String generate() {
    // generate a string of upper case letters having length 2
    String upperCaseStr =
        RandomStringUtils.random(this.numberOfUpperCaseChars, 65, 90, true, true);

    // generate a string of lower case letters having length 2
    String lowerCaseStr =
        RandomStringUtils.random(this.numberOfLowerCaseChars, 97, 122, true, true);

    // generate a string of numeric letters having length 2
    String numbersStr = RandomStringUtils.randomNumeric(this.numberOfDigits);

    // generate a string of special chars having length 2
    String specialCharStr =
        RandomStringUtils.random(this.numberOfSpecialChars, 33, 47, false, false);

    // generate a string of alphanumeric letters having length 2
    String totalCharsStr =
        RandomStringUtils.randomAlphanumeric(
            minLength
                - (numberOfDigits
                    + numberOfSpecialChars
                    + numberOfLowerCaseChars
                    + numberOfUpperCaseChars));

    // concatenate all the strings into a single one
    String demoPassword =
        upperCaseStr
            .concat(numbersStr)
            .concat(lowerCaseStr)
            .concat(specialCharStr)
            .concat(totalCharsStr);

    // create a list of Char that stores all the characters, numbers and special characters
    List<Character> listOfChar =
        demoPassword.chars().mapToObj(data -> (char) data).collect(Collectors.toList());

    // use shuffle() method of the Collections to shuffle the list elements
    Collections.shuffle(listOfChar);

    // generate a random string(secure password) by using list stream() method and collect() method
    String password =
        listOfChar.stream()
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();

    // return RandomStringGenerator password to the main() method
    return password;
  }
}

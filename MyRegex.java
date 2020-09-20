

// for hackerrank java regex problem, https://www.hackerrank.com/challenges/java-regex/problem
// Challenge idea: "Write a class called MyRegex which will contain a string pattern.
// "You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address"

class MyRegex {
    String from0To255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
    public String pattern = String.format("%s.%s.%s.%s", from0To255, from0To255, from0To255, from0To255);

}


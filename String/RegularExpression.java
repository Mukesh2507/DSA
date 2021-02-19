package com.String;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* A regular expression is sequence of character
which is available in java.util.regex
in this two class are available
1 pattern-A pattern object is a compiled representation of regular expression
2 matcher - A matcher object is the engine that interprets the pattern and performs match operation again an input string
patternSyntaxException unchecked exception
^ begin
$ matches the end line
 */
public class RegularExpression {


    public static void main(String[] args) {
        Pattern p = Pattern.compile(".m");
        Matcher m = p.matcher(".am");
        Boolean b =m.matches();
        System.out.println(b);
       // boolean b = Pattern.matches(".m",".am");
        System.out.println(b);
        System.out.println(Pattern.matches("[amn]","acd"));
        System.out.println(Pattern.matches("[^amn]]","c"));
        System.out.println(Pattern.matches("[a-zA-S]","T"));
        System.out.println(Pattern.matches("[MS][a-z]{5}","Monica"));
        System.out.println(Pattern.matches("[xyz]?","x"));
        System.out.println(Pattern.matches("[xyz]+","x"));
        System.out.println(Pattern.matches("[xyz]*=","xyyzo"));
        System.out.println(Pattern.matches("\\d","1"));
        System.out.println(Pattern.matches("\\D","1"));
    }
}

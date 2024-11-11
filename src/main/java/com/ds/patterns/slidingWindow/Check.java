package com.ds.patterns.slidingWindow;

public class Check {
    public static void main(String[] args){

        String value = "S;C;OrangeHighlighter";

        char operation = value.charAt(0);
        char details = value.charAt(2);
        String fro = "";
        if(operation == 'S' && details == 'C'){
            String results = value.substring(4);
            String[] splitted = results.split("[A-Z]+");
            //["Orange", "Highliggter"]

//            fro = String.join(" ", results);
            System.out.println(results);
        }
        System.out.println(fro);
    }
}

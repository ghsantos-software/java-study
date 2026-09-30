package org.example.exceptions.error;

public class StackOverFlowErrorTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}

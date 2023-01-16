package org.serf.javacore.lesson_08;

public class WrongInputConsoleParametersException extends Throwable {

    private String message;

    public WrongInputConsoleParametersException(String month) {
        this.message = month;
    }

    public String getMessage() {
        return message;
    }
}

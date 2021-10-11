package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void errorInfo() {
        System.out.print("Error status: " + active);
        System.out.print("; code: " + status);
        System.out.println("; description: " + message);
    }

    public static void main(String[] args) {
        Error syntax = new Error();
        Error overflow = new Error(false, 0, "Buffer overflow");
        Error param = new Error(true, 5, "Parameter high level reached.");
        Error type = new Error(true, 11, "Parameter type mismatch.");
        overflow.errorInfo();
        param.errorInfo();
        type.errorInfo();
        syntax.errorInfo();
    }
}

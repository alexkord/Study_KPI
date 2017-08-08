package ua.kpi.gof_patterns.chain;

public class ChainApp {
    public static void main(String[] args) {

    }
}

class Level {
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
}

abstract class Logger {

}

class SMSLogger extends Logger {

}

class FileLogger extends Logger {

}

class EmailLogger extends Logger {

}
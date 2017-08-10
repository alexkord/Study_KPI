package ua.kpi.gof_patterns.chain;

public class ChainApp {
    public static void main(String[] args) {
        Logger logger0 = new SMSLogger(Level.ERROR);
        Logger logger1 = new FileLogger(Level.DEBUG);
        Logger logger2 = new SMSLogger(Level.INFO);
        logger0.setNext(logger1);
        logger1.setNext(logger2);

        logger0.wrieMessage("Всё хорошо", Level.INFO);
        logger0.wrieMessage("Идёт режим отладки", Level.DEBUG);
        logger0.wrieMessage("Система упала", Level.ERROR);
    }
}

class Level {
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
}

abstract class Logger {
    int priority;

    public Logger(int priority) {
        this.priority = priority;
    }

    Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void wrieMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (next != null) {
            next.wrieMessage(message, level);
        }
    }

    abstract void write(String message);
}

class SMSLogger extends Logger {

    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("СМС: " + message);
    }
}

class FileLogger extends Logger {

    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Записываем в файл: " + message);
    }
}

class EmailLogger extends Logger {

    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("E-mail сообщенике: " + message);
    }
}
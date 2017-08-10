package ua.kpi.gof_patterns.facade;

public class FacadeApp {
    public static void main(String[] args) {
        Power power = new Power();
		power.on();

		DVDRom dvdRom = new DVDRom();
		dvdRom.load();

		HDD hdd = new HDD();
    	hdd.copyFromDVD(dvdRom);

        Computer computer = new Computer();
        computer.copy();
    }
}

class Computer {
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy() {

    }
}

class Power {
    void on() {
        System.out.println("Включение питания");
    }

    void off() {
        System.out.println("Выключение питания");
    }
}

class DVDRom {
    private boolean data;

    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDRom dvdRom) {
        if (dvdRom.hasData()) {
            System.out.println("Происходит копирование данных с диска");
        } else {
            System.out.println("Вставьте диск с данными");
        }
    }
}
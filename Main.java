interface EngineStartable {
    void startEngine();
}

interface Fuelable {
    void isiBahanBakar();
}

interface Rechargeable {
    void isiBaterai();
}

class MobilListrik implements EngineStartable, Rechargeable {
    public void startEngine() {
        System.out.println("Menyalakan sistem mobil listrik.");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik.");
    }
}

class MobilBensin implements EngineStartable, Fuelable {
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin.");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil bensin.");
    }
}

class Sepeda {
    public void gowes() {
        System.out.println("Sepeda dikayuh.");
    }
}
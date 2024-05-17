
package excepciones;


class ExcepcionA extends Exception {
    public ExcepcionA(String message) {
        super(message);
    }
}

class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String message) {
        super(message);
    }
}

class ExcepcionC extends ExcepcionB {
    public ExcepcionC(String message) {
        super(message);
    }
}

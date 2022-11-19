package polymorphism;

class AlertStatus {
    public void alert() {
    }
}

class Info extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("Info");
    }
}

class Warning extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("Warning");
    }
}

class Accept extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("Accept");
    }
}


class Starship {
    AlertStatus a = new Info();

    public void changeWarning() {
        a = new Warning();
    }

    public void changeAccept() {
        a = new Accept();
    }

    public void showAlert() {
        a.alert();
    }

}

public class E16 {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.showAlert();
        starship.changeWarning();
        starship.showAlert();
        starship.changeAccept();
        starship.showAlert();
    }
}

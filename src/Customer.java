public class Customer {
    private String name; //ім'я покупця
    private byte age; //вік покупця
    private double money; //кількість грошей в покупця
    private double outlay; //витрата покупця

    public Customer(String name, byte age, double money, double outlay) { //конструктор
        this.name = name;
        this.age = age;
        this.money = money;
        this.outlay = outlay;
    }

    public String getName() { //геттер для характеристики name
        return name;
    }
    public void setName(String name) { //сеттер для характеристики name. ім'я встановиться тільки якщо змінна name щось зберігає.
        if (name != null) {
            this.name = name;
        }
    }

    public byte getAge() { //геттер для характеристики age
        return age;
    }
    public void setAge(byte age) { //сеттер для характеристики age. вік встановиться тільки якщо він більше або дорівнює 16 та не більше за 100.
        if (age >= 16 && age < 100) {
            this.age = age;
        }
    }

    public double getMoney() { //геттер для характеристики money
        return money;
    }
    public void setMoney(double money) { //сеттер для характеристики money. кількість грошей покупця встановиться тільки якщо вона більша за 0.
        if (money > 0) {
            this.money = money;
        }
    }

    public double getOutlay() { //геттер для характеристики outlay
        return outlay;
    }
    public void setOutlay(double outlay) { //сеттер для характеристики outlay. мінімальна витрата покупця повинна бути більша за 5 включно.
        if (outlay >= 5) {
            this.outlay = outlay;
        }
    }
}
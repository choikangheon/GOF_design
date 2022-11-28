package flyweight.before;

public class Client {
    public static void main(String[] args) {
        Character c1 = new Character('h',"write","Nanum",12);
        Character c2 = new Character('e',"write","Nanum",12);
        Character c3 = new Character('l',"write","Nanum",12);
        Character c4 = new Character('l',"write","Nanum",12);
    }
}

public class main {
    public static void main(String[] args) {
        stationary patient1 = new acut("Mert");
        stationary patient2 = new periodic("Ece");

        medicine m1 = new temperamental("paroş");
        medicine m2 = new temperamental("lacoste");

        nurses melike = new scooters();

        melike.addToBaggage(m1);
        melike.addToBaggage(m2);

        System.out.println(patient1 + " asked for these; " +melike.getBaggage());
        
    }
}

public class Osoba {

    String ime;
    String prezime;
    int brojGodina;

    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }
    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    public static int zbirGodina (int x, int y){
        int zbir = x + y;
    return zbir;
    }

    public static void zbirGodinaIspis(int x, int y) {
                System.out.println("Zbir godina dve osobe je: "+(x+y));
    }

    public static void main() {
        Osoba osoba1 = new Osoba("Andreja","Salim",22);
        System.out.println(osoba1.ime+" "+osoba1.prezime+" "+osoba1.brojGodina);
        Osoba osoba2 = new Osoba("Andrija", "Cvijovic", 37);
        System.out.println(osoba2.ime+" "+osoba2.prezime+" "+osoba2.brojGodina);
        System.out.println("Zbir njihovih godina je: "+zbirGodina(osoba2.brojGodina, osoba1.brojGodina));
        zbirGodinaIspis(osoba1.brojGodina, osoba2.brojGodina);
    }              
}

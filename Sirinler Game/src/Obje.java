
public class Obje {

    public Obje() {
    }

    public static class Altin {

        public static void DoluMu() {
            Dusman gargamel = new Dusman(3, "gargamel", false, 66, "bugrahan", "kral");
            Dusman azman = new Dusman(4, "azman", false, 66, "bugrahan", "kral");
            GozlukluSirin gozluklu = new GozlukluSirin(1, "Gozluklu Sirin", true, 66, "bugrahan", "kral", 38,20);
            TembelSirin tembel = new TembelSirin(2, "Tembel Sirin", true, 66, "bugrahan", "kral", 38,20);
            Altin altin=new Altin();
            altin.getAltin();
            

        }
        private int altin[][] = new int[5][5];

        public int[][] getAltin() {
            return altin;
        }

        public void setAltin(int[][] altin) {
            this.altin = altin;
        }

    }

    public static class Mantar {

        public static void DoluMu() {
            Dusman gargamel = new Dusman(3, "gargamel", false, 66, "bugrahan", "kral");
            Dusman azman = new Dusman(4, "azman", false, 66, "bugrahan", "kral");
            GozlukluSirin gozluklu = new GozlukluSirin(1, "Gozluklu Sirin", true, 66, "bugrahan", "kral", 38,20);
            TembelSirin tembel = new TembelSirin(2, "Tembel Sirin", true, 66, "bugrahan", "kral", 38,20);

            Mantar mantar = new Mantar();
            mantar.getMantar();
            

        }
        private int mantar[][] = new int[1][1];

        public int[][] getMantar() {
            return mantar;
        }

        public void setMantar(int[][] mantar) {
            this.mantar = mantar;
        }
    }
}

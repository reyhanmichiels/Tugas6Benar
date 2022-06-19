package TugasPemlan6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Manusia> list = new ArrayList<>();

        list.add(new Manusia("Aku", "3923842934", true, true));
        list.add(new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018",3.7));
        list.add(new Pekerja("Iqbal Biondy", "351717969", true, true, 9, 20, "195102439283"));
        list.add(new Manajer("Lyre Hertin", "351707384392", false, false, 9, 20, "204837283728",1500));

        list.add(new Manusia("Budi","3174816491", true, true));
        list.add(new MahasiswaFilkom("Raisya", "3172008987", false, false, "215150700111777",3.0));
        list.add(new Pekerja("Fathi", "3175087722", true, true, 12, 24, "511254578700"));
        list.add(new Manajer("Ipul", "3172008960", true, true, 8, 30, "213246764801", 3000));

        list.add(new Manusia("Ucup", "2179078899", true, false));
        list.add(new MahasiswaFilkom("Reyhan", "3172042706", true, false, "215150700111018", 4.0));
        list.add(new Pekerja("Surti", "2144997685", false, false, 9, 25, "2471956395"));
        list.add(new Manajer("Tejo", "2185639500", true, false, 10, 26, "381753509", 2500));

        System.out.println("========================================");
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i).toString());
        }
    }
}

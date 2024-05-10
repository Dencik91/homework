package homework;

public class CoffeeApp {
    public static void main(String[] args) {
        Container cup = new Container();
        cup.setVolume(100);
        System.out.println(cup.toString() + cup.getVolume() + " ml");
        cup.setVolume(50);
        System.out.println(cup.toString() + cup.getVolume() + " ml");
        cup.setVolume(200);
        System.out.println(cup.toString() + cup.getVolume() + " ml");
        cup.setVolume(0);
        System.out.println(cup.toString() + cup.getVolume() + " ml");
        cup.setVolume(137);
        System.out.println(cup.toString() + cup.getVolume() + " ml");
        cup.setVolume(20);
        System.out.println(cup.toString() + cup.getVolume() + " ml");
    }
}
class Container {
    final int maxVolume = 200; //ml
    private int volume = 0;

    public int getVolume() {
        return this.volume;
    }
    public int getMaxVolume() {
        return this.maxVolume;
    }
    public void setVolume(int volume) {
        if (volume > maxVolume || volume < 0) {
            System.err.println("Volume must be positive and less than " + maxVolume);
        } else {
            this.volume = volume;
            System.out.println("Volume set successfully");
        }
    }

    @Override
    public String toString() {
        String cupView = "";
        for (int i = 0; i<5; i++) {
            switch (i) {
                case 0:
                    if (volume == maxVolume) {
                        cupView += "+~~~~~~~~~~+\n";
                    } else {
                        cupView += "+----------+\n";
                    } break;
                case 1:
                    if (volume < maxVolume && volume > (maxVolume / 10 * 6)) {
                        cupView += " \\~~~~~~~~/ \n";
                    } else {
                        cupView += " \\        / \n";
                    } break;
                case 2:
                    if (volume <= (maxVolume / 10 * 6) && volume >= (maxVolume / 10 * 4)) {
                        cupView += "  \\~~~~~~/  \n";
                    } else {
                        cupView += "  \\      /  \n";
                    } break;
                case 3:
                    if (volume < (maxVolume / 10 * 4) && volume > 0) {
                        cupView += "   \\~~~~/   \n";
                    } else {
                        cupView += "   \\    /   \n";
                    } break;
                case 4:
                        cupView += "    \\__/    \n";
            }
        }

        return cupView;
    }
}

/*
      +----------+
       \        /
        \      /
         \    /
          \__/

 */
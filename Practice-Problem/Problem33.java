interface TvRemote {
    public void channelChange();
}

interface SmartTvRemote extends TvRemote {
    public void openMenu();
}

class Tv implements SmartTvRemote {
    @Override
    public void channelChange() {
        System.out.println("change channel...");
    }

    public void openMenu() {
        System.out.println("opening menu...");
    }
}

public class Problem33 {
    public static void main(String[] args) {
        Tv t = new Tv();

        t.channelChange();
        t.openMenu();
    }
}

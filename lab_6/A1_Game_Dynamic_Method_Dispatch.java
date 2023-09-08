class Game {
    void type() {
        System.out.println("indoor & outdoor games");
    }
}

class Cricket extends Game {
    void type() {
        System.out.println("cricket is an outdoor game");
    }
}

class Chess extends Game {
    void type() {
        System.out.println("chess is an indoor game");
    }
}

class A1_Game_Dynamic_Method_Dispatch {
    public static void main(String args[]) {
        Game g = new Game();
        Cricket cricket = new Cricket();
        Chess chess = new Chess();

        g.type();
        g = cricket;
        g.type();
        g = chess;
        g.type();
    }
}
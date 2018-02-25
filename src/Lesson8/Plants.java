package Lesson8;

public class Plants {
    public enum Color {White, Red, Blue};
    public enum Type {Rosa, Lilia, Pivonia}

    private  int size;
    public   Color color;
    public  Type type;

    public Plants(int size, String color, String type) throws ColorException, TypeException{
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "blue" : return Color.Blue;
            case "red" : return Color.Red;
            case "white" : return Color.White;
            default : throw new ColorException("Input only color blue, red or white");
        }
    }
    private Type typeStrToEnum(String type) throws TypeException{
        switch(type.toLowerCase()){
            case "rosa" : return Type.Rosa;
            case "lilia" : return Type.Lilia;
            case "pivonia" : return Type.Pivonia;
            default : throw new TypeException("Input only type rosa, lilia, pivonia");
        }
    }


    public static void main(String[] args) {
        Plants[] pl = new Plants[5];
        try {
            pl[0] = new Plants(5, "blue", "rosa");
            System.out.println(pl[0]);
            pl[1] = new Plants(8, "white", "lilia");
            System.out.println(pl[1]);
            pl[2] = new Plants(10, "white", "pivonia");
            System.out.println(pl[2]);
            pl[3] = new Plants(115, "yellow", "pivonia");
            System.out.println(pl[3]);
            pl[4] = new Plants(114, "white", "chornobryvets");
            System.out.println(pl[4]);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();
        }
    }

}

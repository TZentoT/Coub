public class Main {

    public static void main(String[] args){

//        R3Vector new1 = new R3Vector(10,0,0);
//        new1.out();
//        new1.sum( new1.sum(new1)).out();
//        R3Vector a = new R3Vector(10,0,0);
//        R3Vector b = new R3Vector(20,10,10);
//        R3Vector.sum(a,b).out();
//        a.scale(4);
//        a.out();
//        a.translate(-10,0,0);
//        a.out();
//        R3Vector.scalarOp(a,b,45);
//        a.vectorOp(b).out();
//        b.vectorOp(a).out();

//        Facet f = new Facet(new R3Vector(0,0,0), new R3Vector(0,1,0), new R3Vector(1,1,0), new R3Vector(1,0,0));
//
//        f.show();
//        f.rotate(0,0,90);
//        System.out.println("Rotate() method" + "\n");
//        f.show();
//        System.out.println("Scale() method" + "\n");
//        f.scale(10);
//        f.show();
//        System.out.println("Translate() method" + "\n");
//        f.translate(5,2,1);
//        f.show();

        Cube c = new Cube();
        c.scale(50);
        c.translate(-25,-25,-25);
        c.rotate(0,0,0);
        Viewer window = new Viewer( c);
    }
}

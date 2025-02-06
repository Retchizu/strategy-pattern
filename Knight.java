public class Knight extends Character {

    public Knight() {
        super(new SwingSword(), new Shield());
    }

    public void defend() {
        new Shield().defend();
        new Dodge().defend();
        new CreateMagic().defend();
    }

}

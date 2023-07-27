abstract class Bird {
  String name = "bird";    
  int size;
  int strength;

  protected abstract void attack();

  public String getName(){
    return name;
  }


}

class Hal extends Bird {
  @Override
  public void attack() {
    // implementation of boomerang attack for Hal object
    System.out.println("boomerang attack for Hal object");
  }

    //If there were any additional methods or fields specific to the Chuck or Hal classes, you wouldn't be able to access them using the Bird reference.
// Other methods 
    public void otherMethod(){
        System.out.println("Other");
    }
}

class Chuck extends Bird {
  @Override
  public void attack() {
    // implementation of speed-up attack for Chuck object
        System.out.println("speed-up attack for Chuck object");

  }
}



public class App {
    public static void main(String[] args) {
        // instantiate Chuck and Hal objects
        Bird chuck = new Chuck();//However, since they are declared as Bird,
                        // they only have access to the methods and fields defined in the Bird class.
        Bird hal = new Hal();

        // call attack method on objects
        chuck.attack(); // Chuck speeds up
        hal.attack(); // hal spins and boomerangs
        
        System.out.println(chuck.getName() + " , " + hal.getName());

        // hal.otherMethod();//not working
        Hal hal2 = new Hal();
        hal2.otherMethod(); // it works

        // this is difference between
        // Bird hal = new Hal(); vs Hal hal = new Hal();
    }
}

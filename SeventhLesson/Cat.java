public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

   public Cat(String name, int appetite){
       this.name=name;
       this.appetite=appetite;
       this.satiety=false;
    }
    public void eat(Plate plate){
        plate.decreaseFood(this);

    }
    String  getName(){
       return name;
    }
    int getAppetite(){
       return appetite;
    }

    boolean getSatiety(){
       return satiety;
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
//Седьмой урок

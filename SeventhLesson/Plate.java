public class Plate {
    private int food;

    public Plate(int food){
        this.food=food;
    }
    public void info(){
        System.out.println(food);
    }
    public void decreaseFood(Cat myCat){
        if (this.food-myCat.getAppetite()>=0){
        this.food-=myCat.getAppetite();
        myCat.setSatiety(true);
        }
        else {
            System.out.println("В тарелке слишком мало корма");

        }
    }
    public void addFood(int food){
        this.food+=food;
        System.out.println("Добавлено "+food+" корма");
        System.out.println("Всего в тарелке "+ this.food+" корма");
    }
}

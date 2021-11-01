public class Main {
    public static void main(String[] args){
        Cat[] myCats = new Cat[3];
        myCats[0]=new Cat("Дуся",30);
        myCats[1]=new Cat("Буся",5);
        myCats[2]=new Cat("Барсик",20);

        Plate myPlate = new Plate(20);
        myPlate.info();
        for (int i=0;i<myCats.length;i++){
        myCats[i].eat(myPlate);
        if (myCats[i].getSatiety()) {
            System.out.println(myCats[i].getName() + " сыт(а)");
        }
        else {System.out.println(myCats[i].getName()+ " просит корм");}
        }
        myPlate.info();

        myPlate.addFood(15);
    }
}
//Седьмой урок
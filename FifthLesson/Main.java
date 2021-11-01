public class Main {
    public static void main(String[] args){
        Employee[] newEmployee = new Employee[5];
        newEmployee[0]=new Employee("Иванов Иван","инженер","ivanov.i@mail.ru","89091112233",100000,50);
        newEmployee[1]=new Employee("Иванов Степан","менеджер","ivanov.s@mail.ru","890922222233",100000,20);
        newEmployee[2]=new Employee("Иванов Андрей","консультант","ivanov.a@mail.ru","89093332233",100000,31);
        newEmployee[3]=new Employee("Иванов Василий","технолог","ivanov.v@mail.ru","89098882233",100000,50);
        newEmployee[4]=new Employee("Иванов Дмитрий","маркетолог","ivanov.d@mail.ru","89095552233",100000,30);

        System.out.println("ФИО сотрудника '"+"Должность '"+"Эл.адрес '"+"Телефон '"+"Зарплата '"+"Возраст '");
        for (int i=0;i<5;i++){
            if(newEmployee[i].age>40){
                newEmployee[i].printEmployee();
            }
        }

    }
}

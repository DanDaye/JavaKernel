//package eight;
//
//import nine.Employee;
//
//public class PairTest3 {
//    public static void main(String[] args){
//        Manager ceo = new Manager("Gus Greedy",800000,2003,12,15);
//        Manager cfo = new Manager("Sid Sneaky",600000,2003,12,15);
//        Pair<Manager> buddies = new Pair<>(ceo,cfo);
//        printBuddies(buddies);
//
//        ceo.setBonus(1000000);
//        cfo.setBonus(500000);
//
//        Manager[] managers = {ceo,cfo};
//
//    }
//    public static void printBuddies(Pair<? extends Employee> p){
//        Employee first = p.getFirst();
//        Employee second = p.getSecond();
//        System.out.println(first.getName()+ " and "+second.getName() + " are buddies");
//
//    }
//
//    public static void minmaxBonus(Manager[] a,Pair<? super  Manager> result){
//        if (a.length == 0) return;
//        Manager min = a[0];
//        Manager max = a[0];
//        for (int i=0;i<a.length;i++){
//            if (min.getBonus()> a[i].getBonus()) min = a[i];
//            if (max.getBonus()< a[i].getBonus()) max = a[i];
//        }
//        result.setFirst(min);
//        result.setSecond(max);
//    }
//
//
//}
//class Manager{
//    private String name;
//    private int salary;
//    private int year;
//    private int month;
//    private int day;
//    Manager(String name,int salary,int year, int month, int day){
//        this.name = name;
//        this.salary = salary;
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//    public void setBonus(int salary){
//        this.salary = salary;
//    }
//
//    public int getBonus() {
//        return this.salary;
//    }
//}
//

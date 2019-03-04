package eight;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(){
        first = null;
        second = null;
    }
    public Pair(T first,T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static <T> Pair<T> makePair(Class<T> c)throws InstantiationException,IllegalAccessException{
        return new Pair<>(c.newInstance(),c.newInstance());
    }

    public static void main(String[] args){
        Pair<String> pair = new Pair<>();
        pair.setFirst("hello");
        pair.setSecond(" world");
        System.out.println(pair.getFirst()+pair.getSecond());
    }
}

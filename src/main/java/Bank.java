import java.util.Hashtable;
import java.util.Objects;

public class Bank {

    private Hashtable<Pair,Integer> rates = new Hashtable<>();

    public Money reduce(Expression source, String to) {
      return source.reduce(this,to);
    }
    int rate(String from, String to){
        if(from.equals(to)) return 1;
      Integer rate = (Integer) rates.get(new Pair(from,to));
      return rate.intValue();
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from,to), new Integer(rate));
    }

    private class Pair{
        private String from;
        private String to;

        public Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return from.equals(pair.from) &&
                    to.equals(pair.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }
    }
}

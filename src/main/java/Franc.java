public class Franc extends Money {

    public Franc(int amount) {
        this.amount=amount;
    }

    public Franc times(int multiplication) {
      return new Franc(amount*multiplication);
    }

}

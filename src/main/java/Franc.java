public class Franc {
    private int amount;
    public Franc(int amount) {
        this.amount=amount;
    }

    public Franc times(int multiplication) {
      return new Franc(amount*multiplication);
    }

    public boolean equals (Object object){
        Franc franc = (Franc) object;
        return franc.amount==amount;
    }
}

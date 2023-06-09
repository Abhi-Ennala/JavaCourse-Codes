class abc{
    private int p;
    public void setP(int p){
        this.p = p;
    }
    public int getP(){
        return p;
    }
}

public class Prvt {
    public static void main(String[] args) {
      abc a = new abc();
      a.setP(1000);
        System.out.println(a.getP());

    }
}

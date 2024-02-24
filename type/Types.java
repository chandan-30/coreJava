package type;
public class Types {
    public Types(){
        System.out.println("Types constructor");
    }

    public int num = 30;
    public String str = "Sai Chandan";
    public boolean bool = true;
    public double dbl = 3.14;
    public float flt = 3.14f;

    public void printTypes() {
        System.out.println(num);
        System.out.println(str);
        System.out.println(bool);
        System.out.println(dbl);
        System.out.println(flt);

    }
}
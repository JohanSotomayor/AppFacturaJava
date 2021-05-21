package model;


public class productos {

private String a;
private String b;

    public productos(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public productos() {
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String pro(){
        
      b=a;
      return b;    
      }
  
    
}

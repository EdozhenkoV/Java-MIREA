package Practic10;

public class Complex  {

 int real;
 int image;
    public Complex(){
    this.real = 0;
    this.image = 0;
}

 public Complex(int real,int image)
 {
     this.real= real;
     this.image = image;
 }

    public int getImage() {
        return image;
    }
    public int getReal() {
        return real;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public void setReal(int real) {
        this.real = real;
    }
    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}

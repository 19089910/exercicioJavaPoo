package rectangle;

public class retangulo {
    public double largurta;
    public double altura;

    public double area(){
        return largurta * altura;
    }
    public double perametro(){
        return 2 * (largurta + altura);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(altura, 2.0) + Math.pow(largurta, 2.0));
    }
}

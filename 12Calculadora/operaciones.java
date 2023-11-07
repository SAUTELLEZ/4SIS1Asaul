

public class operaciones {
    private double num1;
    private double num2;
    public operaciones(){

    }
public operaciones(double num1,double num2){
    this.num1 = num1;
    this.num2 = num2;
}
public double getNum1(){
    return num1;
}
public void setNum1(double num1){
    this.num1 = num1;
}
public double getNum2(){
    return num2;
}
public void setNum2(double num2){
    this.num2 = num2;
}
// vamos a crear los metodos de la calculadora 

public double suma(){
    return num1 + num2;
}
public double producto(){
    return num1 * num2;
}
public double resta(){
    return num1 - num2;
}
public double division(){
    //comprobar que se pude dividir 
    try {
        if (num2==0){
            System.out.println(" no se puede hacer la divicion ");
        }else{
            return num1 /num2;
        }
    } catch (Exception e) {
        System.out.println(" error" + e.getMessage());
    }
    return 0;
}

public double seno(){
    return Math.sin(num1);
}
public double coseno(){
    return Math.cos(num1);
}
public double tangente(){
    return Math.tan(num1);
    
}
public double potencia(){
    return Math.pow(num1, num2);

}
public double raiz(){
    return Math.sqrt(num1);
}

}

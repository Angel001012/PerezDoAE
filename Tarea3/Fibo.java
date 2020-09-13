class Fibo{
    public static void main(String args[]){
        int Valor1=0;
        int Valor2=1;
        int Valor3;
        int i=1;
        System.out.println(Valor1);
        System.out.println(Valor2);
        do
        {
            Valor3=Valor1+Valor2;
            System.out.println(Valor3);
            Valor1=Valor2;
            Valor2=Valor3;
            i=i+1;
        }while(i<10);
    } 
}
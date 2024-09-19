public class App {

    public static void main(String[] args) throws Exception{
        utilizando_static();

        //Instancia de um objeto
        Veiculo v = new Veiculo();

        //chamando variaveis publicas
        v.marca="Ford";
        v.modelo="KA";

        Veiculo v1 = new Veiculo();

        v1.marca="Fiat";
        v1.modelo="Uno";

        final String teste_final;
        teste_final="Meu primeiro valor";


    }

    //===========================================================

    public static void utilizando_static(){
        //chamando variaveis sem a Instancia
        Produto.int1 = 10;
        Produto.int2 = 20;   
    }

    //===========================================================

    public void conversao(){
        String st, st2, st3, st4;
        float real, real2;
        int int1, int2;


        //String para Real
        st = "1.2";
        real = (float) (new Float(st).floatValue());
        System.out.println("\nString para Real: " + real);

        //Real para String
        real2 = 1.3f;
        st2 = new Float(real2).toString();
        System.out.println("Real para String: " + st2);
        // ou
        st2 = String.valueOf(real2);
        //ou
        st2 = "" + real2;
        System.out.println("Real para String: " + st2);

        //String para inteiro
        st3 = "15";
        int1 = Integer.parseInt(st3);
        System.out.println("String para Inteiro: " + int1);

        //Inteiro para String
        int2 = 25;
        st4 = Integer.toString(int2);
        System.out.println("Inteiro para String: " + st4);
        //ou
        st4 = String.valueOf(int2);
        //ou
        st4 = "" + int2;
        System.out.println("Inteiro para String: " + st4);
        
    }
}


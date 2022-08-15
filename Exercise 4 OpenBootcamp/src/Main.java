public class Main {
    public static void main(String[] args) {

        // USANDO UN IF

        int numeroIf = 10;

        if(numeroIf == 0)
        {
            System.out.println("El número es cero");
        }
        else if (numeroIf>0) {

            System.out.println("El número es positivo");
        }
        else{
            System.out.println("El número es negativo");
        }




        //WHILE

        int numeroWhile = 1;

        while(numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }



        //DO WHILE

        int numeroDoWhile = 1;
        do {
            numeroDoWhile ++;
            System.out.println(numeroDoWhile);
        }while (numeroDoWhile < 3);




        //FOR

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++)
        {
            System.out.println(numeroFor);
        }



        //SWITCH

        var estacion = "Otoño";

        switch (estacion)
        {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estación");
        }



    }



}
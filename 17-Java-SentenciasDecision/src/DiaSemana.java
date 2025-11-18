public class DiaSemana
{
    public static void main(String[] args)
    {
        System.out.println("*** Dia de la Semana con Switch ***");
        int dia = 1; // 1 es Lunes, 2 - Martes, etc

        String diaSemana = switch (dia)
        {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia no valido";
        };

        System.out.println(diaSemana);

        // switch (dia)
        // {
        //     case 1:
        //         System.out.println("Lunes");
        //         break;
        //     case 2:
        //         System.out.println("Martes");
        //         break;
        //     case 3:
        //         System.out.println("Miercoles");
        //         break;
        //     case 4:
        //         System.out.println("Jueves");
        //         break;
        //     case 5:
        //         System.out.println("Viernes");
        //         break;
        //     case 6:
        //         System.out.println("Sabado");
        //         break;
        //     case 7:
        //         System.out.println("Domingo");
        //         break;
        //     default:
        //         System.out.println("Dia no valido");
        //         // break;
        // }
    }
}

public class ReservaHoteles
{
    public static void main(String[] args)
    {
        System.out.println("*** Reserva Hoteles ***");

        String  clientName;
        int     days;
        double  dayPrice;
        boolean hasSeaView;

        clientName = "Manuel";
        days = 4;
        dayPrice = 1200.0;
        hasSeaView = true;

        System.out.println("Client Name: " + clientName);
        System.out.println("Days: " + days);
        System.out.println("Price: " + dayPrice);
        System.out.println("Have Sea View: " + hasSeaView);

        clientName = "Adriana";
        days = 7;
        dayPrice = 850.50;
        hasSeaView = false;

        System.out.println("\nClient Name: " + clientName);
        System.out.println("Days: " + days);
        System.out.println("Price: " + dayPrice);
        System.out.println("Have Sea View: " + hasSeaView);
    }
}

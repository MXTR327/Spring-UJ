import java.util.Locale;

public class GeneradorEmails
{
    public static void main(String[] args)
    {
        // Nombre completo
        String fullName = "Max RQ";

        // Procesar o normalizar el nombre de usuario
        // Limpiar los espacios en blanco al inicio y al final
        String normalizedFullName = fullName.strip();
        // Reemplazar los espacios en blanco por punto
        normalizedFullName = normalizedFullName.replace(" ", ".");
        // Convertimos a minusculas
        normalizedFullName = normalizedFullName.toLowerCase();

        // Datos de la empresa
        String company         = "MXtr Services";
        String domainExtension = ".com.pe";

        // Quitar espacios en blanco y convertir a minusculas
        String normalizedCompany     = company.strip().replace(" ", "").toLowerCase();
        String domainEmailNormalized = "@" + normalizedCompany + domainExtension;

        System.out.println("*** Generador de Email ***");
        System.out.println("Nombre usuario: " + fullName);
        System.out.println("Nombre usuario normalizado: " + normalizedFullName);
        System.out.println();

        System.out.println("Nombre empresa: " + company);
        System.out.println("Extension del dominio: " + domainExtension);
        System.out.println("Dominio de email normalizado: " + domainEmailNormalized);
        System.out.println();

        // Creamos el email final
        String normalizedEmail = normalizedFullName + domainEmailNormalized;
        System.out.println("Email final generado: " + normalizedEmail);
    }
}

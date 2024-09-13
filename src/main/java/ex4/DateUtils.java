package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * Formate une date selon le motif spécifié.
     *
     * @param pattern le motif de formatage
     * @param date    la date à formater
     * @return la date formatée en chaîne de caractères
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * Formate une date en utilisant le motif de formatage par défaut.
     *
     * @param date la date à formater
     * @return la date formatée en chaîne de caractères
     */
    public static String formatDefaut(Date date) {
        return format("dd/MM/yyyy HH:mm:ss", date);
    }
}
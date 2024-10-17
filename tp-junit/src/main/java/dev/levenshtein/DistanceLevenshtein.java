package dev.levenshtein;

public class DistanceLevenshtein {

    public int calculerDistance(CharSequence mot1, CharSequence mot2) {
        // Vérification du premier paramètre
        if (mot1 == null || mot1.length() == 0) {
            throw new AppException("le premier paramètre ne peut être null ou vide");
        }

        // Vérification du second paramètre
        if (mot2 == null || mot2.length() == 0) {
            throw new AppException("le second paramètre ne peut être null ou vide");
        }

        int len0 = mot1.length() + 1;
        int len1 = mot2.length() + 1;
        int[] cost = new int[len0];
        int[] newcost = new int[len0];

        for (int i = 0; i < len0; i++) {
            cost[i] = i;
        }

        for (int j = 1; j < len1; j++) {
            newcost[0] = j;
            for (int i = 1; i < len0; i++) {
                int match = (mot1.charAt(i - 1) == mot2.charAt(j - 1)) ? 0 : 1;
                int costReplace = cost[i - 1] + match;
                int costInsert = cost[i] + 1;
                int costDelete = newcost[i - 1] + 1;
                newcost[i] = Math.min(Math.min(costInsert, costDelete), costReplace);
            }
            int[] swap = cost;
            cost = newcost;
            newcost = swap;
        }

        return cost[len0 - 1];
    }
}
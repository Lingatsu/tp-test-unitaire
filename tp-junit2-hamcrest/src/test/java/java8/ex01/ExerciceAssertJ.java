package java8.ex01;

import java8.data.Data;
import java8.data.domain.Pizza;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.*;

/**
 * Assertions AssertJ
 */
public class ExerciceAssertJ {

    @Test
    public void test_is() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        Boolean result = pizzas.stream().anyMatch(p -> p.getPrice() >= 1300);

        // Valider que result vaut true avec AssertJ
        assertThat(result).isTrue();
    }

    @Test
    public void test_hasSize() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        List<Pizza> result = pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(toList());

        // Valider que result a 3 éléments avec AssertJ
        assertThat(result).hasSize(3);
    }

    @Test
    public void test_hasProperty() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        Pizza result = pizzas.stream().max(Comparator.comparing(Pizza::getPrice)).orElseThrow();

        // Valider que result a la propriété name qui vaut "La Cannibale" avec AssertJ
        assertThat(result).hasFieldOrPropertyWithValue("name", "La Cannibale");
    }

    @Test
    public void test_everyItem() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        List<Pizza> result = pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(toList());

        // Valider que tous les objets Pizza de la liste result ont un prix >= 1300 avec AssertJ
        assertThat(result).allMatch(pizza -> pizza.getPrice() >= 1300);
    }
}
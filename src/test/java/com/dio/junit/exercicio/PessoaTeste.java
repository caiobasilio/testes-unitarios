package com.dio.junit.exercicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;
import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void deveraCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000, 1, 9));
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @Test
    void conferirSeMaiorDeIdade() {
        Pessoa john = new Pessoa("John", LocalDate.of(2000, 1, 9));
        Assertions.assertTrue(john.ehMaiorDeIdade());
    }

}

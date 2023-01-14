package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.*;

public class InstituicaoTest {

    @Test
    public void deveMostrarQualSeguroOferecerBanco(){
        Banco banco = new Banco();
        InstituicaoVisitor visitor = new InstituicaoVisitor();

        assertEquals("Deve vender seguro contra roubo", visitor.exibir(banco));
    }
    @Test
    public void deveMostrarQualSeguroOferecerCondominio(){
        Condominio condominio = new Condominio();
        InstituicaoVisitor visitor = new InstituicaoVisitor();

        assertEquals("Deve vender seguros médicos", visitor.exibir(condominio));
    }
    @Test
    public void deveMostrarQualSeguroOferecerCafeteria(){
        Cafeteria cafeteria = new Cafeteria();
        InstituicaoVisitor visitor = new InstituicaoVisitor();

        assertEquals("Deve vender seguro contra incêndios e enchentes", visitor.exibir(cafeteria));
    }
    
}

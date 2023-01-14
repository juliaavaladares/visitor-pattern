package main;

public interface Visitor {

    String venderSeguroCondominio(Condominio condominio);
    String venderSeguroBanco(Banco banco);
    String venderSeguroCafeteria(Cafeteria cafeteria);
}

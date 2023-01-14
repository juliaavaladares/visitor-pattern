package main;

public class Condominio implements Instituicao {

    public Condominio() {
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.venderSeguroCondominio(this);
    }
    
}

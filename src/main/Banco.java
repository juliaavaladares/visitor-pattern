package main;

public class Banco implements Instituicao{

    public Banco() {
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.venderSeguroBanco(this);
    }
    
}

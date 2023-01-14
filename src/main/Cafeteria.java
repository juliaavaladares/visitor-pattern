package main;

public class Cafeteria implements Instituicao{

    public Cafeteria() {
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.venderSeguroCafeteria(this);
    }
    
}

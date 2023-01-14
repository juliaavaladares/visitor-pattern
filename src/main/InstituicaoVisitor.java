package main;

public class InstituicaoVisitor implements Visitor{
    
    public String exibir(Instituicao instituicao) {
        return instituicao.aceitar(this);
    }
    @Override
    public String venderSeguroCondominio(Condominio condominio) {
        return "Deve vender seguros médicos";
    }

    @Override
    public String venderSeguroBanco(Banco banco) {
        return "Deve vender seguro contra roubo";
    }

    @Override
    public String venderSeguroCafeteria(Cafeteria cafeteria) {
        return "Deve vender seguro contra incêndios e enchentes";
    }
    
}

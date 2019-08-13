package rn.senac.rn.agenda.repository;

import rn.senac.rn.agenda.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class ContatoRepository {

    private static List<Contato> contatos = new ArrayList<Contato>();

    public void salva(Contato contato){
        contatos.add(contato);
        Long id = Long.valueOf(contatos.size());
        contato.setId(id);
    }

    public List<Contato> buscaTodos(){
        return contatos;
    }


}

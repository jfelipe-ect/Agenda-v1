package rn.senac.rn.agenda;

import rn.senac.rn.agenda.model.Contato;
import rn.senac.rn.agenda.repository.ContatoRepository;

import java.util.List;

public class TestaPrograma {

    public static void main(String[] args) {

        ContatoRepository bancoDeDados = new ContatoRepository();

        Contato jota = new Contato("Jota Lopes", "9999-8888");

        bancoDeDados.salva(jota);

        Contato filipe = new Contato("Filipe Pontes", "8888-6666");

        Contato michele = new Contato("Michele Gebara", "8888-6666");

        bancoDeDados.salva(michele);

        bancoDeDados.salva(filipe);

        List<Contato> contatos = bancoDeDados.buscaTodos();

        for (Contato contato : contatos){
            System.out.println(contato.getId() + " - " + contato.getNome());
        }

    }

}

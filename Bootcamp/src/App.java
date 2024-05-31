import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Santander 2024 - Backend com Java", 
        "Aprenda desde os primeiros passos com Java partindo da sintaxe básica até a implementação de uma API utilizando Spring para se tornar um profissional atrativo no mercado.", 
        LocalDate.of(2024, 5, 31), LocalDate.of(2024, 06, 25));

        Mentoria mentoria = new Mentoria("A Importância da Lógica no Dia a Dia de Profissionais de Tecnologia", 
        "Nessa mentoria exploraremos o papel crucial do pensamento lógico na tecnologia, focando em como ele aprimora a codificação, solução de problemas e análise crítica.", 
        LocalDate.of(2024, 5, 9));

        Mentoria mentoria2 = new Mentoria("Teste", "Teste", LocalDate.of(2024, 5, 31));

        AtividadeCurso atividadeCurso = new AtividadeCurso("Abstraindo um Bootcamp Usando Orientação a Objetos em Java", 
        "Desmistifique a Programação Orientada a Objetos (POO) com Java e pratique esse conceito fundamental nesse desafio.", 
        2);

        AtividadeCurso atividadeCurso2 = new AtividadeCurso("Teste", "Teste", 2);

        Dev dev = new Dev("Ébert");

        bootcamp.adicionarMentoria(mentoria);
        bootcamp.adicionarAtividadeCurso(atividadeCurso);
        dev.inscreverNoBootcamp(bootcamp);
        dev.exibirCursos();
        dev.progredirAtividadeCurso(atividadeCurso);
        dev.progredirMentoria(mentoria);
        dev.progredirAtividadeCurso(atividadeCurso2);
        dev.progredirMentoria(mentoria2);
    }
}

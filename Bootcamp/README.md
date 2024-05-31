# Abstraindo um Bootcamp Usando Orientação a Objetos em Java

Esse projeto trata a implementação do domínio de um bootcamp, com mentorias, atividades/cursos e desenvolvedores participantes, para treinar o paradigma da orientação a objetos em Java.

## Como Executar

1. Realize o download ou clone do repositório base
2. Entre na pasta src
3. Compile o arquivo App.java pela IDE ou Editor de Texto de sua preferência (recomendo Eclipse ou Visual Studio Code)

## Como Usar

1. Entre na pasta src
2. Abra o arquivo App.java
3. Use os construtores e métodos públicos das classes Bootcamp, AtividadeCurso, Mentoria e Dev.
- Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal)
  - adicionarMentoria(Mentoria mentoria)
  - adicionarAtividadeCurso(AtividadeCurso atividadeCurso)
- AtividadeCurso(String titulo, String descricao, int cargaHoraria)
- Mentoria(String titulo, String descricao, LocalDate data)
- Dev(String nome)
  - inscreverNoBootcamp(Bootcamp bootcamp)
  - progredirAtividadeCurso(AtividadeCurso atividadeCurso)
  - progredirMentoria(Mentoria mentoria)
  - exibirMentorias()
  - exibirCursos()
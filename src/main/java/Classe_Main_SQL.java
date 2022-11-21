import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Classe_Main_SQL {

    public static void main(String[] args) {
        Instant data_nascimento_autor1 = LocalDateTime.parse("1975-03-10t20:30:00").toInstant(ZoneOffset.UTC);
        Instant data_nascimento_autor2 = LocalDateTime.parse("1960-10-10t20:30:00").toInstant(ZoneOffset.UTC);
        Instant data_nascimento_autor3 = LocalDateTime.parse("1950-02-10t20:30:00").toInstant(ZoneOffset.UTC);
        Instant data_nascimento_autor4 = LocalDateTime.parse("1930-12-30t20:30:00").toInstant(ZoneOffset.UTC);
        Instant data_nascimento_autor5 = LocalDateTime.parse("1965-01-10t20:30:00").toInstant(ZoneOffset.UTC);

        Autor autor = new Autor("Mendes", "Sá", data_nascimento_autor1, 251);
        Autor autor1 = new Autor("Fred", "Smith", data_nascimento_autor5, 239);
        Autor autor2 = new Autor("Teodoro", "March", data_nascimento_autor5, 249);
        Autor autor3 = new Autor("Marina", "Silva", data_nascimento_autor5, 240);

        Instant data_publicacao = LocalDateTime.parse("1990-05-25t20:30:00").toInstant(ZoneOffset.UTC);

        Livro livro = new Livro("Mundo java novo", autor1, data_publicacao, 1, 1, 519);
        Livro livro1 = new Livro("Banco  2023", autor1, data_publicacao, 1, 1, 513);
        Livro livro2 = new Livro(" Android 2023", autor, data_publicacao, 1, 1, 514);
        Livro livro3 = new Livro(" Android New", autor, data_publicacao, 1, 1, 528);

        //livro.Print_Livro();// aqui imprime os livros cadastrados no banco

        Funcoes_SQL insert = new Funcoes_SQL();

        //XXXX AQUI é feito um SELECT de livro do banco mysql -- 100% testado
        //insert.Comando_Select();

        //XXXX Aqui insere Livros no banco de dados mysql.-- 100 testado

        //insert.Inserir_Livros(livro);

        //XXXXX Aqui atualiza dados do Livro no banco mysql. -- 100%testado

        //insert.Atualiza_Livros(livro);

        //XXXXX Aqui exclui livros no banco de dados mysql -- 100% testado

        //insert.Exclui_Livro(521);

        // XXXXX Aqui seleciona um livro no banco ao escolher um numero de ID -- 100% testado
        // insert.Seleciona_um_Livro();

        //XXXXX Aqui seleciona todos os livros de um autor ao escolher o ID do autor -- 100% testado

        // insert.Seleciona_TodosLivros_Autor();

        //XXXXX Aqui insere um autor no Banco mysql -- 100% testado

        // insert.Incluir_Autor(autor);

        //XXXX Aqui atualizada dados do Autor no Banco mysql -- 100% testado

        // insert.Update_Autor(autor2);

        Input_Dados_Autor input_autor = new Input_Dados_Autor();//CADASTRA UM AUTOR NO BANCO -- 100% testado
        //input_autor.Inserir_Autor();

        Input_Dados_Endereco novo_endereco = new Input_Dados_Endereco();// CADASTRA UM ENDEREÇO NO BANCO -- 100% testado
        //novo_endereco.Inserir_Dados_Endereco();

        Pesquisa_LivroBanco mostra_livro = new Pesquisa_LivroBanco();// PESQUISA LIVRO NO BANCO -- 100% testado
        //mostra_livro.Seleciona_LivroBanco();

    }
}

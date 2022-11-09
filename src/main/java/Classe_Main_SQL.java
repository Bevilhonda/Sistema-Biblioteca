import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Classe_Main_SQL {

    public static void main(String[] args) {

        Instant data_nascimento_autor5 = LocalDateTime.parse("1965-01-10t20:30:00").toInstant(ZoneOffset.UTC);

        Autor autor = new Autor("Fabio", "Fonseca", data_nascimento_autor5, 252);
        Autor autor1 = new Autor("Fred", "Smith", data_nascimento_autor5, 239);
        Autor autor2 = new Autor("Teodoro", "March", data_nascimento_autor5, 237);
        Autor autor3 = new Autor("Marina", "Silva", data_nascimento_autor5, 240);

        Instant data_publicacao = LocalDateTime.parse("1990-05-25t20:30:00").toInstant(ZoneOffset.UTC);

        Livro livro = new Livro("Java e html 2023", autor1, data_publicacao, 1, 1, 512);
        Livro livro1 = new Livro("Banco  2023", autor1, data_publicacao, 1, 1, 513);
        Livro livro2 = new Livro(" Android 2023", autor, data_publicacao, 1, 1, 514);
        Livro livro3 = new Livro(" Android New", autor, data_publicacao, 1, 1, 528);

        //livro.Print_Livro();// aqui imprime os livros cadastrados no banco

        Funcoes_SQL insert = new Funcoes_SQL();

        //XXXX Aqui insere Livros no banco de dados mysql.

        //insert.Inserir_Livros(livro);

        //XXXXX Aqui atualiza dados do Livro no banco mysql.

        //insert.Atualiza_Livros(livro);

        //XXXXX Aqui exclui livros no banco de dados mysql

         //insert.Exclui_Livro(523);

        //XXXXX Aqui insere autores no Banco mysql

         //insert.Incluir_Autor(autor);

        //XXXX Aqui atualizada dados do Autor no Banco mysql

        //insert.Update_Autor(autor);

        //XXXX AQUI é feito um SELECT de livro do banco mysql
        //insert.Comando_Select();

        Input_Dados_Autor input_autor = new Input_Dados_Autor();//CADASTRA UM AUTOR NO BANCO
        //input_autor.Input_Dados_Autor();

        Input_Dados_Endereco novo_endereco = new Input_Dados_Endereco();// CADASTRA UM ENDEREÇO NO BANCO
        //novo_endereco.Input_Dados_Endereco();

        Pesquisa_LivroBanco mostra_livro = new Pesquisa_LivroBanco();// PESQUISA LIVRO NO BANCO
        //mostra_livro.Pesquisa_LivroBanco();


    }
}

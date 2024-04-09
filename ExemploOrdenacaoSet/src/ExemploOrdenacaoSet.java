import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) throws Exception {

        System.out.println("--\tOrdem inserção\t--");













        class Serie implements Comparable<Serie>{
            private String nome;
            private String genero;
            private Integer tempoEpisodio;

            public Serie(String nome, String genero, Integer tempoEpisodio){
                this.nome = nome;
                this.genero = genero;
                this.tempoEpisodio = tempoEpisodio;
            }

            public String getNome(){
                return nome;
            }

            public String getGenero(){
                return genero;
            }

            public Integer getTempoEpisodio(){
                return tempoEpisodio;
            }

            @Override
            public String toString(){
                return "{" +
                        "nome='" + nome +'\'' +
                        ", genero='" + genero +'\'' +
                        ", tempoEpisodio=" + tempoEpisodio + 
                        '}';
            }
            }

        }
        
        
    }


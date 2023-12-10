// minoruyamanaka RGM: 31095976
package com.example.cidi;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textFrase;
    private ImageView imagemFrase;
    private Button mudarFrase;

    private String[] frases = {
            // Suas frases aqui...

            "01 – O Mensageiro \n" +
                    "Como primeira carta, O Mensageiro simboliza ciclos que se iniciam, ação, movimento, velocidade e determinação, como sair da zona de conforto e traz mensagens no curto prazo.\n" +
                    "\n" +
                    "Outros nomes para essa carta: Cavaleiro.\n" +
                    "\n" +
                    "Não faz muito sentido essa denominação, pois trata-se de um entregador (Courier) e não um combatente, então a nomenclatura Mensageiro é mais propícia.",

            "2 – O Trevo ou Os Obstáculos \n" +
                    "A lâmina 02 tem significados diferentes de acordo com as escolas.\n" +
                    "\n" +
                    "Na escola Europeia: Trevo\n" +
                    "Na escola Brasileira: Obstáculos\n" +
                    "A sorte a qual os Obstáculos se refere é correspondente a livramento, não de achar coisas boas na rua, como dinheiro, por exemplo.\n" +
                    "\n" +
                    "É sobre aceitar o processo de entender porquê passamos por determinada situação e agradecermos o livramento da mesma.\n" +
                    "\n" +
                    "É entender, muitas vezes, que livramento também é sorte. ",

            "03 – O Navio \n" +
                    "\n" +
                    "Essa carta fala sobre notícias que vêm à longo prazo; viagens; intercâmbio; comércio; inércia; peso.\n" +
                    "\n" +
                    "O Navio também é sobre alinhar o mental (ar, naipe de Espadas) com o emocional (água, naipe de Copas).\n" +
                    "\n" +
                    "É preciso que cabeça e coração estejam alinhados como o vento e as velas do navio. ",

            "04 – A Casa \n" +
                    "\n" +
                    "Essa carta pode falar da vida pessoal, da família; ou, numa leitura mais simplória, de uma casa ou qualquer tipo de imóvel como investimento.\n" +
                    "\n" +
                    "Fcunciona como um “oposto complementar” da carta do Jardim, que simboliza a vida social.",

            "05 – A Árvore \n" +
                    "\n" +
                    "Há muitos significados para esta carta; contudo, todas convergem para a energia da Árvore.\n" +
                    "\n" +
                    "Em jogadas como a Mesa Real, simboliza a carta da saúde.\n" +
                    "\n" +
                    "É sobre árvore genealógica, conhecimento ancestral, antepassados, estrutura, raiz, profundidade, natureza, terapias naturais, vida, fertilidade, crescimento, solidez, evolução.",

            "06 – As Nuvens \n" +
                    "\n" +
                    "Esta carta simboliza a sensação de incerteza, confusão mental e emocional, indecisão.\n" +
                    "\n" +
                    "Também pode significar nostalgia, incapacidade e depressão.\n" +
                    "\n" +
                    "As nuvens, eventualmente, passam, e o sol brilha novamente, por mais longa que seja a tempestade.",

            "07 – A Cobra ou A Serpente\n" +
                    "\n" +
                    "Esta é uma carta de polaridade negativa, representando intriga, traição, sabotagem e falsidade.\n" +
                    "\n" +
                    "Pode indicar alguém que planeja trair ou que já efetou a traição, de fato.\n" +
                    "\n" +
                    "É fundamental o autoconhecimento para não ser vítima do ego, sempre entendendo que a cobra pode ser, também, a própria consulente se traindo.\n" +
                    "\n" +
                    "É uma carta de difícil interpretação, mas que pode servir de grande ajuda na solução de problemas.\n" +
                    "\n" +
                    "Na prática, seu positivo é um “menos negativo”, ou seja, relação com sexualidade acentuada e pouco ou nenhum sentimento. Tem a ver com traições e promiscuidade.\n" +
                    "\n" +
                    "Pode-se falar, também, da energia Kundalini, associada à Serpente.",

            "08 – O Caixão \n" +
                    "\n" +
                    "Na prática é neutra, apesar de, na polaridade, ser uma carta negativa.\n" +
                    "\n" +
                    "As cartas neutras são as secundárias, ou seja, mais facilmente influenciáveis.\n" +
                    "\n" +
                    "Significa morte, mas de maneira simbólica, representando um novo ciclo.\n" +
                    "\n" +
                    "Quando um ciclo se encerra, outro se inicia e a transformação derivada pode ser positiva, se não há medo de mudanças.",

            "09 – As Flores ou O Buquê \n" +
                    "Uma das cartas mais positivas do jogo, fala de alegria, realizações, plenitude, sucesso, harmonia, oportunidades, beleza estética, sendo ótima para perguntas sobre relacionamentos.",

            "10 – A Foice\n" +
                    "\n" +
                    "A foice também fala de fim de ciclos, mas como um corte rápido e brusco.\n" +
                    "\n" +
                    "Numa pergunta objetiva, quando retira-se uma carta e sai a foice, grandes são as chances de ser uma resposta negativa sobre a pergunta da consulente.\n" +
                    "\n" +
                    "Em síntese, o lado positivo deste arcano é a possibilidade de colher coisas boas baseadas nas coisas boas que você plantou. Caso contrário, já sabe a resposta.",

            "11 – O Chicote \n" +
                    "\n" +
                    "Na prática é uma carta neutra, de polaridade negativa, tratando-se de um arcano de força e imposição de limites.\n" +
                    "\n" +
                    "Se na mão do consulente, o resultado é positivo. Se na mão de terceiros, negativo, pois, neste caso, a consulente que é a dominada e limitada, tendo que obedecer.\n" +
                    "\n" +
                    "Fala sobre padrões de repetição: comportamentais, mentais, emocionais, financeiros etc.",

            "12 – Os Pássaros\n" +
                    "\n" +
                    "Carta de polaridade positiva. Contudo, na prática, percebi que tende para o negativo, como ansiedade, agitação, confusão, instabilidade, imprevisibilidade, fofoca e maledicência.\n" +
                    "\n" +
                    "No positivo é sobre respeitar o par amoroso, como os passarinhos que fazem o ninho juntos.",

            "13- A Criança \n" +
                    "\n" +
                    "Esta carta fala sobre a espontaneidade e inocência da criança, podendo referir-se à criança interior, que precisa de cura.\n" +
                    "\n" +
                    "Combinada à carta da Cegonha pode indicar gravidez.\n" +
                    "\n" +
                    "É relativa ao comportamento da criança, imaturo, que por vezes pode estar presente em adultos.\n" +
                    "\n" +
                    "No viés positivo simboliza a pureza da criança que, ainda não tem o ego desenvolvido e não se deixa levar pelo mesmo.\n" +
                    "\n" +
                    "Também se refere ao olhar de encanto da criança, que enxerga a beleza onde, muitas vezes, o adulto não a vê.",

            "14 – A Raposa \n" +
                    "\n" +
                    "Carta predominantemente negativa, fala sobre comportamentos manipuladores.\n" +
                    "\n" +
                    "No viés positivo fala de estratégia, cautela e precaução.",

            "15 – O Urso \n" +
                    "\n" +
                    "A carta do Urso possui vários significados; contudo, no final sempre converge para a energia do Urso.\n" +
                    "\n" +
                    "Em relação à relacionamentos é negativa: fala sobre pessoas que são “atrasos de vida”.\n" +
                    "\n" +
                    "Também indica pessoas superprotetoras e dominadoras, possivelmente em relacionamentos abusivos.\n" +
                    "\n" +
                    "Na área profissional: referente às atividades autônomas, onde é preciso ter coragem para realizar suas tarefas, principalmente no início da carreira.\n" +
                    "\n" +
                    "Na área de finanças: significa poupança, reserva financeira ou investimentos.",

            "16 – A Estrela \n" +
                    "\n" +
                    "A carta da Estrela também é conhecida como A Sorte.\n" +
                    "\n" +
                    "Fala de espiritualidade, intuição, sonhos, planos, futuro esperançoso, ligação espiritual em relacionamentos (relações kármicas ou almas gêmeas).\n" +
                    "\n" +
                    "No viés negativo: fala de pessoas com ego forte, que se sentem superiores aos outros.\n" +
                    "\n" +
                    "No geral aconselha buscar a sua espiritualidade.",

            "17 – A Cegonha/Garça\n" +
                    " \n" +
                    "A carta da Cegonha é positiva, podendo trazer surpresas agradáveis e oportunidades.\n" +
                    "\n" +
                    "Combinada à carta da Criança pode indicar gravidez.\n" +
                    "\n" +
                    " ",

            "18 – O Cachorro \n" +
                    "\n" +
                    "Esta carta representa amizade e lealdade.\n" +
                    "\n" +
                    "Sobre perguntas de relacionamentos é positiva e raramente é negativa.",

            "19 – A Torre \n" +
                    "\n" +
                    "No viés negativo: solidão, mal estar em estar sozinha.\n" +
                    "\n" +
                    "No viés positivo: solitude, autoconhecimento, espiritualidade.\n" +
                    "\n" +
                    "Olhar a situação de longe, afastando-se do recorte que é limitado aos detalhes e vislumbrar assim a figura maior, geral. Subir, erguer-se a certa altura, para poder enxergar mais longe, e assim vislumbrar novos horizontes, novas possibilidades.\n" +
                    "\n" +
                    "A Torre também fala das instituições públicas: hospitais, universidades, escolas, bancos, órgãos governamentais (INSS, Receita Federal, etc.) e os próprios governos e governantes, de todas as esferas: municipal, estadual e federal, serviços de emergência (polícia, bombeiro, SAMU).\n" +
                    "\n" +
                    "Se combinada à Casa ou a Cruz sugere templo ou centro religioso.",

            "20 – O Jardim \n" +
                    "\n" +
                    "Referente à grupos sociais, lugares abertos, diversidade, cultura de povos.",

            "21 – A Montanha \n" +
                    "\n" +
                    "Carta sempre negativa que fala de dificuldades, desafios, bloqueios, demoras.\n" +
                    "\n" +
                    "Em perguntas objetivas ela sempre irá puxar para baixo as cartas vizinhas.",

            "22 – Os Caminhos\n" +
                    "\n" +
                    "Carta neutra que varia de acordo com algumas autoras, podendo ser chamada de Caminho, simbolizando uma única direção, no singular.\n" +
                    "\n" +
                    "Também há outra interpretação, onde é referida como Caminhosss ou Os Caminhos, dando a ideia de uma bifurcação ou mais de um caminho para a consulente escolher.\n" +
                    "\n" +
                    "No passado: uma decisão que a consulente já trilha há algum tempo.\n" +
                    "\n" +
                    "No presente e futuro: decisão importante que irá impactar o resto de sua vida.",

            "23 – O Rato \n" +
                    "\n" +
                    "Carta negativa, referente à desgaste físico, mental, emocional e financeiro.\n" +
                    "\n" +
                    "No viés positivo pode significar trabalho em equipe.",

            "24 – Coração \n" +
                    "\n" +
                    "Carta que simboliza a Paixão, não o amor; portanto, significa o efêmero que pode transformar-se em rancor ou ódio.\n" +
                    "\n" +
                    "Seu significado irá depender das cartas vizinhas.",

            "25 – O Anel \n" +
                    "\n" +
                    "Esta carta fala de relacionamentos com propósito e parcerias, seja de ordem profissional, familiar ou afetiva.\n" +
                    "\n" +
                    " ",

            "26 – Os Livros\n" +
                    "\n" +
                    "Carta relacionada ao estudo e aprendizado, podendo ser marcada com a carta do trabalho.\n" +
                    "\n" +
                    "No viés negativo: segredo, informação oculta.",

            "27 – A Carta \n" +
                    "\n" +
                    "Referente à notícias que estão por vir, documentos ou qualquer tipo de papel oficial.",

            "28 – O Cigano \n" +
                    "\n" +
                    "Carta neutra na leitura individual, representando a energia masculina.\n" +
                    "\n" +
                    "Pode ser um mentor, guia espiritual, orixá, anjo de guarda, um cigano etc.\n" +
                    "\n" +
                    "Seu significado dependerá das cartas vizinhas.\n" +
                    "\n" +
                    "Pode significar força, ação, Yang, Sagrado Masculino, estes queridos falecidos e familiares masculinos.\n" +
                    "\n" +
                    "Também é chamada de O Homem ou O Cavalheiro.\n" +
                    "\n" +
                    " ",

            "29 – A Cigana\n" +
                    "\n" +
                    "Carta neutra com energia feminina.\n" +
                    "\n" +
                    "Pode ser a Pombagira, mentora espiritual, orixá, anjo de guarda, mestre ascencionada, a própria Cigana da consulente etc.\n" +
                    "\n" +
                    "Simboliza o Sagrado Feminino, Yin, acolhimento, fertilidade, maternidade, calma, intuição, entes queridos no plano espiritual e familiares femininas.\n" +
                    "\n" +
                    "Também chamada de A Mulher ou A Dama.",

            "30 – Os Lírios \n" +
                    "\n" +
                    "Significa paz interior, tranquilidade, maturidade, espiritualidade, pureza sexual (virgindade), pessoa de mais idade ou frieza e indiferença.",

            "31 – O Sol \n" +
                    "\n" +
                    "Carta positiva, fala de sucesso e abundância, revelações, sucesso.\n" +
                    "\n" +
                    "Representa a energia masculina, Yang, energia, potência, consciência e autoridade.",

            "32 – A Lua \n" +
                    "\n" +
                    "Representa pessoas que fingem ser o que não são para agradar terceiros.\n" +
                    "\n" +
                    "Pode falar de romance, Sagrado Feminino, ciclo lunar da mulher, bruxaria, ocultismo, introspecção, meditação, mundo interior, sonhos, pesadelos, subconsciente/inconsciente.",

            "33 – A Chave \n" +
                    "\n" +
                    "Carta super positiva, fala de soluções, resolução de questões, pendências. \n" +
                    "\n" +
                    "Abre portas e fala sobre liberdade de escolha.",

            "34 – O Peixe \n" +
                    "\n" +
                    "Carta neutra. Ao lado do Sol significa sucesso financeiro, ao lado dos Ratos significa prejuízo.",

            "35 – A Âncora \n" +
                    "\n" +
                    "Viés positivo: significa segurança, firmeza, autoconfiança.\n" +
                    "\n" +
                    "No viés negativo: apego, estagnação.\n" +
                    "\n" +
                    "Alguns a consideram a carta do trabalho.",

            "36 – A Cruz\n" +
                    "\n" +
                    "Representa sacrifícios, pena, castigo, espiritualidade religiosa.\n" +
                    "\n" +
                    "Associada à Casa ou Torre simboliza templo ou centro religioso.",


    };

    private int[] imagens = {
            // Seus IDs de recursos de imagens aqui...

            R.drawable.cavalheiro,
            R.drawable.trevo,
            R.drawable.navio,
            R.drawable.casa,
            R.drawable.arvore,
            R.drawable.nuvens,
            R.drawable.cobra,
            R.drawable.caixao,
            R.drawable.flores,
            R.drawable.foice,
            R.drawable.chicote,
            R.drawable.passaros,
            R.drawable.crianca,
            R.drawable.raposa,
            R.drawable.urso,
            R.drawable.estrela,
            R.drawable.cegonha,
            R.drawable.cachorro,
            R.drawable.torre,
            R.drawable.jardim,
            R.drawable.montanha,
            R.drawable.caminho,
            R.drawable.rato,
            R.drawable.coracao,
            R.drawable.anel,
            R.drawable.livro,
            R.drawable.carta,
            R.drawable.cigano,
            R.drawable.cigana,
            R.drawable.lirio,
            R.drawable.sol,
            R.drawable.lua,
            R.drawable.chave,
            R.drawable.peixe,
            R.drawable.ancora,
            R.drawable.cruz



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa os elementos da interface do usuário
        textFrase = findViewById(R.id.textFrase);
        imagemFrase = findViewById(R.id.imagemFrase);
        mudarFrase = findViewById(R.id.mudarFrase);

        // Adiciona a capacidade de rolagem ao TextView
        textFrase.setMovementMethod(new ScrollingMovementMethod());
    }

    public void mudarFrase(View view) {
        // Gere um número aleatório para selecionar uma frase
        int indiceAleatorio = new Random().nextInt(frases.length);

        // Atualize o texto da TextView com a frase selecionada
        textFrase.setText(frases[indiceAleatorio]);

        // Atualize a imagem usando o ID de recurso correspondente à frase
        imagemFrase.setImageResource(imagens[indiceAleatorio]);
    }
}

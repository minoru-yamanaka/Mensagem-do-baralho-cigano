# Mensagem do baralho cigano

Este código é uma implementação de uma aplicação Android simples que exibe frases associadas a cartas de tarô.

1. **Estrutura da Aplicação:**
   - O código está organizado em uma classe chamada `MainActivity`, que é uma atividade principal em aplicativos Android.
   - Há um layout associado a esta atividade, definido em um arquivo XML chamado `activity_main.xml`.

2. **Elementos da Interface do Usuário:**
   - A interface do usuário consiste em um `TextView` para exibir as frases, uma `ImageView` para exibir imagens associadas às frases e um `Button` para acionar a mudança de frases.

3. **Recursos de Texto e Imagem:**
   - As frases estão armazenadas em um array de strings chamado `frases`.
   - Cada frase tem uma imagem associada, cujos IDs de recursos estão armazenados no array `imagens`.

4. **Método `onCreate`:**
   - No método `onCreate`, os elementos da interface do usuário são inicializados usando `findViewById`.
   - O método `setMovementMethod` é usado para adicionar a capacidade de rolagem ao `TextView`.

5. **Método `mudarFrase`:**
   - O método `mudarFrase` é chamado quando o botão é clicado.
   - Ele gera um número aleatório para selecionar uma frase e, em seguida, atualiza o texto do `TextView` e a imagem usando o índice aleatório.

6. **Imagens e Strings:**
   - Imagens estão associadas a frases usando índices correspondentes em arrays.
   - As frases são longas e detalhadas, fornecendo informações sobre as cartas de tarô e suas interpretações.

7. **Considerações Finais:**
   - A aplicação é simples, mas pode ser estendida para incluir mais recursos, como animações, interações adicionais ou até mesmo uma abordagem mais avançada de leitura de tarô.

Este código é específico para o ambiente de desenvolvimento Android usando a linguagem Java e o framework Android SDK. Ele cria uma aplicação básica para fornecer informações sobre cartas de tarô de forma interativa.

![baralhohome](imgHome.png)

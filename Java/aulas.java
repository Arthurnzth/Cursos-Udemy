/*
# Switch-case:
*   switch(){
*       case val1:
*           --- ---;
*           break;
*       case val2:
*           --- ---;
*           break;
*       default:
*           --- ---;
*           break;
*   }

# Expressão ternária:
*   (condição)?val_true:val_false;

# Operadores bitwise:
!   faz operação binária com os números, bit a bit, considerando 0 como false e 1 como true
?   & -> Operação "e" bit a bit
?   | -> Operação "ou" bit a bit
?   ^ -> Operação "ou-exclusivo/xor" bit a bit

# Funções para String:
    - Formatar: toLowerCase(), toUpperCase(), trim() -> maiúsculo/minúsculo e remover espaços
    - Recortar: substring(início), substring(início, fim)
    - Substituir: Replace(char, char), Replace(string, string)
    - Buscar: IndexOf, LastIndexOf -> posição de algo na string
?   - str.Split(" ")

# Criando funções:
*   public -> para que a função fique disponível em outras classes
*   static -> para que a função possa ser chamada independente de se criar um objeto
*   declarar o tipo do valor que a função vai retornar 
*   nome da função
*   (parâmetros da função) -> quais os dados que a função recebe de entrada
!   return var;

! ==================================================================================================================================================== !

##### PROGRAMAÇÃO ORIENTADA A OBJETOS #####
*   Classe:
    - é um tipo estrudutado que pode conter (membros):
        * Atributos (dados/campos)
        * Métodos (funções/operações)
    - a classe tbm pode prover muitos outros recursos, tais como:
        * Construtores
        * Sobrecarga
        * Encapsulamento
        * Herança
        * Polimorfismo
    ! CADA CLASSE É RESPONSÁVEL POR SI MESMA -> coesão
*   this -> auto referencia para o objeto (this.x)

*   Object:
/       * getClass -> retorna o tipo do objeto
/       * equals -> compara se o objeto é igual ao outro
/       * hashCode -> retorna um código hash do objeto
;       * toString -> converto o objeto para string

# Membros estáticos (membros de classe =/= membros e instância):
    * fazem sentido independentemente de objetos
    * ñ precisam de objeto para serem chamados, são chamados a partir do próprio nome da classe
    ? Aplicações comuns: 
        - classes utilitárias 
        - declaração de constantes
    * Uma classe que possui somente membros estáticos, pode ser uma classe estática, não poderá ser instanciada

# Contrutores:
    uma operação especial da classe. que executa no momento da instanciação do objeto
    evita que crie obejtos vazios que na verdade precisam estar preenchidas necessariamente com certos valores
    * iniciar valores dos atributos
    * permitir ou obrigar que o objeto receba dados/dependências no momento de sua instanciação (INJEÇÃO DE DEPENDÊNCIA)
    * possível especificar mais de um construtor na mesma classe --> SOBRECARGA

# this:
    referência para o próprio objeto
    * diferenciar atributos de variáveis locais
?   * passar o próprio objeto como argumento na chamada de um método ou construtor

# Sobrecarga:
    recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros

# Encapsulamento:
    * esconder detalhes de implementação de uma calsse, expondo apenas operações seguras e que mantenham os objetos em um estado consistente
#   REGRA DE OURO: o objeto deve sempre estar em um estado consistente, e a própria classse deve garantir isso
    * regra geral básica:
        um objeto NÃO deve expor nenhum atributo (modigicador de acesso private)
        os atributos dever ser acessados por meio de métodos get e set

# Modificadores de acesso:
/   * private: o membro só pode ser acessado na própria classe
    * (nada): o membro só pode ser acessado nas classes do mesmo pacote
    * protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
/   * public: o membro é acessado por todas as classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está)

! ==================================================================================================================================================== !

# Tipos referência vs Tipos valor:
    * classes são tipos referência -> devem ser entendidas como ponteiros para caixas, e não caixas em si (referências/endereços)
    * caso uma variável cujo tipo é classe receber outra variável tipo classe, ela passa a apontar para o mesmo endereço de memória
    * tipos referência aceitam valor "null"
    * alocar (new) qualquer tipo estruturado (classe ou array) atribui valores padrão:
/       * números: 0
/       * boolean: false
/       * char: caractere código 0
/       * objeto: null
*/
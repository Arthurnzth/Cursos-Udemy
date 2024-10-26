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

# Boxing:
    * é o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível
    int x = 20;
    Object obj = x;

# Unboxing:
    * é o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível
    int x = 20;
    Object obj = x;
    int y = (int)obj;

# Wrapper classes
    * são calsses equivalentes aos tipos primitivos
/   * boxing e unboxing é natural na linguagem
!   * uso comum: campos de entidades em sistemas de informação
        * tipos referência (classes) aceitam valor null e usufruem dos recursos OO
?   Object{
#       Number{
            byte -> Byte
            short -> Short
            int -> Integer
            long -> Long
            float -> Float
            double -> Double
#       }
        boolean -> Boolean
        char -> Character
?   }

# for each:
*   for(Tipo apelido:coleção){
*       --- ---;
*       --- ---;
*       sysout(apelido);
*   }

! ==================================================================================================================================================== !

# LISTAS:

    * homogênea
    * ordenada
    * inicia vazia e seus elementos são alocados sob demanda
    * cada elemento ocupa um "nó" (ou nodo) da lista
    * tipo(interface): List
    * classes que implementam: ArrayList, LinkedList, etc.

    tamanho da lista: size()
    inserir elemento na lista: add(obj), add(int, obj)
    remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
    encontrar posição de elemento: indexOf(ojb), lastIndexOf(obj)
    filtrar lista com base em precidao:
        List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
    encontrar primeira ocorrência com base em predicado:
        Integer result = list.stream(.filter(x -> x > 4).findFirst().orElse(null));

# MATRIZ:

    * arranjo bidimensional

! ==================================================================================================================================================== !

# Data-hora e duração

    - Data-[hora] local:
        ano-mês-dia-[hora] sem fuso horário
        [hora] opicional
        * LocalDate
        * LocalDateTime
    - Data-hora global:
        ano-mês-dia-hora com fuso horário
        * Instant
    - Duração:
        tempo decorrido entre duas data-horas
        * Duration
    - Outros
        * ZoneId
        * ChronoUnit

    Padrão ISO 8601

    Data-[hora] local:
        2022-07-21
        2022-07-21T14:52
        2022-07-21T14:52:09
        2022-07-21T14:52:09.4073
    Data-hora global:
        2022-07-23T14:52:09Z
        2022-07-23T14:52:09.254935Z
        2022-07-23T14:52:09-03:00

    -Instanciação:
        - (agora) -> Data-hora
        - Texto ISO 8601 -> Data-hora
        - Texto formato customizado -> Data-hora
        - dia, mês, ano, [horário] -> Data-hora local

    -Formatação:
        - Data-hora -> Texto ISO 8601
        - Data-hora -> Texto formato customizado

    -Obter dados de uma data-hora local
        - Data-hora local -> dia, mês, ano, horário

    -Converter data-hora global para local
        - Data-hora global, timezone (sistema local) -> Data-hora local

    -Cálculos com data-hora
        - Data-hora +/- tempo -> Data-hora
        - Data-hora 1, Data-hora 2 -> Duração

! ==================================================================================================================================================== !

# ENUMERAÇÕES

- é um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
* palavra chave: enum
- melhor semântica, código mais legível e auxiliado pelo compilador

# COMPOSIÇÃO

- é um tipo de associação que permite que um objeto contenha outro
* relação "tem-um" ou "tem-vários"
- organização, coesão, flixibilidade, reuso

! ==================================================================================================================================================== !

# HERANÇA E POLIMORFISMO

# HERANÇA

- é um tipo de associação que permite que uma classe herde todos dados e comportamentos de outra
* class A extends B (A herda B)
* relação "é-um"
- generalização/especialização
- superclasse (classe base) / subclasse (classe derivada)
- herança / extensão
* heraça é uma associação entre classes (e não entre objetos)

# UPCASTING
* casting da subcalsse para superclasse
- uso comum: polimorfismo
# DOWNCASTING
* casting da superclasse para subclasse
- palavra instanceof
- uso comum: métodos que recebem parâmetros genéricos (ex: Equals)

# SOBREPOSIÇÃO OU SOBRESCRITA
- é a implementação de um método de uma superclasse na subcalsse
* @Override
* super

? final -> evita que a classe seja herdada / evita que o método seja sobreposto

# POLIMORFISMO
- recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes, tendo comprtamentos
diferentes conforme cada tipo específico
* associação - upcasting (tempo de execução)

# CLASSES ABSTRATAS
- classes que não podem ser instanciadas
* é uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata

# METODOS ABSTRATOS
- métodos que não possuem implementação
- quando a calsse é genérica demais para conter sua implementação
- se uma classe possui pelo menos um método abstrato, então ela também é abstrata

# TRATAMENTO DE EXCESSÕES
* estrutura try-cath:
try {

}
catch (ExceptionType e) {

}
finaly {

}
? UML - italico

# TRABALHANDO COM ARQUIVOS
- File: Representação abstrata de um arquivo e seu caminho
- Scanner: Leitor de texto
- IOException (Exception)
- FileReader: strem de leitura de caracteres a partir de arquivos
- BufferedReader 
* try-with-resources: try () {} catch () {}
- FileWriter
- BufferedWriter
- File::isDirectory (pasta)
- File::isFile (arquivo)
* new File(path + "\\x").mkdir(); -> bool

# INTERFACES
- define um conjunto de operações que uma classe deve implementar
* contrato que a classe deve cumprir
? para criar sistemas com baixo acoplamento e flexíveis

# INTERFACE COMPARABLE
* public interface Comparable<T> {
*     int compareTo(T o);
* }

# DEFAULT METHODS
* evitar repetição de implementação em toda classe que implemente a interface
*/
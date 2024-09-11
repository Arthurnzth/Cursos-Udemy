# para fazer comentario em python usar "#"


"""
DocString usa 3 aspas
"""


#? FUNÇÃO PRINT:
#* sep = separador dos argumentos
#* end = final de linha
#! por padrão sep = " " e end = "\n"
print(1, 2, 3, sep=" - ", end="\n")
print(4, 6, 6, sep=" - ", end="\r\n")
print(7, 8, 9, sep=" - ", end="\n")


#? TIPOS DE VARIÁVEL:
#! tipagem Dinâmica / Forte
#* String -> str (dentro de "" ou '')
#* Números inteiros -> int
#* Números decimais -> float
#* classe type -> retorna o tipo da variável
#! tudo em python é um objeto (possui classes e da pra criar classes)
#* Boolean -> bool (True / False)
print(type("Hello World!"), type(0), type(0.25), type(False))


#? OPERADORES:
#? Lógicos: (retornam um valor Boolean)
#* == -> compara igualdade entre 2 valores
# 
#? Aritméticos:
# + -> adição
# - -> subtração
# multiplicação -> *
#? Concatenação e Repetição:


#? CONVERSÃO / COERÇÃO / TYPECASTING / COERCION:
# classe para fazer coerção dos tipos
print(int("7")+3)
#* int + float = float
print(float("4")+6)
#* str vazia = False; != True
print(bool(" "))


#? print formatado / string formatada / interpolação
nome = "Arthur Abade Nazareth"
altura = 1.73
peso = 57
imc = peso/(altura**2)
texto = f'{nome} tem {altura:.2f},\npesa {peso} quilos e seu imc é\n{imc:.2f}'
print(texto)
a = 'A'
b = 'B'
c = 1.1
string = 'a={} b={} c={:.2f}'.format(a, b, c) # usar indices permite usar mais vezes
print(string)
texto = '%s tem %.2f,\npesa %i quilos e seu imc é\n%.2f' % (nome, altura, peso, imc)
# s - string, d e i - int, f - float, x e X - hexadecimal
# %08x -> hexadecimal com 8 casas
# (char)(><^)(quantidade)
# > - esquerda
# < - direita
# ^ - centro
print(f'{1500.597:0=+10,.2f}')


#? fatiamento
# [i:f:p] [::] -> p(passo): pula de p em p caracteres
nome = nome[4:8:1]
print(len(nome[2])) # conta quantos caracteres tem uma variavel


#? input / coleta de dados
numero_1 = int(input('Digite um número: ')) # -> sempre no tipo str
numero_2 = input('Digite outro número: ')
int_numero_2 = int(numero_2)
print(f'A soma dos números é: {numero_1 + int_numero_2}')


#? if / elif / else
entrada = input('Você quer "entrar" ou "sair"? ')
if entrada == 'entrar':
    print('Você entrou no sistema')
elif entrada == 'sair':
    print('Você saiu do sistema')
else:
    print('Você não digitou nem "entrar" e nem "sair"')


#? Operadores relacionais e lógicos
# ==, !=, >=, <=, >, <
# and, or, not
# and -> falsy (0, 0.0, '', False)


#? Exercicio:
print('Exercício:')
nome = input('Digite seu nome: ') or 'Sem nome'
idade = input('Digite sua idade: ') or 'Sem idade'
if nome != 'Sem nome' and idade != 'Sem idade':
    print(f'Seu nome é {nome}')
    print(f'Seu nome invertido é {nome[::-1]}')
    if ' ' in nome:
        print(f'O nome {nome} contém espaços')
    else:
        print(f'O nome {nome} não contém espaços')
    print(f'A primeira letra do seu nome é {nome[0]}')
    print(f'A última letra do seu nome é {nome[-1]}')
else:
    print('Desculpe, você deixou campos vazios')


#? Introdução try/except
# try -> tentar executar o código
# except -> ocorreu algum erro ao tentar executar


#? Extrutura de repetição:
cont = 0
while cont < 10:
    cont += 1
    print(cont)
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


# ?print formatado / string formatada
nome = "Arthur Abade Nazareth"
altura = 1.73
peso = 57
imc = peso/(altura**2)
texto = f'{nome} tem {altura:.2f},\npesa {peso} quilos e seu imc é\n{imc:.2f}'
print(texto)